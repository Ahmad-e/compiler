// Generated from java-escape by ANTLR 4.11.1
package CLASSES.src.JsGrammer;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MyLanguageParser}.
 */
public interface MyLanguageParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MyLanguageParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MyLanguageParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#lunchingProgram}.
	 * @param ctx the parse tree
	 */
	void enterLunchingProgram(MyLanguageParser.LunchingProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#lunchingProgram}.
	 * @param ctx the parse tree
	 */
	void exitLunchingProgram(MyLanguageParser.LunchingProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code classHeaders}
	 * labeled alternative in {@link MyLanguageParser#classHeader}.
	 * @param ctx the parse tree
	 */
	void enterClassHeaders(MyLanguageParser.ClassHeadersContext ctx);
	/**
	 * Exit a parse tree produced by the {@code classHeaders}
	 * labeled alternative in {@link MyLanguageParser#classHeader}.
	 * @param ctx the parse tree
	 */
	void exitClassHeaders(MyLanguageParser.ClassHeadersContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#div}.
	 * @param ctx the parse tree
	 */
	void enterDiv(MyLanguageParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#div}.
	 * @param ctx the parse tree
	 */
	void exitDiv(MyLanguageParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#h1}.
	 * @param ctx the parse tree
	 */
	void enterH1(MyLanguageParser.H1Context ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#h1}.
	 * @param ctx the parse tree
	 */
	void exitH1(MyLanguageParser.H1Context ctx);
}