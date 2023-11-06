# Build script for the project.

# Call clean.sh to delete all the files created by the ANTLR4 build process.
./clean.sh

# Install the required Python packages.
pip install -r requirements.txt

# Generate the Python files for the ANTLR4 grammar.
antlr4 -v 4.13.1 -Dlanguage=Python3 Expr.g4
