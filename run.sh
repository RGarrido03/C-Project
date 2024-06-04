#!/usr/bin/env bash

show_help() {
    echo "Usage: $0 [options] <filename>"
    echo "Options:"
    echo "  -h            Show this help message"
    echo "  -compiled     Skip the antlr4-build step"
    echo " This file compiles the compiler and then runs the generated code"
    echo " with the input file as argument"
    echo " The input file must have a .pdraw extension"
}

# Parse flags
compiled=false
while getopts ":h-:" opt; do
    case ${opt} in
        h )
            show_help
            exit 0
        ;;
        - )
            case ${OPTARG} in
                compiled )
                    compiled=true
                ;;
                * )
                    echo "Invalid option: --${OPTARG}" >&2
                    show_help
                    exit 1
                ;;
            esac
        ;;
        \? )
            echo "Invalid option: -${OPTARG}" >&2
            show_help
            exit 1
        ;;
        : )
            echo "Option -${OPTARG} requires an argument" >&2
            show_help
            exit 1
        ;;
    esac
done
shift $((OPTIND -1))

if [ $# -lt 1 ]; then
    echo "Error: Missing filename argument"
    show_help
    exit 1
fi

FILENAME=$1

if [[ "${FILENAME##*.}" != "pdraw" ]]; then
    echo "Error: The file must have a .pdraw extension"
    exit 1
fi

cd src/compiler || exit 1

# Build compiler
if [ "$compiled" = false ]; then
    antlr4-build
fi

if [  -f "$FILENAME" ]; then
    echo "File $FILENAME not found"
    exit 1
fi
echo "Running $FILENAME"
# Run compilation
antlr4-run < "../../$FILENAME"

# Build interpreter
cd ../generated_files || exit 1
if [ "$compiled" = false ]; then
    antlr4-build -python
fi

# Activate venv
if [ -d "venv" ]; then
    source venv/bin/activate
    elif [ -d "env" ]; then
    source env/bin/activate
else
    # Create venv
    read -r -p "No virtual environment found. Create one? (Y/n) " confirm
    if [ "$confirm" = "y" ] || [ "$confirm" = "Y" ] || [ -z "$confirm" ]; then
        python3 -m venv venv
        source venv/bin/activate
        pip install antlr4-python3-runtime
    else
        echo "You must have a virtual environment to run the interpreter."
        exit 1
    fi
fi

python3 main.py
deactivate
cd ../..
