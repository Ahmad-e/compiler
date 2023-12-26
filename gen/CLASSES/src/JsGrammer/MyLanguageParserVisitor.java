// Generated from java-escape by ANTLR 4.11.1
package CLASSES.src.JsGrammer;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MyLanguageParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MyLanguageParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(MyLanguageParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#lunchingProgram}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLunchingProgram(MyLanguageParser.LunchingProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code classHeaders}
	 * labeled alternative in {@link MyLanguageParser#classHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassHeaders(MyLanguageParser.ClassHeadersContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#div}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(MyLanguageParser.DivContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#h1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitH1(MyLanguageParser.H1Context ctx);
}