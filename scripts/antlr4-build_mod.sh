#!/bin/bash
#
# Miguel Oliveira e Silva (mos@ua.pt), 2017-2024

IFS=$'\n'

scriptName="$0"
target="java"

function help() {
   echo "Usage: $scriptName [-h | -help | -cpp | -python | -java] [-o | --output output] [grammar]"
   echo ""
   echo "   Finds all existing *.g4 grammars in current directory or in subdirectories and,"
   echo "   if no grammar argument exists, and if successful and if applicable, compiles the"
   echo "   generated target language code."
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
   echo "Finding the annoying .antlr folder"
   find . -name .antlr -type d -exec rm -rf {} \;
   g="$1"
   echo "Processing $g"
   if [ -e ${g}.g4 ]; then
      grammar=${g}.g4
   elif [ -e ${g}Parser.g4 ]; then
      grammar=${g}Parser.g4
   else
      echo "ERROR: internal error!"
      exit -1
   fi
   case $target in
   java)
      if [ -n "${output}" ]; then outpath="/${output}"; else outpath=""; fi
      (
         cd $(dirname $g)
         if (grep Visitor *java &>/dev/null); then opt="-visitor"; else opt=""; fi
         if [ -n "${output}" ]; then opt="$opt -o $output"; fi
         antlr4 $opt $(basename $g)*.g4
      ) && javac $(find ./"$(dirname "$g")${outpath}" -name "*.java")  \
     
            # go recursive and compile all folders inside the output folder


      ;;
   cpp)
      (
         cd $(dirname $g)
         make
      )
      ;;
   python)
      parserFile=${g}Parser.py
      if [[ ! -e ${parserFile} || ${grammar} -nt ${parserFile} ]]; then
         (
            cd $(dirname $g)
            if (grep Visitor *py &>/dev/null); then opt="-visitor"; else opt=""; fi
            if [ -n "${output}" ]; then opt="$opt -o $output"; fi
            antlr4 -python $opt $(basename $g)*.g4
         )
      fi
      ;;
   esac
}

case $1 in
"") ;;
-o | --output)
   shift
   output=$1
   shift
   ;;
-h | -help)
   help
   ;;
-java)
   shift
   ;;
-cpp | -c++)
   shift
   target="cpp"
   ;;
-python | -python3)
   shift
   target="python"
   ;;
-*)
   echo "ERROR: invalid argument!"
   echo ""
   help
   exit 1
   ;;
esac

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

for g in $(find . -name \*.g4 | sed 's/Parser.g4$\|Lexer.g4$\|.g4$//1' | uniq | sort); do
   process $g
done

exit 0
