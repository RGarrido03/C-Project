cd src/compiler || exit 1

# Build compiler
antlr4-build

# Run compilation
antlr4-run < ../../examples/p4.pdraw

# Build interpreter
cd ../generated_files
antlr4-build -python

# Activate venv
if [ -d "venv" ]; then
  source venv/bin/activate
elif [ -d "env" ]; then
  source env/bin/activate
else
  # Create venv
  read -r -p "No virtual environment found. Create one? (Y/n) " confirm
  if [ "$confirm" = "y" ] || [ "$confirm" = "Y" ]; then
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
