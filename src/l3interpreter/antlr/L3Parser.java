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
		AND=28, EQ=29, NEQ=30, OR=31, QM=32, CL=33, ASSIGN=34, NEW=35, IMPORT=36, 
		DOT=37, VAR=38, Identifier=39, WS=40, STRING=41, LETTER=42, INTEGER=43, 
		FLOAT=44, COMMENT=45, LINE_COMMENT=46;
	public static final String[] tokenNames = {
		"<INVALID>", "'{'", "'}'", "'def'", "'('", "')'", "'if'", "'else'", "'while'", 
		"'do'", "'return'", "';'", "'break'", "'continue'", "'true'", "'false'", 
		"','", "'['", "']'", "'*'", "'/'", "'%'", "'+'", "'-'", "'<'", "'>'", 
		"'<='", "'>='", "'&&'", "'=='", "'!='", "'||'", "'?'", "':'", "'='", "'new'", 
		"'import'", "'.'", "'var'", "Identifier", "WS", "STRING", "LETTER", "INTEGER", 
		"FLOAT", "COMMENT", "LINE_COMMENT"
	};
	public static final int
		RULE_prog = 0, RULE_finalstatment = 1, RULE_functionDef = 2, RULE_formalParameterDecls = 3, 
		RULE_innerClassName = 4, RULE_creator = 5, RULE_packagePath = 6, RULE_block = 7, 
		RULE_statement = 8, RULE_parExpression = 9, RULE_statementExpression = 10, 
		RULE_expression = 11, RULE_expressionList = 12, RULE_primary = 13, RULE_literal = 14;
	public static final String[] ruleNames = {
		"prog", "finalstatment", "functionDef", "formalParameterDecls", "innerClassName", 
		"creator", "packagePath", "block", "statement", "parExpression", "statementExpression", 
		"expression", "expressionList", "primary", "literal"
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
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LC) | (1L << DEF) | (1L << LA) | (1L << IF) | (1L << WHILE) | (1L << DO) | (1L << RETURN) | (1L << SEMI) | (1L << BREAK) | (1L << CONTINUE) | (1L << TRUE) | (1L << FALSE) | (1L << NEW) | (1L << IMPORT) | (1L << VAR) | (1L << Identifier) | (1L << STRING) | (1L << INTEGER) | (1L << FLOAT))) != 0)) {
				{
				{
				setState(30); finalstatment();
				}
				}
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(36); match(EOF);
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
			setState(40);
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
			case NEW:
			case IMPORT:
			case VAR:
			case Identifier:
			case STRING:
			case INTEGER:
			case FLOAT:
				_localctx = new StatementLabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(38); statement();
				}
				break;
			case DEF:
				_localctx = new FunctionDefLabelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(39); functionDef();
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
			setState(42); match(DEF);
			setState(43); match(Identifier);
			setState(44); match(LA);
			setState(46);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(45); formalParameterDecls();
				}
			}

			setState(48); match(RA);
			setState(49); block();
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
			setState(51); match(Identifier);
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(52); match(COMA);
				setState(53); match(Identifier);
				}
				}
				setState(58);
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

	public static class InnerClassNameContext extends ParserRuleContext {
		public InnerClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerClassName; }
	 
		public InnerClassNameContext() { }
		public void copyFrom(InnerClassNameContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InnerClassNameLabelContext extends InnerClassNameContext {
		public TerminalNode Identifier(int i) {
			return getToken(L3Parser.Identifier, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(L3Parser.Identifier); }
		public InnerClassNameLabelContext(InnerClassNameContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof L3Visitor ) return ((L3Visitor<? extends T>)visitor).visitInnerClassNameLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InnerClassNameContext innerClassName() throws RecognitionException {
		InnerClassNameContext _localctx = new InnerClassNameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_innerClassName);
		int _la;
		try {
			_localctx = new InnerClassNameLabelContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(59); match(Identifier);
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(60); match(DOT);
				setState(61); match(Identifier);
				}
				}
				setState(66);
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

	public static class CreatorContext extends ParserRuleContext {
		public CreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creator; }
	 
		public CreatorContext() { }
		public void copyFrom(CreatorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CreatorLabelContext extends CreatorContext {
		public InnerClassNameContext innerClassName() {
			return getRuleContext(InnerClassNameContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public CreatorLabelContext(CreatorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof L3Visitor ) return ((L3Visitor<? extends T>)visitor).visitCreatorLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreatorContext creator() throws RecognitionException {
		CreatorContext _localctx = new CreatorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_creator);
		int _la;
		try {
			_localctx = new CreatorLabelContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(67); innerClassName();
			setState(68); match(LA);
			setState(70);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LA) | (1L << TRUE) | (1L << FALSE) | (1L << Identifier) | (1L << STRING) | (1L << INTEGER) | (1L << FLOAT))) != 0)) {
				{
				setState(69); expressionList();
				}
			}

			setState(72); match(RA);
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

	public static class PackagePathContext extends ParserRuleContext {
		public PackagePathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packagePath; }
	 
		public PackagePathContext() { }
		public void copyFrom(PackagePathContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PackagePathLabelContext extends PackagePathContext {
		public TerminalNode Identifier(int i) {
			return getToken(L3Parser.Identifier, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(L3Parser.Identifier); }
		public PackagePathLabelContext(PackagePathContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof L3Visitor ) return ((L3Visitor<? extends T>)visitor).visitPackagePathLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackagePathContext packagePath() throws RecognitionException {
		PackagePathContext _localctx = new PackagePathContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_packagePath);
		int _la;
		try {
			_localctx = new PackagePathLabelContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(74); match(Identifier);
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(75); match(DOT);
				setState(76); match(Identifier);
				}
				}
				setState(81);
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
		enterRule(_localctx, 14, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82); match(LC);
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LC) | (1L << LA) | (1L << IF) | (1L << WHILE) | (1L << DO) | (1L << RETURN) | (1L << SEMI) | (1L << BREAK) | (1L << CONTINUE) | (1L << TRUE) | (1L << FALSE) | (1L << NEW) | (1L << IMPORT) | (1L << VAR) | (1L << Identifier) | (1L << STRING) | (1L << INTEGER) | (1L << FLOAT))) != 0)) {
				{
				{
				setState(83); statement();
				}
				}
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(89); match(RC);
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
	public static class NewLabelContext extends StatementContext {
		public CreatorContext creator() {
			return getRuleContext(CreatorContext.class,0);
		}
		public NewLabelContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof L3Visitor ) return ((L3Visitor<? extends T>)visitor).visitNewLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarDefLabelContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(L3Parser.Identifier, 0); }
		public VarDefLabelContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof L3Visitor ) return ((L3Visitor<? extends T>)visitor).visitVarDefLabel(this);
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
	public static class ImportLabelContext extends StatementContext {
		public PackagePathContext packagePath() {
			return getRuleContext(PackagePathContext.class,0);
		}
		public ImportLabelContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof L3Visitor ) return ((L3Visitor<? extends T>)visitor).visitImportLabel(this);
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
		enterRule(_localctx, 16, RULE_statement);
		int _la;
		try {
			setState(134);
			switch (_input.LA(1)) {
			case LC:
				_localctx = new BlockLabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(91); block();
				}
				break;
			case IF:
				_localctx = new IfLabelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(92); match(IF);
				setState(93); parExpression();
				setState(94); statement();
				setState(97);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(95); match(ELSE);
					setState(96); statement();
					}
					break;
				}
				}
				break;
			case WHILE:
				_localctx = new WhileLabelContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(99); match(WHILE);
				setState(100); parExpression();
				setState(101); statement();
				}
				break;
			case DO:
				_localctx = new DoLabelContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(103); match(DO);
				setState(104); statement();
				setState(105); match(WHILE);
				setState(106); parExpression();
				setState(107); match(SEMI);
				}
				break;
			case RETURN:
				_localctx = new ReturnLabelContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(109); match(RETURN);
				setState(111);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LA) | (1L << TRUE) | (1L << FALSE) | (1L << Identifier) | (1L << STRING) | (1L << INTEGER) | (1L << FLOAT))) != 0)) {
					{
					setState(110); expression(0);
					}
				}

				setState(113); match(SEMI);
				}
				break;
			case BREAK:
				_localctx = new BreakLabelContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(114); match(BREAK);
				setState(115); match(SEMI);
				}
				break;
			case CONTINUE:
				_localctx = new ContinueLabelContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(116); match(CONTINUE);
				setState(117); match(SEMI);
				}
				break;
			case NEW:
				_localctx = new NewLabelContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(118); match(NEW);
				setState(119); creator();
				setState(120); match(SEMI);
				}
				break;
			case VAR:
				_localctx = new VarDefLabelContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(122); match(VAR);
				setState(123); match(Identifier);
				setState(126);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(124); match(ASSIGN);
					setState(125); expression(0);
					}
				}

				}
				break;
			case IMPORT:
				_localctx = new ImportLabelContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(128); match(IMPORT);
				setState(129); packagePath();
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
				enterOuterAlt(_localctx, 11);
				{
				setState(130); statementExpression();
				setState(131); match(SEMI);
				}
				break;
			case SEMI:
				_localctx = new SemiLabelContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(133); match(SEMI);
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
		enterRule(_localctx, 18, RULE_parExpression);
		try {
			_localctx = new ParExpressoinLabelContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(136); match(LA);
			setState(137); expression(0);
			setState(138); match(RA);
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
		enterRule(_localctx, 20, RULE_statementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140); expression(0);
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
	public static class CallMemberLabelContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(L3Parser.Identifier, 0); }
		public CallMemberLabelContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof L3Visitor ) return ((L3Visitor<? extends T>)visitor).visitCallMemberLabel(this);
			else return visitor.visitChildren(this);
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
	public static class CallMethodLabelContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(L3Parser.Identifier, 0); }
		public CallMethodLabelContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof L3Visitor ) return ((L3Visitor<? extends T>)visitor).visitCallMethodLabel(this);
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
		int _startState = 22;
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

			setState(143); primary();
			}
			_ctx.stop = _input.LT(-1);
			setState(196);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(194);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivModLabelContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(145);
						if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
						setState(146);
						((MulDivModLabelContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((MulDivModLabelContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(147); expression(9);
						}
						break;

					case 2:
						{
						_localctx = new AddSubLabelContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(148);
						if (!(7 >= _localctx._p)) throw new FailedPredicateException(this, "7 >= $_p");
						setState(149);
						((AddSubLabelContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AddSubLabelContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(150); expression(8);
						}
						break;

					case 3:
						{
						_localctx = new ConditionLabelContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(151);
						if (!(6 >= _localctx._p)) throw new FailedPredicateException(this, "6 >= $_p");
						setState(152);
						((ConditionLabelContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << GT) | (1L << LET) | (1L << GET))) != 0)) ) {
							((ConditionLabelContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(153); expression(7);
						}
						break;

					case 4:
						{
						_localctx = new IsEqualLabelContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(154);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(155);
						((IsEqualLabelContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQ || _la==NEQ) ) {
							((IsEqualLabelContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(156); expression(6);
						}
						break;

					case 5:
						{
						_localctx = new AndLabelContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(157);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(158); match(AND);
						setState(159); expression(5);
						}
						break;

					case 6:
						{
						_localctx = new OrLabelContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(160);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(161); match(OR);
						setState(162); expression(4);
						}
						break;

					case 7:
						{
						_localctx = new AssignLabelContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(163);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(164); match(ASSIGN);
						setState(165); expression(1);
						}
						break;

					case 8:
						{
						_localctx = new FastConditionLabelContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(166);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(167); match(QM);
						setState(168); expression(0);
						setState(169); match(CL);
						setState(170); expression(3);
						}
						break;

					case 9:
						{
						_localctx = new IndexVisitLabelContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(172);
						if (!(12 >= _localctx._p)) throw new FailedPredicateException(this, "12 >= $_p");
						setState(173); match(LB);
						setState(174); expression(0);
						setState(175); match(RB);
						}
						break;

					case 10:
						{
						_localctx = new CallFunctionLabelContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(177);
						if (!(11 >= _localctx._p)) throw new FailedPredicateException(this, "11 >= $_p");
						setState(178); match(LA);
						setState(180);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LA) | (1L << TRUE) | (1L << FALSE) | (1L << Identifier) | (1L << STRING) | (1L << INTEGER) | (1L << FLOAT))) != 0)) {
							{
							setState(179); expressionList();
							}
						}

						setState(182); match(RA);
						}
						break;

					case 11:
						{
						_localctx = new CallMethodLabelContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(183);
						if (!(10 >= _localctx._p)) throw new FailedPredicateException(this, "10 >= $_p");
						setState(184); match(DOT);
						setState(185); match(Identifier);
						setState(186); match(LA);
						setState(188);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LA) | (1L << TRUE) | (1L << FALSE) | (1L << Identifier) | (1L << STRING) | (1L << INTEGER) | (1L << FLOAT))) != 0)) {
							{
							setState(187); expressionList();
							}
						}

						setState(190); match(RA);
						}
						break;

					case 12:
						{
						_localctx = new CallMemberLabelContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(191);
						if (!(9 >= _localctx._p)) throw new FailedPredicateException(this, "9 >= $_p");
						setState(192); match(DOT);
						setState(193); match(Identifier);
						}
						break;
					}
					} 
				}
				setState(198);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
		enterRule(_localctx, 24, RULE_expressionList);
		int _la;
		try {
			_localctx = new ExpressionListLabelContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(199); expression(0);
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(200); match(COMA);
				setState(201); expression(0);
				}
				}
				setState(206);
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
		enterRule(_localctx, 26, RULE_primary);
		try {
			setState(213);
			switch (_input.LA(1)) {
			case LA:
				_localctx = new BrackerExpressionLabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(207); match(LA);
				setState(208); expression(0);
				setState(209); match(RA);
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
				setState(211); literal();
				}
				break;
			case Identifier:
				_localctx = new IdentifierLabelContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(212); match(Identifier);
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
		enterRule(_localctx, 28, RULE_literal);
		try {
			setState(220);
			switch (_input.LA(1)) {
			case INTEGER:
				_localctx = new IntegerLabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(215); match(INTEGER);
				}
				break;
			case FLOAT:
				_localctx = new FloatLabelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(216); match(FLOAT);
				}
				break;
			case TRUE:
				_localctx = new TrueLabelContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(217); match(TRUE);
				}
				break;
			case FALSE:
				_localctx = new FalseLabelContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(218); match(FALSE);
				}
				break;
			case STRING:
				_localctx = new StringLabelContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(219); match(STRING);
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
		case 11: return expression_sempred((ExpressionContext)_localctx, predIndex);
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

		case 8: return 12 >= _localctx._p;

		case 9: return 11 >= _localctx._p;

		case 10: return 10 >= _localctx._p;

		case 11: return 9 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\2\3\60\u00e1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b"+
		"\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t"+
		"\20\3\2\7\2\"\n\2\f\2\16\2%\13\2\3\2\3\2\3\3\3\3\5\3+\n\3\3\4\3\4\3\4"+
		"\3\4\5\4\61\n\4\3\4\3\4\3\4\3\5\3\5\3\5\7\59\n\5\f\5\16\5<\13\5\3\6\3"+
		"\6\3\6\7\6A\n\6\f\6\16\6D\13\6\3\7\3\7\3\7\5\7I\n\7\3\7\3\7\3\b\3\b\3"+
		"\b\7\bP\n\b\f\b\16\bS\13\b\3\t\3\t\7\tW\n\t\f\t\16\tZ\13\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\5\nd\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\5\nr\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\5\n\u0081\n\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0089\n\n\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00b7\n\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00bf"+
		"\n\r\3\r\3\r\3\r\3\r\7\r\u00c5\n\r\f\r\16\r\u00c8\13\r\3\16\3\16\3\16"+
		"\7\16\u00cd\n\16\f\16\16\16\u00d0\13\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\5\17\u00d8\n\17\3\20\3\20\3\20\3\20\3\20\5\20\u00df\n\20\3\20\2\21\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\6\3\25\27\3\30\31\3\32\35\3\37"+
		" \u00fc\2#\3\2\2\2\4*\3\2\2\2\6,\3\2\2\2\b\65\3\2\2\2\n=\3\2\2\2\fE\3"+
		"\2\2\2\16L\3\2\2\2\20T\3\2\2\2\22\u0088\3\2\2\2\24\u008a\3\2\2\2\26\u008e"+
		"\3\2\2\2\30\u0090\3\2\2\2\32\u00c9\3\2\2\2\34\u00d7\3\2\2\2\36\u00de\3"+
		"\2\2\2 \"\5\4\3\2! \3\2\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2\2\2$&\3\2\2\2%"+
		"#\3\2\2\2&\'\7\1\2\2\'\3\3\2\2\2(+\5\22\n\2)+\5\6\4\2*(\3\2\2\2*)\3\2"+
		"\2\2+\5\3\2\2\2,-\7\5\2\2-.\7)\2\2.\60\7\6\2\2/\61\5\b\5\2\60/\3\2\2\2"+
		"\60\61\3\2\2\2\61\62\3\2\2\2\62\63\7\7\2\2\63\64\5\20\t\2\64\7\3\2\2\2"+
		"\65:\7)\2\2\66\67\7\22\2\2\679\7)\2\28\66\3\2\2\29<\3\2\2\2:8\3\2\2\2"+
		":;\3\2\2\2;\t\3\2\2\2<:\3\2\2\2=B\7)\2\2>?\7\'\2\2?A\7)\2\2@>\3\2\2\2"+
		"AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2C\13\3\2\2\2DB\3\2\2\2EF\5\n\6\2FH\7\6\2"+
		"\2GI\5\32\16\2HG\3\2\2\2HI\3\2\2\2IJ\3\2\2\2JK\7\7\2\2K\r\3\2\2\2LQ\7"+
		")\2\2MN\7\'\2\2NP\7)\2\2OM\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2R\17\3"+
		"\2\2\2SQ\3\2\2\2TX\7\3\2\2UW\5\22\n\2VU\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY"+
		"\3\2\2\2Y[\3\2\2\2ZX\3\2\2\2[\\\7\4\2\2\\\21\3\2\2\2]\u0089\5\20\t\2^"+
		"_\7\b\2\2_`\5\24\13\2`c\5\22\n\2ab\7\t\2\2bd\5\22\n\2ca\3\2\2\2cd\3\2"+
		"\2\2d\u0089\3\2\2\2ef\7\n\2\2fg\5\24\13\2gh\5\22\n\2h\u0089\3\2\2\2ij"+
		"\7\13\2\2jk\5\22\n\2kl\7\n\2\2lm\5\24\13\2mn\7\r\2\2n\u0089\3\2\2\2oq"+
		"\7\f\2\2pr\5\30\r\2qp\3\2\2\2qr\3\2\2\2rs\3\2\2\2s\u0089\7\r\2\2tu\7\16"+
		"\2\2u\u0089\7\r\2\2vw\7\17\2\2w\u0089\7\r\2\2xy\7%\2\2yz\5\f\7\2z{\7\r"+
		"\2\2{\u0089\3\2\2\2|}\7(\2\2}\u0080\7)\2\2~\177\7$\2\2\177\u0081\5\30"+
		"\r\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0089\3\2\2\2\u0082\u0083"+
		"\7&\2\2\u0083\u0089\5\16\b\2\u0084\u0085\5\26\f\2\u0085\u0086\7\r\2\2"+
		"\u0086\u0089\3\2\2\2\u0087\u0089\7\r\2\2\u0088]\3\2\2\2\u0088^\3\2\2\2"+
		"\u0088e\3\2\2\2\u0088i\3\2\2\2\u0088o\3\2\2\2\u0088t\3\2\2\2\u0088v\3"+
		"\2\2\2\u0088x\3\2\2\2\u0088|\3\2\2\2\u0088\u0082\3\2\2\2\u0088\u0084\3"+
		"\2\2\2\u0088\u0087\3\2\2\2\u0089\23\3\2\2\2\u008a\u008b\7\6\2\2\u008b"+
		"\u008c\5\30\r\2\u008c\u008d\7\7\2\2\u008d\25\3\2\2\2\u008e\u008f\5\30"+
		"\r\2\u008f\27\3\2\2\2\u0090\u0091\b\r\1\2\u0091\u0092\5\34\17\2\u0092"+
		"\u00c6\3\2\2\2\u0093\u0094\6\r\2\3\u0094\u0095\t\2\2\2\u0095\u00c5\5\30"+
		"\r\2\u0096\u0097\6\r\3\3\u0097\u0098\t\3\2\2\u0098\u00c5\5\30\r\2\u0099"+
		"\u009a\6\r\4\3\u009a\u009b\t\4\2\2\u009b\u00c5\5\30\r\2\u009c\u009d\6"+
		"\r\5\3\u009d\u009e\t\5\2\2\u009e\u00c5\5\30\r\2\u009f\u00a0\6\r\6\3\u00a0"+
		"\u00a1\7\36\2\2\u00a1\u00c5\5\30\r\2\u00a2\u00a3\6\r\7\3\u00a3\u00a4\7"+
		"!\2\2\u00a4\u00c5\5\30\r\2\u00a5\u00a6\6\r\b\3\u00a6\u00a7\7$\2\2\u00a7"+
		"\u00c5\5\30\r\2\u00a8\u00a9\6\r\t\3\u00a9\u00aa\7\"\2\2\u00aa\u00ab\5"+
		"\30\r\2\u00ab\u00ac\7#\2\2\u00ac\u00ad\5\30\r\2\u00ad\u00c5\3\2\2\2\u00ae"+
		"\u00af\6\r\n\3\u00af\u00b0\7\23\2\2\u00b0\u00b1\5\30\r\2\u00b1\u00b2\7"+
		"\24\2\2\u00b2\u00c5\3\2\2\2\u00b3\u00b4\6\r\13\3\u00b4\u00b6\7\6\2\2\u00b5"+
		"\u00b7\5\32\16\2\u00b6\u00b5\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\3"+
		"\2\2\2\u00b8\u00c5\7\7\2\2\u00b9\u00ba\6\r\f\3\u00ba\u00bb\7\'\2\2\u00bb"+
		"\u00bc\7)\2\2\u00bc\u00be\7\6\2\2\u00bd\u00bf\5\32\16\2\u00be\u00bd\3"+
		"\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c5\7\7\2\2\u00c1"+
		"\u00c2\6\r\r\3\u00c2\u00c3\7\'\2\2\u00c3\u00c5\7)\2\2\u00c4\u0093\3\2"+
		"\2\2\u00c4\u0096\3\2\2\2\u00c4\u0099\3\2\2\2\u00c4\u009c\3\2\2\2\u00c4"+
		"\u009f\3\2\2\2\u00c4\u00a2\3\2\2\2\u00c4\u00a5\3\2\2\2\u00c4\u00a8\3\2"+
		"\2\2\u00c4\u00ae\3\2\2\2\u00c4\u00b3\3\2\2\2\u00c4\u00b9\3\2\2\2\u00c4"+
		"\u00c1\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2"+
		"\2\2\u00c7\31\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00ce\5\30\r\2\u00ca\u00cb"+
		"\7\22\2\2\u00cb\u00cd\5\30\r\2\u00cc\u00ca\3\2\2\2\u00cd\u00d0\3\2\2\2"+
		"\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\33\3\2\2\2\u00d0\u00ce"+
		"\3\2\2\2\u00d1\u00d2\7\6\2\2\u00d2\u00d3\5\30\r\2\u00d3\u00d4\7\7\2\2"+
		"\u00d4\u00d8\3\2\2\2\u00d5\u00d8\5\36\20\2\u00d6\u00d8\7)\2\2\u00d7\u00d1"+
		"\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d6\3\2\2\2\u00d8\35\3\2\2\2\u00d9"+
		"\u00df\7-\2\2\u00da\u00df\7.\2\2\u00db\u00df\7\20\2\2\u00dc\u00df\7\21"+
		"\2\2\u00dd\u00df\7+\2\2\u00de\u00d9\3\2\2\2\u00de\u00da\3\2\2\2\u00de"+
		"\u00db\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00dd\3\2\2\2\u00df\37\3\2\2"+
		"\2\25#*\60:BHQXcq\u0080\u0088\u00b6\u00be\u00c4\u00c6\u00ce\u00d7\u00de";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}