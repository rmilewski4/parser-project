# Delete all the files created by the ANTLR4 build process.
# This script is called by build.sh.

# Delete all .pyc files, .interp files, and .tokens files.
rm -f *.pyc
rm -f *.interp
rm -f *.tokens

# Delete the generated Python files/folders.
rm -rf __pycache__
rm -f ExprLexer.py
rm -f ExprListener.py
rm -f ExprParser.py
