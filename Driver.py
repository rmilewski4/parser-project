import sys
from io import StringIO
from antlr4 import *
from ExprLexer import ExprLexer
from ExprParser import ExprParser
from antlr4.tree.Trees import Trees


def main(argv):
    input_stream = FileStream(argv[1])
    lexer = ExprLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = ExprParser(stream)
    tree = parser.start_()
    if parser.getNumberOfSyntaxErrors() > 0:
        print()
        print(tree.toStringTree(recog=parser))  # Print tree to CLI
        print("failed!")
    else:
        print(tree.toStringTree(recog=parser))  # Print tree to CLI
        # Also show tree in GUI
        print(tree.inspect())

        print("passed!")


if __name__ == "__main__":
    main(sys.argv)
