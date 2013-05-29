// Generated from L3.g4 by ANTLR 4.0
package l3interpreter.antlr;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface L3Visitor<T> extends ParseTreeVisitor<T> {
	T visitFunctionDef(L3Parser.FunctionDefContext ctx);

	T visitStatementLabel(L3Parser.StatementLabelContext ctx);

	T visitStatementExpression(L3Parser.StatementExpressionContext ctx);

	T visitIfLabel(L3Parser.IfLabelContext ctx);

	T visitStringLabel(L3Parser.StringLabelContext ctx);

	T visitBlock(L3Parser.BlockContext ctx);

	T visitFalseLabel(L3Parser.FalseLabelContext ctx);

	T visitParExpressoinLabel(L3Parser.ParExpressoinLabelContext ctx);

	T visitPrintLabel(L3Parser.PrintLabelContext ctx);

	T visitFunctionParameterDefLabel(L3Parser.FunctionParameterDefLabelContext ctx);

	T visitLiteralLabel(L3Parser.LiteralLabelContext ctx);

	T visitContinueLabel(L3Parser.ContinueLabelContext ctx);

	T visitBlockLabel(L3Parser.BlockLabelContext ctx);

	T visitBreakLabel(L3Parser.BreakLabelContext ctx);

	T visitExpressionListLabel(L3Parser.ExpressionListLabelContext ctx);

	T visitIndexVisitLabel(L3Parser.IndexVisitLabelContext ctx);

	T visitProg(L3Parser.ProgContext ctx);

	T visitAndLabel(L3Parser.AndLabelContext ctx);

	T visitFastConditionLabel(L3Parser.FastConditionLabelContext ctx);

	T visitReturnLabel(L3Parser.ReturnLabelContext ctx);

	T visitStatementExpressionLabel(L3Parser.StatementExpressionLabelContext ctx);

	T visitIsEqualLabel(L3Parser.IsEqualLabelContext ctx);

	T visitIdentifierLabel(L3Parser.IdentifierLabelContext ctx);

	T visitBrackerExpressionLabel(L3Parser.BrackerExpressionLabelContext ctx);

	T visitMulDivModLabel(L3Parser.MulDivModLabelContext ctx);

	T visitFloatLabel(L3Parser.FloatLabelContext ctx);

	T visitFunctionDefLabel(L3Parser.FunctionDefLabelContext ctx);

	T visitTrueLabel(L3Parser.TrueLabelContext ctx);

	T visitIntegerLabel(L3Parser.IntegerLabelContext ctx);

	T visitAssignLabel(L3Parser.AssignLabelContext ctx);

	T visitSemiLabel(L3Parser.SemiLabelContext ctx);

	T visitConditionLabel(L3Parser.ConditionLabelContext ctx);

	T visitAddSubLabel(L3Parser.AddSubLabelContext ctx);

	T visitPrimaryLabel(L3Parser.PrimaryLabelContext ctx);

	T visitWhileLabel(L3Parser.WhileLabelContext ctx);

	T visitDoLabel(L3Parser.DoLabelContext ctx);

	T visitOrLabel(L3Parser.OrLabelContext ctx);

	T visitCallFunctionLabel(L3Parser.CallFunctionLabelContext ctx);
}