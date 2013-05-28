// Generated from L3.g4 by ANTLR 4.0
package l3interpreter.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class L3Parser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LC=1, RC=2, DEF=3, LA=4, RA=5, IF=6, ELSE=7, WHILE=8, DO=9, RETURN=10, 
		SEMI=11, BREAK=12, CONTINUE=13, TRUE=14, FALSE=15, COMA=16, LB=17, RB=18, 
		MUL=19, DIV=20, MOD=21, ADD=22, SUB=23, LT=24, GT=25, LET=26, GET=27, 
		AND=28, EQ=29, NEQ=30, OR=31, QM=32, CL=33, ASSIGN=34, Identifier=35, 
		WS=36, STRING=37, LETTER=38, INTEGER=39, FLOAT=40, COMMENT=41, LINE_COMMENT=42;
	public static final String[] tokenNames = {
		"<INVALID>", "'{'", "'}'", "'def'", "'('", "')'", "'if'", "'else'", "'while'", 
		"'do'", "'return'", "';'", "'break'", "'continue'", "'true'", "'false'", 
		"','", "'['", "']'", "'*'", "'/'", "'%'", "'+'", "'-'", "'<'", "'>'", 
		"'<='", "'>='", "'&&'", "'=='", "'!='", "'||'", "'?'", "':'", "'='", "Identifier", 
		"WS", "STRING", "LETTER", "INTEGER", "FLOAT", "COMMENT", "LINE_COMMENT"
	};
	public static final int
		RULE_prog = 0, RULE_finalstatment = 1, RULE_functionDef = 2, RULE_formalParameterDecls = 3, 
		RULE_block = 4, RULE_statement = 5, RULE_parExpression = 6, RULE_statementExpression = 7, 
		RULE_expression = 8, RULE_expressionList = 9, RULE_primary = 10, RULE_literal = 11;
	public static final String[] ruleNames = {
		"prog", "finalstatment", "functionDef", "formalParameterDecls", "block", 
		"statement", "parExpression", "statementExpression", "expression", "expressionList", 
		"primary", "literal"
	};

	@Override
	public String getGrammarFileName() { return "L3.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public L3Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public FinalstatmentContext finalstatment(int i) {
			return getRuleContext(FinalstatmentContext.class,i);
		}
		public List<FinalstatmentContext> finalstatment() {
			return getRuleContexts(FinalstatmentContext.class);
		}
		public TerminalNode EOF() { return getToken(L3Parser.EOF, 0); }
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof L3Visitor ) return ((L3Visitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LC) | (1L << DEF) | (1L << LA) | (1L << IF) | (1L << WHILE) | (1L << DO) | (1L << RETURN) | (1L << SEMI) | (1L << BREAK) | (1L << CONTINUE) | (1L << TRUE) | (1L << FALSE) | (1L << Identifier) | (1L << STRING) | (1L << INTEGER) | (1L << FLOAT))) != 0)) {
				{
				{
				setState(24); finalstatment();
				}
				}
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(30); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FinalstatmentContext extends ParserRuleContext {
		public FinalstatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finalstatment; }
	 
		public FinalstatmentContext() { }
		public void copyFrom(FinalstatmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StatementLabelContext extends FinalstatmentContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementLabelContext(FinalstatmentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof L3Visitor ) return ((L3Visitor<? extends T>)visitor).visitStatementLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionDefLabelContext extends FinalstatmentContext {
		public FunctionDefContext functionDef() {
			return getRuleContext(FunctionDefContext.class,0);
		}
		public FunctionDefLabelContext(FinalstatmentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof L3Visitor ) return ((L3Visitor<? extends T>)visitor).visitFunctionDefLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FinalstatmentContext finalstatment() throws RecognitionException {
		FinalstatmentContext _localctx = new FinalstatmentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_finalstatment);
		try {
			setState(34);
			switch (_input.LA(1)) {
			case LC:
			case LA:
			case IF:
			case WHILE:
			case DO:
			case RETURN:
			case SEMI:
			case BREAK:
			case CONTINUE:
			case TRUE:
			case FALSE:
			case Identifier:
			case STRING:
			case INTEGER:
			case FLOAT:
				_localctx = new StatementLabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(32); statement();
				}
				break;
			case DEF:
				_localctx = new FunctionDefLabelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(33); functionDef();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDefContext extends ParserRuleContext {
		public FormalParameterDeclsContext formalParameterDecls() {
			return getRuleContext(FormalParameterDeclsContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(L3Parser.Identifier, 0); }
		public FunctionDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDef; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof L3Visitor ) return ((L3Visitor<? extends T>)visitor).visitFunctionDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefContext functionDef() throws RecognitionException {
		FunctionDefContext _localctx = new FunctionDefContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_functionDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36); match(DEF);
			setState(37); match(Identifier);
			setState(38); match(LA);
			setState(40);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(39); formalParameterDecls();
				}
			}

			setState(42); match(RA);
			setState(43); block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterDeclsContext extends ParserRuleContext {
		public FormalParameterDeclsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterDecls; }
	 
		public FormalParameterDeclsContext() { }
		public void copyFrom(FormalParameterDeclsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FunctionParameterDefLabelContext extends FormalParameterDeclsContext {
		public TerminalNode Identifier(int i) {
			return getToken(L3Parser.Identifier, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(L3Parser.Identifier); }
		public FunctionParameterDefLabelContext(FormalParameterDeclsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof L3Visitor ) return ((L3Visitor<? extends T>)visitor).visitFunctionParameterDefLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterDeclsContext formalParameterDecls() throws RecognitionException {
		FormalParameterDeclsContext _localctx = new FormalParameterDeclsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_formalParameterDecls);
		int _la;
		try {
			_localctx = new FunctionParameterDefLabelContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(45); match(Identifier);
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(46); match(COMA);
				setState(47); match(Identifier);
				}
				}
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof L3Visitor ) return ((L3Visitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53); match(LC);
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LC) | (1L << LA) | (1L << IF) | (1L << WHILE) | (1L << DO) | (1L << RETURN) | (1L << SEMI) | (1L << BREAK) | (1L << CONTINUE) | (1L << TRUE) | (1L << FALSE) | (1L << Identifier) | (1L << STRING) | (1L << INTEGER) | (1L << FLOAT))) != 0)) {
				{
				{
				setState(54); statement();
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(60); match(RC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BreakLabelContext extends StatementContext {
		public BreakLabelContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof L3Visitor ) return ((L3Visitor<? extends T>)visitor).visitBreakLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SemiLabelContext extends StatementContext {
		public SemiLabelContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof L3Visitor ) return ((L3Visitor<? extends T>)visitor).visitSemiLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfLabelContext extends StatementContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfLabelContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof L3Visitor ) return ((L3Visitor<? extends T>)visitor).visitIfLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnLabelContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnLabelContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof L3Visitor ) return ((L3Visitor<? extends T>)visitor).visitReturnLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementExpressionLabelContext extends StatementContext {
		public StatementExpressionContext statementExpression() {
			return getRuleContext(StatementExpressionContext.class,0);
		}
		public StatementExpressionLabelContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof L3Visitor ) return ((L3Visitor<? extends T>)visitor).visitStatementExpressionLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileLabelContext extends StatementContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public WhileLabelContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof L3Visitor ) return ((L3Visitor<? extends T>)visitor).visitWhileLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoLabelContext extends StatementContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public DoLabelContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof L3Visitor ) return ((L3Visitor<? extends T>)visitor).visitDoLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ContinueLabelContext extends StatementContext {
		public ContinueLabelContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof L3Visitor ) return ((L3Visitor<? extends T>)visitor).visitContinueLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlockLabelContext extends StatementContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BlockLabelContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof L3Visitor ) return ((L3Visitor<? extends T>)visitor).visitBlockLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statement);
		int _la;
		try {
			setState(93);
			switch (_input.LA(1)) {
			case LC:
				_localctx = new BlockLabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(62); block();
				}
				break;
			case IF:
				_localctx = new IfLabelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(63); match(IF);
				setState(64); parExpression();
				setState(65); statement();
				setState(68);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(66); match(ELSE);
					setState(67); statement();
					}
					break;
				}
				}
				break;
			case WHILE:
				_localctx = new WhileLabelContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(70); match(WHILE);
				setState(71); parExpression();
				setState(72); statement();
				}
				break;
			case DO:
				_localctx = new DoLabelContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(74); match(DO);
				setState(75); statement();
				setState(76); match(WHILE);
				setState(77); parExpression();
				setState(78); match(SEMI);
				}
				break;
			case RETURN:
				_localctx = new ReturnLabelContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(80); match(RETURN);
				setState(82);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LA) | (1L << TRUE) | (1L << FALSE) | (1L << Identifier) | (1L << STRING) | (1L << INTEGER) | (1L << FLOAT))) != 0)) {
					{
					setState(81); expression(0);
					}
				}

				setState(84); match(SEMI);
				}
				break;
			case BREAK:
				_localctx = new BreakLabelContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(85); match(BREAK);
				setState(86); match(SEMI);
				}
				break;
			case CONTINUE:
				_localctx = new ContinueLabelContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(87); match(CONTINUE);
				setState(88); match(SEMI);
				}
				break;
			case LA:
			case TRUE:
			case FALSE:
			case Identifier:
			case STRING:
			case INTEGER:
			case FLOAT:
				_localctx = new StatementExpressionLabelContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(89); statementExpression();
				setState(90); match(SEMI);
				}
				break;
			case SEMI:
				_localctx = new SemiLabelContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(92); match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParExpressionContext extends ParserRuleContext {
		public ParExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parExpression; }
	 
		public ParExpressionContext() { }
		public void copyFrom(ParExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParExpressoinLabelContext extends ParExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParExpressoinLabelContext(ParExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof L3Visitor ) return ((L3Visitor<? extends T>)visitor).visitParExpressoinLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parExpression);
		try {
			_localctx = new ParExpressoinLabelContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(95); match(LA);
			setState(96); expression(0);
			setState(97); match(RA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof L3Visitor ) return ((L3Visitor<? extends T>)visitor).visitStatementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementExpressionContext statementExpression() throws RecognitionException {
		StatementExpressionContext _localctx = new StatementExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99); expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public int _p;
		public ExpressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExpressionContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
			this._p = ctx._p;
		}
	}
	public static class IndexVisitLabelContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public IndexVisitLabelContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof L3Visitor ) return ((L3Visitor<? extends T>)visitor).visitIndexVisitLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignLabelContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AssignLabelContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof L3Visitor ) return ((L3Visitor<? extends T>)visitor).visitAssignLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConditionLabelContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ConditionLabelContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof L3Visitor ) return ((L3Visitor<? extends T>)visitor).visitConditionLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndLabelContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AndLabelContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof L3Visitor ) return ((L3Visitor<? extends T>)visitor).visitAndLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddSubLabelContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AddSubLabelContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof L3Visitor ) return ((L3Visitor<? extends T>)visitor).visitAddSubLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FastConditionLabelContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public FastConditionLabelContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof L3Visitor ) return ((L3Visitor<? extends T>)visitor).visitFastConditionLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrimaryLabelContext extends ExpressionContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public PrimaryLabelContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof L3Visitor ) return ((L3Visitor<? extends T>)visitor).visitPrimaryLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulDivModLabelContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MulDivModLabelContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof L3Visitor ) return ((L3Visitor<? extends T>)visitor).visitMulDivModLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IsEqualLabelContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public IsEqualLabelContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof L3Visitor ) return ((L3Visitor<? extends T>)visitor).visitIsEqualLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrLabelContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public OrLabelContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof L3Visitor ) return ((L3Visitor<? extends T>)visitor).visitOrLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CallFunctionLabelContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public CallFunctionLabelContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof L3Visitor ) return ((L3Visitor<? extends T>)visitor).visitCallFunctionLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState, _p);
		ExpressionContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, RULE_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PrimaryLabelContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(102); primary();
			}
			_ctx.stop = _input.LT(-1);
			setState(144);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(142);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivModLabelContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(104);
						if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
						setState(105);
						((MulDivModLabelContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((MulDivModLabelContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(106); expression(9);
						}
						break;

					case 2:
						{
						_localctx = new AddSubLabelContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(107);
						if (!(7 >= _localctx._p)) throw new FailedPredicateException(this, "7 >= $_p");
						setState(108);
						((AddSubLabelContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AddSubLabelContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(109); expression(8);
						}
						break;

					case 3:
						{
						_localctx = new ConditionLabelContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(110);
						if (!(6 >= _localctx._p)) throw new FailedPredicateException(this, "6 >= $_p");
						setState(111);
						((ConditionLabelContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << GT) | (1L << LET) | (1L << GET))) != 0)) ) {
							((ConditionLabelContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(112); expression(7);
						}
						break;

					case 4:
						{
						_localctx = new IsEqualLabelContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(113);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(114);
						((IsEqualLabelContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQ || _la==NEQ) ) {
							((IsEqualLabelContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(115); expression(6);
						}
						break;

					case 5:
						{
						_localctx = new AndLabelContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(116);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(117); match(AND);
						setState(118); expression(5);
						}
						break;

					case 6:
						{
						_localctx = new OrLabelContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(119);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(120); match(OR);
						setState(121); expression(4);
						}
						break;

					case 7:
						{
						_localctx = new AssignLabelContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(122);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(123); match(ASSIGN);
						setState(124); expression(1);
						}
						break;

					case 8:
						{
						_localctx = new FastConditionLabelContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(125);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(126); match(QM);
						setState(127); expression(0);
						setState(128); match(CL);
						setState(129); expression(3);
						}
						break;

					case 9:
						{
						_localctx = new IndexVisitLabelContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(131);
						if (!(10 >= _localctx._p)) throw new FailedPredicateException(this, "10 >= $_p");
						setState(132); match(LB);
						setState(133); expression(0);
						setState(134); match(RB);
						}
						break;

					case 10:
						{
						_localctx = new CallFunctionLabelContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(136);
						if (!(9 >= _localctx._p)) throw new FailedPredicateException(this, "9 >= $_p");
						setState(137); match(LA);
						setState(139);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LA) | (1L << TRUE) | (1L << FALSE) | (1L << Identifier) | (1L << STRING) | (1L << INTEGER) | (1L << FLOAT))) != 0)) {
							{
							setState(138); expressionList();
							}
						}

						setState(141); match(RA);
						}
						break;
					}
					} 
				}
				setState(146);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpressionListContext extends ParserRuleContext {
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
	 
		public ExpressionListContext() { }
		public void copyFrom(ExpressionListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExpressionListLabelContext extends ExpressionListContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionListLabelContext(ExpressionListContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof L3Visitor ) return ((L3Visitor<? extends T>)visitor).visitExpressionListLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expressionList);
		int _la;
		try {
			_localctx = new ExpressionListLabelContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(147); expression(0);
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(148); match(COMA);
				setState(149); expression(0);
				}
				}
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryContext extends ParserRuleContext {
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
	 
		public PrimaryContext() { }
		public void copyFrom(PrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdentifierLabelContext extends PrimaryContext {
		public TerminalNode Identifier() { return getToken(L3Parser.Identifier, 0); }
		public IdentifierLabelContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof L3Visitor ) return ((L3Visitor<? extends T>)visitor).visitIdentifierLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BrackerExpressionLabelContext extends PrimaryContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BrackerExpressionLabelContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof L3Visitor ) return ((L3Visitor<? extends T>)visitor).visitBrackerExpressionLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralLabelContext extends PrimaryContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralLabelContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof L3Visitor ) return ((L3Visitor<? extends T>)visitor).visitLiteralLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_primary);
		try {
			setState(161);
			switch (_input.LA(1)) {
			case LA:
				_localctx = new BrackerExpressionLabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(155); match(LA);
				setState(156); expression(0);
				setState(157); match(RA);
				}
				break;
			case TRUE:
			case FALSE:
			case STRING:
			case INTEGER:
			case FLOAT:
				_localctx = new LiteralLabelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(159); literal();
				}
				break;
			case Identifier:
				_localctx = new IdentifierLabelContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(160); match(Identifier);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	 
		public LiteralContext() { }
		public void copyFrom(LiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TrueLabelContext extends LiteralContext {
		public TrueLabelContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof L3Visitor ) return ((L3Visitor<? extends T>)visitor).visitTrueLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerLabelContext extends LiteralContext {
		public TerminalNode INTEGER() { return getToken(L3Parser.INTEGER, 0); }
		public IntegerLabelContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof L3Visitor ) return ((L3Visitor<? extends T>)visitor).visitIntegerLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringLabelContext extends LiteralContext {
		public TerminalNode STRING() { return getToken(L3Parser.STRING, 0); }
		public StringLabelContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof L3Visitor ) return ((L3Visitor<? extends T>)visitor).visitStringLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FalseLabelContext extends LiteralContext {
		public FalseLabelContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof L3Visitor ) return ((L3Visitor<? extends T>)visitor).visitFalseLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FloatLabelContext extends LiteralContext {
		public TerminalNode FLOAT() { return getToken(L3Parser.FLOAT, 0); }
		public FloatLabelContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof L3Visitor ) return ((L3Visitor<? extends T>)visitor).visitFloatLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_literal);
		try {
			setState(168);
			switch (_input.LA(1)) {
			case INTEGER:
				_localctx = new IntegerLabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(163); match(INTEGER);
				}
				break;
			case FLOAT:
				_localctx = new FloatLabelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(164); match(FLOAT);
				}
				break;
			case TRUE:
				_localctx = new TrueLabelContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(165); match(TRUE);
				}
				break;
			case FALSE:
				_localctx = new FalseLabelContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(166); match(FALSE);
				}
				break;
			case STRING:
				_localctx = new StringLabelContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(167); match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 8 >= _localctx._p;

		case 1: return 7 >= _localctx._p;

		case 2: return 6 >= _localctx._p;

		case 3: return 5 >= _localctx._p;

		case 4: return 4 >= _localctx._p;

		case 5: return 3 >= _localctx._p;

		case 6: return 1 >= _localctx._p;

		case 7: return 2 >= _localctx._p;

		case 8: return 10 >= _localctx._p;

		case 9: return 9 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\2\3,\u00ad\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\3\2\7\2\34\n\2\f\2\16\2\37\13"+
		"\2\3\2\3\2\3\3\3\3\5\3%\n\3\3\4\3\4\3\4\3\4\5\4+\n\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\7\5\63\n\5\f\5\16\5\66\13\5\3\6\3\6\7\6:\n\6\f\6\16\6=\13\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7G\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\5\7U\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7`\n\7"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u008e\n\n\3\n\7\n\u0091\n\n\f"+
		"\n\16\n\u0094\13\n\3\13\3\13\3\13\7\13\u0099\n\13\f\13\16\13\u009c\13"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00a4\n\f\3\r\3\r\3\r\3\r\3\r\5\r\u00ab"+
		"\n\r\3\r\2\16\2\4\6\b\n\f\16\20\22\24\26\30\2\6\3\25\27\3\30\31\3\32\35"+
		"\3\37 \u00c1\2\35\3\2\2\2\4$\3\2\2\2\6&\3\2\2\2\b/\3\2\2\2\n\67\3\2\2"+
		"\2\f_\3\2\2\2\16a\3\2\2\2\20e\3\2\2\2\22g\3\2\2\2\24\u0095\3\2\2\2\26"+
		"\u00a3\3\2\2\2\30\u00aa\3\2\2\2\32\34\5\4\3\2\33\32\3\2\2\2\34\37\3\2"+
		"\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36 \3\2\2\2\37\35\3\2\2\2 !\7\1\2\2!"+
		"\3\3\2\2\2\"%\5\f\7\2#%\5\6\4\2$\"\3\2\2\2$#\3\2\2\2%\5\3\2\2\2&\'\7\5"+
		"\2\2\'(\7%\2\2(*\7\6\2\2)+\5\b\5\2*)\3\2\2\2*+\3\2\2\2+,\3\2\2\2,-\7\7"+
		"\2\2-.\5\n\6\2.\7\3\2\2\2/\64\7%\2\2\60\61\7\22\2\2\61\63\7%\2\2\62\60"+
		"\3\2\2\2\63\66\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\t\3\2\2\2\66\64"+
		"\3\2\2\2\67;\7\3\2\28:\5\f\7\298\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2"+
		"<>\3\2\2\2=;\3\2\2\2>?\7\4\2\2?\13\3\2\2\2@`\5\n\6\2AB\7\b\2\2BC\5\16"+
		"\b\2CF\5\f\7\2DE\7\t\2\2EG\5\f\7\2FD\3\2\2\2FG\3\2\2\2G`\3\2\2\2HI\7\n"+
		"\2\2IJ\5\16\b\2JK\5\f\7\2K`\3\2\2\2LM\7\13\2\2MN\5\f\7\2NO\7\n\2\2OP\5"+
		"\16\b\2PQ\7\r\2\2Q`\3\2\2\2RT\7\f\2\2SU\5\22\n\2TS\3\2\2\2TU\3\2\2\2U"+
		"V\3\2\2\2V`\7\r\2\2WX\7\16\2\2X`\7\r\2\2YZ\7\17\2\2Z`\7\r\2\2[\\\5\20"+
		"\t\2\\]\7\r\2\2]`\3\2\2\2^`\7\r\2\2_@\3\2\2\2_A\3\2\2\2_H\3\2\2\2_L\3"+
		"\2\2\2_R\3\2\2\2_W\3\2\2\2_Y\3\2\2\2_[\3\2\2\2_^\3\2\2\2`\r\3\2\2\2ab"+
		"\7\6\2\2bc\5\22\n\2cd\7\7\2\2d\17\3\2\2\2ef\5\22\n\2f\21\3\2\2\2gh\b\n"+
		"\1\2hi\5\26\f\2i\u0092\3\2\2\2jk\6\n\2\3kl\t\2\2\2l\u0091\5\22\n\2mn\6"+
		"\n\3\3no\t\3\2\2o\u0091\5\22\n\2pq\6\n\4\3qr\t\4\2\2r\u0091\5\22\n\2s"+
		"t\6\n\5\3tu\t\5\2\2u\u0091\5\22\n\2vw\6\n\6\3wx\7\36\2\2x\u0091\5\22\n"+
		"\2yz\6\n\7\3z{\7!\2\2{\u0091\5\22\n\2|}\6\n\b\3}~\7$\2\2~\u0091\5\22\n"+
		"\2\177\u0080\6\n\t\3\u0080\u0081\7\"\2\2\u0081\u0082\5\22\n\2\u0082\u0083"+
		"\7#\2\2\u0083\u0084\5\22\n\2\u0084\u0091\3\2\2\2\u0085\u0086\6\n\n\3\u0086"+
		"\u0087\7\23\2\2\u0087\u0088\5\22\n\2\u0088\u0089\7\24\2\2\u0089\u0091"+
		"\3\2\2\2\u008a\u008b\6\n\13\3\u008b\u008d\7\6\2\2\u008c\u008e\5\24\13"+
		"\2\u008d\u008c\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0091"+
		"\7\7\2\2\u0090j\3\2\2\2\u0090m\3\2\2\2\u0090p\3\2\2\2\u0090s\3\2\2\2\u0090"+
		"v\3\2\2\2\u0090y\3\2\2\2\u0090|\3\2\2\2\u0090\177\3\2\2\2\u0090\u0085"+
		"\3\2\2\2\u0090\u008a\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092"+
		"\u0093\3\2\2\2\u0093\23\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u009a\5\22\n"+
		"\2\u0096\u0097\7\22\2\2\u0097\u0099\5\22\n\2\u0098\u0096\3\2\2\2\u0099"+
		"\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\25\3\2\2"+
		"\2\u009c\u009a\3\2\2\2\u009d\u009e\7\6\2\2\u009e\u009f\5\22\n\2\u009f"+
		"\u00a0\7\7\2\2\u00a0\u00a4\3\2\2\2\u00a1\u00a4\5\30\r\2\u00a2\u00a4\7"+
		"%\2\2\u00a3\u009d\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a2\3\2\2\2\u00a4"+
		"\27\3\2\2\2\u00a5\u00ab\7)\2\2\u00a6\u00ab\7*\2\2\u00a7\u00ab\7\20\2\2"+
		"\u00a8\u00ab\7\21\2\2\u00a9\u00ab\7\'\2\2\u00aa\u00a5\3\2\2\2\u00aa\u00a6"+
		"\3\2\2\2\u00aa\u00a7\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00a9\3\2\2\2\u00ab"+
		"\31\3\2\2\2\20\35$*\64;FT_\u008d\u0090\u0092\u009a\u00a3\u00aa";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}