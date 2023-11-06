# Generated from Grammar1.g4 by ANTLR 4.13.1
from antlr4 import *
if "." in __name__:
    from .Grammar1Parser import Grammar1Parser
else:
    from Grammar1Parser import Grammar1Parser

# This class defines a complete listener for a parse tree produced by Grammar1Parser.
class Grammar1Listener(ParseTreeListener):

    # Enter a parse tree produced by Grammar1Parser#start.
    def enterStart(self, ctx:Grammar1Parser.StartContext):
        pass

    # Exit a parse tree produced by Grammar1Parser#start.
    def exitStart(self, ctx:Grammar1Parser.StartContext):
        pass


    # Enter a parse tree produced by Grammar1Parser#statement.
    def enterStatement(self, ctx:Grammar1Parser.StatementContext):
        pass

    # Exit a parse tree produced by Grammar1Parser#statement.
    def exitStatement(self, ctx:Grammar1Parser.StatementContext):
        pass


    # Enter a parse tree produced by Grammar1Parser#assignment.
    def enterAssignment(self, ctx:Grammar1Parser.AssignmentContext):
        pass

    # Exit a parse tree produced by Grammar1Parser#assignment.
    def exitAssignment(self, ctx:Grammar1Parser.AssignmentContext):
        pass


    # Enter a parse tree produced by Grammar1Parser#if_statement.
    def enterIf_statement(self, ctx:Grammar1Parser.If_statementContext):
        pass

    # Exit a parse tree produced by Grammar1Parser#if_statement.
    def exitIf_statement(self, ctx:Grammar1Parser.If_statementContext):
        pass


    # Enter a parse tree produced by Grammar1Parser#while_loop.
    def enterWhile_loop(self, ctx:Grammar1Parser.While_loopContext):
        pass

    # Exit a parse tree produced by Grammar1Parser#while_loop.
    def exitWhile_loop(self, ctx:Grammar1Parser.While_loopContext):
        pass


    # Enter a parse tree produced by Grammar1Parser#for_loop.
    def enterFor_loop(self, ctx:Grammar1Parser.For_loopContext):
        pass

    # Exit a parse tree produced by Grammar1Parser#for_loop.
    def exitFor_loop(self, ctx:Grammar1Parser.For_loopContext):
        pass


    # Enter a parse tree produced by Grammar1Parser#expression.
    def enterExpression(self, ctx:Grammar1Parser.ExpressionContext):
        pass

    # Exit a parse tree produced by Grammar1Parser#expression.
    def exitExpression(self, ctx:Grammar1Parser.ExpressionContext):
        pass


    # Enter a parse tree produced by Grammar1Parser#arithmetic_expression.
    def enterArithmetic_expression(self, ctx:Grammar1Parser.Arithmetic_expressionContext):
        pass

    # Exit a parse tree produced by Grammar1Parser#arithmetic_expression.
    def exitArithmetic_expression(self, ctx:Grammar1Parser.Arithmetic_expressionContext):
        pass


    # Enter a parse tree produced by Grammar1Parser#atom.
    def enterAtom(self, ctx:Grammar1Parser.AtomContext):
        pass

    # Exit a parse tree produced by Grammar1Parser#atom.
    def exitAtom(self, ctx:Grammar1Parser.AtomContext):
        pass


    # Enter a parse tree produced by Grammar1Parser#suite.
    def enterSuite(self, ctx:Grammar1Parser.SuiteContext):
        pass

    # Exit a parse tree produced by Grammar1Parser#suite.
    def exitSuite(self, ctx:Grammar1Parser.SuiteContext):
        pass



del Grammar1Parser