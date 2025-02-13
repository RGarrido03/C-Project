#!/bin/bash
#
# Miguel Oliveira e Silva (mos@ua.pt), 2017-2024

IFS=$'\n'

scriptName="$0"
target="java"
sourceExt="java"
sourceExt2=""
objExt="class"

function help() {
   echo "Usage: $scriptName [-h | -help | -cpp | -python | -java] [-i | --input input] [grammar]"
   echo ""
   echo "   Cleans automatically generated antlr4 files considering target language."
   echo ""
   echo "   target language:"
   echo "       -java:   java (default)"
   echo "       -cpp:    c++"
   echo "       -python: python3"
   echo ""
   echo "   grammar argument is the name of the grammar (if present, extension .g4 is ignored)."
   exit 1
}

function process() {
   if [ -e ${1} ]; then
      g="$1"
   elif [ -e ${1}.g4 ]; then
      g=${1}.g4
   elif [ -e ${1}Parser.g4 ]; then
      g=${1}.g4
   else
      echo "ERROR: internal error!"
      exit -1
   fi
   echo "Processing $g"
   if [[ -e $g && -f $g ]]; then
      echo "Removing $g files:"
      name=${g%.g4}
      if [ -n "$input" ]; then
         cd $input
      fi
      rm -fv $name.tokens $name.interp ${name}Lexer.interp ${name}BaseListener.$sourceExt ${name}Listener.$sourceExt ${name}BaseVisitor.$sourceExt ${name}Visitor.$sourceExt ${name}Lexer.tokens ${name}Lexer.$sourceExt ${name}Parser.$sourceExt
      if [ ! -z "$objExt" ]; then
         rm -fv ${name}BaseListener.$sourceExt2 ${name}Listener.$sourceExt2 ${name}BaseVisitor.$sourceExt2 ${name}Visitor.$sourceExt2 ${name}Lexer.$sourceExt2 ${name}Parser.$sourceExt2
      fi
      if [[ "$name" = *Parser || "$name" = *Lexer ]]; then
         rm -fv $name.$sourceExt
      fi
      if [[ "$target" = "cpp" && -e ${name}Main ]]; then
         rm -fv ${name}Main
      fi
      if [[ "$target" = "python" ]]; then
         cacheDir=$(dirname $g)/__pycache__
         [[ -e $cacheDir ]] && rm -rfv $(dirname $g)/__pycache__
      fi
      if [ -n "$input" ]; then
         cd ..
      fi
   fi
}

case $1 in
"") ;;
-h | -help)
   help
   ;;
-i | --input)
   shift
   input=$1
   shift
   ;;
-cpp | -c++)
   target="cpp"
   sourceExt="cpp"
   sourceExt2="h"
   objExt="o"
   shift
   ;;
-python | -python3)
   target="python"
   sourceExt="py"
   objExt=""
   shift
   ;;
-java)
   shift
   ;;
-*)
   echo "ERROR: invalid argument!"
   echo ""
   help
   ;;
esac

if [ ! -z "$objExt" ]; then
   # clean objExt files:
   echo "Removing *.$objExt files:"
   find . -name \*.$objExt -printf "removing %p\n" -exec rm -f {} \;
fi

if ! [ -z $1 ]; then
   target_grammar=${1/.g4/}
   if ! [ -f ${target_grammar}.g4 ]; then
      if ! [ -f ${target_grammar}Parser.g4 ]; then
         echo "ERROR: grammar file \"${target_grammar}.g4\" does not exist!"
         exit 2
      fi
   fi
   process $target_grammar
   exit 0
fi

# clean antlr4 generated .java files:
for g in $(find . -name \*.g4); do
   process $g
done
