import sys
from io import StringIO
from antlr4 import *
from ExprLexer import ExprLexer
from ExprParser import ExprParser


def main(argv):
    input_stream = FileStream(argv[1])
    lexer = ExprLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = ExprParser(stream)
    tree = parser.start_()
    print(tree.toStringTree(recog=parser))  # Print tree to CLI
    print()

    # Check for syntax errors
    if parser.getNumberOfSyntaxErrors() > 0:
        print("failed!")
    else:
        print("passed!")


if __name__ == "__main__":
    main(sys.argv)
