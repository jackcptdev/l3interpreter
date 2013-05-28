package l3interpreter.inter;

import java.io.OutputStream;
import java.io.PrintStream;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import l3interpreter.antlr.L3BaseVisitor;
import l3interpreter.antlr.L3Parser.AddSubLabelContext;
import l3interpreter.antlr.L3Parser.AndLabelContext;
import l3interpreter.antlr.L3Parser.AssignLabelContext;
import l3interpreter.antlr.L3Parser.BlockContext;
import l3interpreter.antlr.L3Parser.BlockLabelContext;
import l3interpreter.antlr.L3Parser.BrackerExpressionLabelContext;
import l3interpreter.antlr.L3Parser.BreakLabelContext;
import l3interpreter.antlr.L3Parser.CallFunctionLabelContext;
import l3interpreter.antlr.L3Parser.ConditionLabelContext;
import l3interpreter.antlr.L3Parser.ContinueLabelContext;
import l3interpreter.antlr.L3Parser.DoLabelContext;
import l3interpreter.antlr.L3Parser.ExpressionListLabelContext;
import l3interpreter.antlr.L3Parser.FalseLabelContext;
import l3interpreter.antlr.L3Parser.FastConditionLabelContext;
import l3interpreter.antlr.L3Parser.FloatLabelContext;
import l3interpreter.antlr.L3Parser.FunctionDefContext;
import l3interpreter.antlr.L3Parser.FunctionDefLabelContext;
import l3interpreter.antlr.L3Parser.FunctionParameterDefLabelContext;
import l3interpreter.antlr.L3Parser.IdentifierLabelContext;
import l3interpreter.antlr.L3Parser.IfLabelContext;
import l3interpreter.antlr.L3Parser.IndexVisitLabelContext;
import l3interpreter.antlr.L3Parser.IntegerLabelContext;
import l3interpreter.antlr.L3Parser.IsEqualLabelContext;
import l3interpreter.antlr.L3Parser.LiteralLabelContext;
import l3interpreter.antlr.L3Parser.MulDivModLabelContext;
import l3interpreter.antlr.L3Parser.OrLabelContext;
import l3interpreter.antlr.L3Parser.ParExpressoinLabelContext;
import l3interpreter.antlr.L3Parser.PrimaryLabelContext;
import l3interpreter.antlr.L3Parser.ProgContext;
import l3interpreter.antlr.L3Parser.ReturnLabelContext;
import l3interpreter.antlr.L3Parser.SemiLabelContext;
import l3interpreter.antlr.L3Parser.StatementExpressionContext;
import l3interpreter.antlr.L3Parser.StatementExpressionLabelContext;
import l3interpreter.antlr.L3Parser.StatementLabelContext;
import l3interpreter.antlr.L3Parser.StringLabelContext;
import l3interpreter.antlr.L3Parser.TrueLabelContext;
import l3interpreter.antlr.L3Parser.WhileLabelContext;

public class InterpreterImpl extends L3BaseVisitor<Identity> {
	private final PrintStream stdOut;
	private final PrintStream errOut;

	public InterpreterImpl(OutputStream stdOut, OutputStream errOut) {
		this.stdOut = new PrintStream(stdOut);
		this.errOut = new PrintStream(errOut);
	}

	@Override
	public Identity visitFunctionDef(FunctionDefContext ctx) {
		// TODO Auto-generated method stub
		this.stdOut.println("Visit function def.");
		int i = 1;
		return super.visitFunctionDef(ctx);
	}

	@Override
	public Identity visitStatementLabel(StatementLabelContext ctx) {
		// TODO Auto-generated method stub
		return super.visitStatementLabel(ctx);
	}

	@Override
	public Identity visitStatementExpression(StatementExpressionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitStatementExpression(ctx);
	}

	@Override
	public Identity visitIfLabel(IfLabelContext ctx) {
		// TODO Auto-generated method stub
		return super.visitIfLabel(ctx);
	}

	@Override
	public Identity visitStringLabel(StringLabelContext ctx) {
		// TODO Auto-generated method stub
		return super.visitStringLabel(ctx);
	}

	@Override
	public Identity visitBlock(BlockContext ctx) {
		// TODO Auto-generated method stub
		return super.visitBlock(ctx);
	}

	@Override
	public Identity visitFalseLabel(FalseLabelContext ctx) {
		// TODO Auto-generated method stub
		return super.visitFalseLabel(ctx);
	}

	@Override
	public Identity visitParExpressoinLabel(ParExpressoinLabelContext ctx) {
		// TODO Auto-generated method stub
		return super.visitParExpressoinLabel(ctx);
	}

	@Override
	public Identity visitFunctionParameterDefLabel(
			FunctionParameterDefLabelContext ctx) {
		// TODO Auto-generated method stub
		return super.visitFunctionParameterDefLabel(ctx);
	}

	@Override
	public Identity visitLiteralLabel(LiteralLabelContext ctx) {
		// TODO Auto-generated method stub
		return super.visitLiteralLabel(ctx);
	}

	@Override
	public Identity visitContinueLabel(ContinueLabelContext ctx) {
		// TODO Auto-generated method stub
		return super.visitContinueLabel(ctx);
	}

	@Override
	public Identity visitBlockLabel(BlockLabelContext ctx) {
		// TODO Auto-generated method stub
		return super.visitBlockLabel(ctx);
	}

	@Override
	public Identity visitBreakLabel(BreakLabelContext ctx) {
		// TODO Auto-generated method stub
		return super.visitBreakLabel(ctx);
	}

	@Override
	public Identity visitExpressionListLabel(ExpressionListLabelContext ctx) {
		// TODO Auto-generated method stub
		return super.visitExpressionListLabel(ctx);
	}

	@Override
	public Identity visitIndexVisitLabel(IndexVisitLabelContext ctx) {
		// TODO Auto-generated method stub
		return super.visitIndexVisitLabel(ctx);
	}

	@Override
	public Identity visitProg(ProgContext ctx) {
		// TODO Auto-generated method stub
		return super.visitProg(ctx);
	}

	@Override
	public Identity visitFloatLabel(FloatLabelContext ctx) {
		// TODO Auto-generated method stub
		return super.visitFloatLabel(ctx);
	}

	@Override
	public Identity visitIntegerLabel(IntegerLabelContext ctx) {
		// TODO Auto-generated method stub
		return super.visitIntegerLabel(ctx);
	}

	@Override
	public Identity visitAndLabel(AndLabelContext ctx) {
		// TODO Auto-generated method stub
		return super.visitAndLabel(ctx);
	}

	@Override
	public Identity visitFastConditionLabel(FastConditionLabelContext ctx) {
		// TODO Auto-generated method stub
		return super.visitFastConditionLabel(ctx);
	}

	@Override
	public Identity visitReturnLabel(ReturnLabelContext ctx) {
		// TODO Auto-generated method stub
		return super.visitReturnLabel(ctx);
	}

	@Override
	public Identity visitStatementExpressionLabel(
			StatementExpressionLabelContext ctx) {
		// TODO Auto-generated method stub
		return super.visitStatementExpressionLabel(ctx);
	}

	@Override
	public Identity visitIsEqualLabel(IsEqualLabelContext ctx) {
		// TODO Auto-generated method stub
		return super.visitIsEqualLabel(ctx);
	}

	@Override
	public Identity visitIdentifierLabel(IdentifierLabelContext ctx) {
		// TODO Auto-generated method stub
		return super.visitIdentifierLabel(ctx);
	}

	@Override
	public Identity visitBrackerExpressionLabel(
			BrackerExpressionLabelContext ctx) {
		// TODO Auto-generated method stub
		return super.visitBrackerExpressionLabel(ctx);
	}

	@Override
	public Identity visitMulDivModLabel(MulDivModLabelContext ctx) {
		// TODO Auto-generated method stub
		return super.visitMulDivModLabel(ctx);
	}

	@Override
	public Identity visitFunctionDefLabel(FunctionDefLabelContext ctx) {
		// TODO Auto-generated method stub
		return super.visitFunctionDefLabel(ctx);
	}

	@Override
	public Identity visitTrueLabel(TrueLabelContext ctx) {
		// TODO Auto-generated method stub
		return super.visitTrueLabel(ctx);
	}

	@Override
	public Identity visitSemiLabel(SemiLabelContext ctx) {
		// TODO Auto-generated method stub
		return super.visitSemiLabel(ctx);
	}

	@Override
	public Identity visitAssignLabel(AssignLabelContext ctx) {
		this.stdOut.println("Visit assign.");
		return super.visitAssignLabel(ctx);
	}

	@Override
	public Identity visitConditionLabel(ConditionLabelContext ctx) {
		// TODO Auto-generated method stub
		return super.visitConditionLabel(ctx);
	}

	@Override
	public Identity visitAddSubLabel(AddSubLabelContext ctx) {
		// TODO Auto-generated method stub
		return super.visitAddSubLabel(ctx);
	}

	@Override
	public Identity visitPrimaryLabel(PrimaryLabelContext ctx) {
		// TODO Auto-generated method stub
		return super.visitPrimaryLabel(ctx);
	}

	@Override
	public Identity visitWhileLabel(WhileLabelContext ctx) {
		// TODO Auto-generated method stub
		return super.visitWhileLabel(ctx);
	}

	@Override
	public Identity visitDoLabel(DoLabelContext ctx) {
		// TODO Auto-generated method stub
		return super.visitDoLabel(ctx);
	}

	@Override
	public Identity visitOrLabel(OrLabelContext ctx) {
		// TODO Auto-generated method stub
		return super.visitOrLabel(ctx);
	}

	@Override
	public Identity visitCallFunctionLabel(CallFunctionLabelContext ctx) {
		// TODO Auto-generated method stub
		return super.visitCallFunctionLabel(ctx);
	}

	@Override
	protected Identity aggregateResult(Identity aggregate, Identity nextResult) {
		// TODO Auto-generated method stub
		return super.aggregateResult(aggregate, nextResult);
	}

	@Override
	protected Identity defaultResult() {
		// TODO Auto-generated method stub
		return super.defaultResult();
	}

	@Override
	protected boolean shouldVisitNextChild(RuleNode node, Identity currentResult) {
		// TODO Auto-generated method stub
		return super.shouldVisitNextChild(node, currentResult);
	}

	@Override
	public Identity visit(ParseTree tree) {
		// TODO Auto-generated method stub
		return super.visit(tree);
	}

	@Override
	public Identity visitChildren(RuleNode arg0) {
		// TODO Auto-generated method stub
		return super.visitChildren(arg0);
	}

	@Override
	public Identity visitErrorNode(ErrorNode node) {
		// TODO Auto-generated method stub
		return super.visitErrorNode(node);
	}

	@Override
	public Identity visitTerminal(TerminalNode node) {
		// TODO Auto-generated method stub
		return super.visitTerminal(node);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		return super.equals(arg0);
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
