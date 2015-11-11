package wacc.semantics;

import org.antlr.v4.runtime.misc.NotNull;

import wacc.antlr.*;

public class MyVisitor extends WACCParserBaseVisitor<Void> {
	
	@Override
	public Void visitProgram(WACCParser.ProgramContext ctx) {
		System.out.println("Visiting 'Program' node");
		return visitChildren(ctx);
	}
	
	@Override
	public Void visitFunc(WACCParser.FuncContext ctx) {
		System.out.println("Visiting 'Function' node");
//		System.out.println("I found a function definition!");
//		System.out.println(ctx.ident().getText());
//		System.out.print("Type info: ");
//		for (int i = 0; i < ctx.param_list().depth(); i++) {
//			visit(ctx.param_list().getChild(i));
//		}
//		System.out.print(" => ");
//		visitChildren(ctx.param_list());
		return visitChildren(ctx);
	}

	@Override
	public Void visitParam(@NotNull WACCParser.ParamContext ctx) {
		System.out.println("Visiting 'Param' node");
		return visitChildren(ctx);
	}

	@Override
	public Void visitBinary_op(@NotNull WACCParser.Binary_opContext ctx) {
		System.out.println("Visiting 'Binary_op' node");
		return visitChildren(ctx);
	}

	@Override
	public Void visitArray_lit(@NotNull WACCParser.Array_litContext ctx) {
		System.out.println("Visiting 'Array_lit' node");
		return visitChildren(ctx);
	}

	@Override
	public Void visitSkip(@NotNull WACCParser.SkipContext ctx) {
		System.out.println("Visiting 'Skip' node");
		return visitChildren(ctx);
	}

	@Override
	public Void visitWhile(@NotNull WACCParser.WhileContext ctx) {
		System.out.println("Visiting 'While' node");
		return visitChildren(ctx);
	}

	@Override
	public Void visitFree(@NotNull WACCParser.FreeContext ctx) {
		System.out.println("Visiting 'Free' node");
		return visitChildren(ctx);
	}

	@Override
	public Void visitIdent(@NotNull WACCParser.IdentContext ctx) {
		System.out.println("Visiting 'Ident' node");
		return visitChildren(ctx);
	}

	@Override
	public Void visitPrintln(@NotNull WACCParser.PrintlnContext ctx) {
		System.out.println("Visiting 'Println' node");
		return visitChildren(ctx);
	}

	@Override
	public Void visitInitialisation(@NotNull WACCParser.InitialisationContext ctx) {
		System.out.println("Visiting 'Initialisation' node");
		return visitChildren(ctx);
	}

	@Override
	public Void visitIf(@NotNull WACCParser.IfContext ctx) {
		System.out.println("Visiting 'If' node");
		return visitChildren(ctx);
	}

	@Override
	public Void visitRead(@NotNull WACCParser.ReadContext ctx) {
		System.out.println("Visiting 'Read' node");
		return visitChildren(ctx);
	}

	@Override
	public Void visitArray_type(@NotNull WACCParser.Array_typeContext ctx) {
		System.out.println("Visiting 'Array_type' node");
		return visitChildren(ctx);
	}

	@Override
	public Void visitPair_elem(@NotNull WACCParser.Pair_elemContext ctx) {
		System.out.println("Visiting 'Pair_elem' node");
		return visitChildren(ctx);
	}

	@Override
	public Void visitReturn(@NotNull WACCParser.ReturnContext ctx) {
		System.out.println("Visiting 'Return' node");
		return visitChildren(ctx);
	}

	@Override
	public Void visitNumber(@NotNull WACCParser.NumberContext ctx) {
		System.out.println("Visiting 'Number' node");
		return visitChildren(ctx);
	}

	@Override
	public Void visitBase_type(@NotNull WACCParser.Base_typeContext ctx) {
		System.out.println("Visiting 'Base_type' node");
		return visitChildren(ctx);
	}

	@Override
	public Void visitPair_type(@NotNull WACCParser.Pair_typeContext ctx) {
		System.out.println("Visiting 'Pair_type' node");
		return visitChildren(ctx);
	}

	@Override
	public Void visitAssign_lhs(@NotNull WACCParser.Assign_lhsContext ctx) {
		System.out.println("Visiting 'Assign_lhs' node");
		return visitChildren(ctx);
	}

	@Override
	public Void visitPrint(@NotNull WACCParser.PrintContext ctx) {
		System.out.println("Visiting 'Print' node");
		return visitChildren(ctx);
	}

	@Override
	public Void visitExit(@NotNull WACCParser.ExitContext ctx) {
		System.out.println("Visiting 'Exit' node");
		return visitChildren(ctx);
	}

	@Override
	public Void visitParam_list(@NotNull WACCParser.Param_listContext ctx) {
		System.out.println("Visiting 'Param_list' node");
		return visitChildren(ctx);
	}

	@Override
	public Void visitBegin(@NotNull WACCParser.BeginContext ctx) {
		System.out.println("Visiting 'Begin' node");
		return visitChildren(ctx);
	}

	@Override
	public Void visitInt_lit(@NotNull WACCParser.Int_litContext ctx) {
		System.out.println("Visiting 'Int Lit' node");
		return visitChildren(ctx);
	}

	@Override
	public Void visitExp(@NotNull WACCParser.ExpContext ctx) {
		System.out.println("Visiting 'Exp' node");
		return visitChildren(ctx);
	}

	@Override
	public Void visitArg_list(@NotNull WACCParser.Arg_listContext ctx) {
		System.out.println("Visiting 'Arg List' node");
		return visitChildren(ctx);
	}

	@Override
	public Void visitAssignment(@NotNull WACCParser.AssignmentContext ctx) {
		System.out.println("Visiting 'Assignment' node");
		return visitChildren(ctx);
	}

	@Override
	public Void visitArray_elem(@NotNull WACCParser.Array_elemContext ctx) {
		System.out.println("Visiting 'Array Elem' node");
		return visitChildren(ctx);
	}

	@Override
	public Void visitSequence(@NotNull WACCParser.SequenceContext ctx) {
		System.out.println("Visiting 'Sequence' node");
		return visitChildren(ctx);
	}

	@Override
	public Void visitPair_elem_type(@NotNull WACCParser.Pair_elem_typeContext ctx) {
		System.out.println("Visiting 'Pair Elem Type' node");
		return visitChildren(ctx);
	}

	@Override
	public Void visitAssign_rhs(@NotNull WACCParser.Assign_rhsContext ctx) {
		System.out.println("Visiting 'Assign Rhs' node");
		return visitChildren(ctx);
	}

	@Override
	public Void visitUnary_op(@NotNull WACCParser.Unary_opContext ctx) {
		System.out.println("Visiting 'Unary Op' node");
		return visitChildren(ctx);
	}

}