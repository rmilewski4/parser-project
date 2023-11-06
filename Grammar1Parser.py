# Generated from Grammar1.g4 by ANTLR 4.13.1
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO

def serializedATN():
    return [
        4,1,21,105,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,
        6,2,7,7,7,2,8,7,8,2,9,7,9,1,0,1,0,1,0,5,0,24,8,0,10,0,12,0,27,9,
        0,1,0,1,0,1,1,1,1,1,1,1,1,1,1,3,1,36,8,1,1,2,1,2,1,2,1,2,1,3,1,3,
        1,3,1,3,1,3,1,3,1,3,1,3,1,3,5,3,51,8,3,10,3,12,3,54,9,3,1,3,1,3,
        1,3,3,3,59,8,3,1,4,1,4,1,4,1,4,1,4,1,5,1,5,1,5,1,5,1,5,1,5,1,5,1,
        6,1,6,1,7,1,7,1,7,5,7,78,8,7,10,7,12,7,81,9,7,1,8,1,8,1,8,1,8,1,
        8,1,8,3,8,89,8,8,1,9,1,9,1,9,5,9,94,8,9,10,9,12,9,97,9,9,4,9,99,
        8,9,11,9,12,9,100,1,9,1,9,1,9,0,0,10,0,2,4,6,8,10,12,14,16,18,0,
        1,1,0,9,12,106,0,25,1,0,0,0,2,35,1,0,0,0,4,37,1,0,0,0,6,41,1,0,0,
        0,8,60,1,0,0,0,10,65,1,0,0,0,12,72,1,0,0,0,14,74,1,0,0,0,16,88,1,
        0,0,0,18,90,1,0,0,0,20,21,3,2,1,0,21,22,5,17,0,0,22,24,1,0,0,0,23,
        20,1,0,0,0,24,27,1,0,0,0,25,23,1,0,0,0,25,26,1,0,0,0,26,28,1,0,0,
        0,27,25,1,0,0,0,28,29,5,0,0,1,29,1,1,0,0,0,30,36,3,4,2,0,31,36,3,
        6,3,0,32,36,3,8,4,0,33,36,3,10,5,0,34,36,3,12,6,0,35,30,1,0,0,0,
        35,31,1,0,0,0,35,32,1,0,0,0,35,33,1,0,0,0,35,34,1,0,0,0,36,3,1,0,
        0,0,37,38,5,15,0,0,38,39,5,1,0,0,39,40,3,12,6,0,40,5,1,0,0,0,41,
        42,5,2,0,0,42,43,3,12,6,0,43,44,5,3,0,0,44,52,3,18,9,0,45,46,5,4,
        0,0,46,47,3,12,6,0,47,48,5,3,0,0,48,49,3,18,9,0,49,51,1,0,0,0,50,
        45,1,0,0,0,51,54,1,0,0,0,52,50,1,0,0,0,52,53,1,0,0,0,53,58,1,0,0,
        0,54,52,1,0,0,0,55,56,5,5,0,0,56,57,5,3,0,0,57,59,3,18,9,0,58,55,
        1,0,0,0,58,59,1,0,0,0,59,7,1,0,0,0,60,61,5,6,0,0,61,62,3,12,6,0,
        62,63,5,3,0,0,63,64,3,18,9,0,64,9,1,0,0,0,65,66,5,7,0,0,66,67,5,
        15,0,0,67,68,5,8,0,0,68,69,3,12,6,0,69,70,5,3,0,0,70,71,3,18,9,0,
        71,11,1,0,0,0,72,73,3,14,7,0,73,13,1,0,0,0,74,79,3,16,8,0,75,76,
        7,0,0,0,76,78,3,16,8,0,77,75,1,0,0,0,78,81,1,0,0,0,79,77,1,0,0,0,
        79,80,1,0,0,0,80,15,1,0,0,0,81,79,1,0,0,0,82,89,5,16,0,0,83,89,5,
        15,0,0,84,85,5,13,0,0,85,86,3,12,6,0,86,87,5,14,0,0,87,89,1,0,0,
        0,88,82,1,0,0,0,88,83,1,0,0,0,88,84,1,0,0,0,89,17,1,0,0,0,90,98,
        5,18,0,0,91,95,3,2,1,0,92,94,5,17,0,0,93,92,1,0,0,0,94,97,1,0,0,
        0,95,93,1,0,0,0,95,96,1,0,0,0,96,99,1,0,0,0,97,95,1,0,0,0,98,91,
        1,0,0,0,99,100,1,0,0,0,100,98,1,0,0,0,100,101,1,0,0,0,101,102,1,
        0,0,0,102,103,5,19,0,0,103,19,1,0,0,0,8,25,35,52,58,79,88,95,100
    ]

class Grammar1Parser ( Parser ):

    grammarFileName = "Grammar1.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'='", "'if'", "':'", "'elif'", "'else'", 
                     "'while'", "'for'", "'in'", "'*'", "'/'", "'+'", "'-'", 
                     "'('", "')'", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "'    '" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "ID", "INT", 
                      "NEWLINE", "INDENT", "DEDENT", "WS", "COMMENT" ]

    RULE_start = 0
    RULE_statement = 1
    RULE_assignment = 2
    RULE_if_statement = 3
    RULE_while_loop = 4
    RULE_for_loop = 5
    RULE_expression = 6
    RULE_arithmetic_expression = 7
    RULE_atom = 8
    RULE_suite = 9

    ruleNames =  [ "start", "statement", "assignment", "if_statement", "while_loop", 
                   "for_loop", "expression", "arithmetic_expression", "atom", 
                   "suite" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    T__2=3
    T__3=4
    T__4=5
    T__5=6
    T__6=7
    T__7=8
    T__8=9
    T__9=10
    T__10=11
    T__11=12
    T__12=13
    T__13=14
    ID=15
    INT=16
    NEWLINE=17
    INDENT=18
    DEDENT=19
    WS=20
    COMMENT=21

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.1")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class StartContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def EOF(self):
            return self.getToken(Grammar1Parser.EOF, 0)

        def statement(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(Grammar1Parser.StatementContext)
            else:
                return self.getTypedRuleContext(Grammar1Parser.StatementContext,i)


        def NEWLINE(self, i:int=None):
            if i is None:
                return self.getTokens(Grammar1Parser.NEWLINE)
            else:
                return self.getToken(Grammar1Parser.NEWLINE, i)

        def getRuleIndex(self):
            return Grammar1Parser.RULE_start

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterStart" ):
                listener.enterStart(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitStart" ):
                listener.exitStart(self)




    def start(self):

        localctx = Grammar1Parser.StartContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_start)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 25
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & 106692) != 0):
                self.state = 20
                self.statement()
                self.state = 21
                self.match(Grammar1Parser.NEWLINE)
                self.state = 27
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 28
            self.match(Grammar1Parser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class StatementContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def assignment(self):
            return self.getTypedRuleContext(Grammar1Parser.AssignmentContext,0)


        def if_statement(self):
            return self.getTypedRuleContext(Grammar1Parser.If_statementContext,0)


        def while_loop(self):
            return self.getTypedRuleContext(Grammar1Parser.While_loopContext,0)


        def for_loop(self):
            return self.getTypedRuleContext(Grammar1Parser.For_loopContext,0)


        def expression(self):
            return self.getTypedRuleContext(Grammar1Parser.ExpressionContext,0)


        def getRuleIndex(self):
            return Grammar1Parser.RULE_statement

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterStatement" ):
                listener.enterStatement(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitStatement" ):
                listener.exitStatement(self)




    def statement(self):

        localctx = Grammar1Parser.StatementContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_statement)
        try:
            self.state = 35
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,1,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 30
                self.assignment()
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 31
                self.if_statement()
                pass

            elif la_ == 3:
                self.enterOuterAlt(localctx, 3)
                self.state = 32
                self.while_loop()
                pass

            elif la_ == 4:
                self.enterOuterAlt(localctx, 4)
                self.state = 33
                self.for_loop()
                pass

            elif la_ == 5:
                self.enterOuterAlt(localctx, 5)
                self.state = 34
                self.expression()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class AssignmentContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(Grammar1Parser.ID, 0)

        def expression(self):
            return self.getTypedRuleContext(Grammar1Parser.ExpressionContext,0)


        def getRuleIndex(self):
            return Grammar1Parser.RULE_assignment

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterAssignment" ):
                listener.enterAssignment(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitAssignment" ):
                listener.exitAssignment(self)




    def assignment(self):

        localctx = Grammar1Parser.AssignmentContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_assignment)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 37
            self.match(Grammar1Parser.ID)
            self.state = 38
            self.match(Grammar1Parser.T__0)
            self.state = 39
            self.expression()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class If_statementContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expression(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(Grammar1Parser.ExpressionContext)
            else:
                return self.getTypedRuleContext(Grammar1Parser.ExpressionContext,i)


        def suite(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(Grammar1Parser.SuiteContext)
            else:
                return self.getTypedRuleContext(Grammar1Parser.SuiteContext,i)


        def getRuleIndex(self):
            return Grammar1Parser.RULE_if_statement

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterIf_statement" ):
                listener.enterIf_statement(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitIf_statement" ):
                listener.exitIf_statement(self)




    def if_statement(self):

        localctx = Grammar1Parser.If_statementContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_if_statement)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 41
            self.match(Grammar1Parser.T__1)
            self.state = 42
            self.expression()
            self.state = 43
            self.match(Grammar1Parser.T__2)
            self.state = 44
            self.suite()
            self.state = 52
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==4:
                self.state = 45
                self.match(Grammar1Parser.T__3)
                self.state = 46
                self.expression()
                self.state = 47
                self.match(Grammar1Parser.T__2)
                self.state = 48
                self.suite()
                self.state = 54
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 58
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==5:
                self.state = 55
                self.match(Grammar1Parser.T__4)
                self.state = 56
                self.match(Grammar1Parser.T__2)
                self.state = 57
                self.suite()


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class While_loopContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expression(self):
            return self.getTypedRuleContext(Grammar1Parser.ExpressionContext,0)


        def suite(self):
            return self.getTypedRuleContext(Grammar1Parser.SuiteContext,0)


        def getRuleIndex(self):
            return Grammar1Parser.RULE_while_loop

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterWhile_loop" ):
                listener.enterWhile_loop(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitWhile_loop" ):
                listener.exitWhile_loop(self)




    def while_loop(self):

        localctx = Grammar1Parser.While_loopContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_while_loop)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 60
            self.match(Grammar1Parser.T__5)
            self.state = 61
            self.expression()
            self.state = 62
            self.match(Grammar1Parser.T__2)
            self.state = 63
            self.suite()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class For_loopContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(Grammar1Parser.ID, 0)

        def expression(self):
            return self.getTypedRuleContext(Grammar1Parser.ExpressionContext,0)


        def suite(self):
            return self.getTypedRuleContext(Grammar1Parser.SuiteContext,0)


        def getRuleIndex(self):
            return Grammar1Parser.RULE_for_loop

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFor_loop" ):
                listener.enterFor_loop(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFor_loop" ):
                listener.exitFor_loop(self)




    def for_loop(self):

        localctx = Grammar1Parser.For_loopContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_for_loop)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 65
            self.match(Grammar1Parser.T__6)
            self.state = 66
            self.match(Grammar1Parser.ID)
            self.state = 67
            self.match(Grammar1Parser.T__7)
            self.state = 68
            self.expression()
            self.state = 69
            self.match(Grammar1Parser.T__2)
            self.state = 70
            self.suite()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ExpressionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def arithmetic_expression(self):
            return self.getTypedRuleContext(Grammar1Parser.Arithmetic_expressionContext,0)


        def getRuleIndex(self):
            return Grammar1Parser.RULE_expression

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpression" ):
                listener.enterExpression(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpression" ):
                listener.exitExpression(self)




    def expression(self):

        localctx = Grammar1Parser.ExpressionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_expression)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 72
            self.arithmetic_expression()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Arithmetic_expressionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self.op = None # Token

        def atom(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(Grammar1Parser.AtomContext)
            else:
                return self.getTypedRuleContext(Grammar1Parser.AtomContext,i)


        def getRuleIndex(self):
            return Grammar1Parser.RULE_arithmetic_expression

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterArithmetic_expression" ):
                listener.enterArithmetic_expression(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitArithmetic_expression" ):
                listener.exitArithmetic_expression(self)




    def arithmetic_expression(self):

        localctx = Grammar1Parser.Arithmetic_expressionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 14, self.RULE_arithmetic_expression)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 74
            self.atom()
            self.state = 79
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & 7680) != 0):
                self.state = 75
                localctx.op = self._input.LT(1)
                _la = self._input.LA(1)
                if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 7680) != 0)):
                    localctx.op = self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                self.state = 76
                self.atom()
                self.state = 81
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class AtomContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def INT(self):
            return self.getToken(Grammar1Parser.INT, 0)

        def ID(self):
            return self.getToken(Grammar1Parser.ID, 0)

        def expression(self):
            return self.getTypedRuleContext(Grammar1Parser.ExpressionContext,0)


        def getRuleIndex(self):
            return Grammar1Parser.RULE_atom

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterAtom" ):
                listener.enterAtom(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitAtom" ):
                listener.exitAtom(self)




    def atom(self):

        localctx = Grammar1Parser.AtomContext(self, self._ctx, self.state)
        self.enterRule(localctx, 16, self.RULE_atom)
        try:
            self.state = 88
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [16]:
                self.enterOuterAlt(localctx, 1)
                self.state = 82
                self.match(Grammar1Parser.INT)
                pass
            elif token in [15]:
                self.enterOuterAlt(localctx, 2)
                self.state = 83
                self.match(Grammar1Parser.ID)
                pass
            elif token in [13]:
                self.enterOuterAlt(localctx, 3)
                self.state = 84
                self.match(Grammar1Parser.T__12)
                self.state = 85
                self.expression()
                self.state = 86
                self.match(Grammar1Parser.T__13)
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class SuiteContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def INDENT(self):
            return self.getToken(Grammar1Parser.INDENT, 0)

        def DEDENT(self):
            return self.getToken(Grammar1Parser.DEDENT, 0)

        def statement(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(Grammar1Parser.StatementContext)
            else:
                return self.getTypedRuleContext(Grammar1Parser.StatementContext,i)


        def NEWLINE(self, i:int=None):
            if i is None:
                return self.getTokens(Grammar1Parser.NEWLINE)
            else:
                return self.getToken(Grammar1Parser.NEWLINE, i)

        def getRuleIndex(self):
            return Grammar1Parser.RULE_suite

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterSuite" ):
                listener.enterSuite(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitSuite" ):
                listener.exitSuite(self)




    def suite(self):

        localctx = Grammar1Parser.SuiteContext(self, self._ctx, self.state)
        self.enterRule(localctx, 18, self.RULE_suite)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 90
            self.match(Grammar1Parser.INDENT)
            self.state = 98 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 91
                self.statement()
                self.state = 95
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while _la==17:
                    self.state = 92
                    self.match(Grammar1Parser.NEWLINE)
                    self.state = 97
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                self.state = 100 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not ((((_la) & ~0x3f) == 0 and ((1 << _la) & 106692) != 0)):
                    break

            self.state = 102
            self.match(Grammar1Parser.DEDENT)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





