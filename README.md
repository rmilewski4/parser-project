# parser-project
FS23 PoPL Parser Project


To setup, ensure that you have ANTLR installed with Python3. Your Antlr4 runtime should be 4.13.1. To run the script, first execute ```antlr4 -v 4.13.1 -Dlanguage=Python3 Expr.g4``` and this will generate the ANTLR files needed to run the driver script. Following this, you will need to run ```python3 Driver.py input.txt``` 