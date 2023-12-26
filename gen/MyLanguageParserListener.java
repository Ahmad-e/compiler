// Generated from C:/Users/ASUS/IdeaProjects/MyNewLanguage/MyLanguageParser.g4 by ANTLR 4.13.1
package gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MyLanguageParser}.
 */
public interface MyLanguageParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#page}.
	 * @param ctx the parse tree
	 */
	void enterPage(MyLanguageParser.PageContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#page}.
	 * @param ctx the parse tree
	 */
	void exitPage(MyLanguageParser.PageContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#page_style}.
	 * @param ctx the parse tree
	 */
	void enterPage_style(MyLanguageParser.Page_styleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#page_style}.
	 * @param ctx the parse tree
	 */
	void exitPage_style(MyLanguageParser.Page_styleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(MyLanguageParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(MyLanguageParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#page_name}.
	 * @param ctx the parse tree
	 */
	void enterPage_name(MyLanguageParser.Page_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#page_name}.
	 * @param ctx the parse tree
	 */
	void exitPage_name(MyLanguageParser.Page_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#nav}.
	 * @param ctx the parse tree
	 */
	void enterNav(MyLanguageParser.NavContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#nav}.
	 * @param ctx the parse tree
	 */
	void exitNav(MyLanguageParser.NavContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#footer}.
	 * @param ctx the parse tree
	 */
	void enterFooter(MyLanguageParser.FooterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#footer}.
	 * @param ctx the parse tree
	 */
	void exitFooter(MyLanguageParser.FooterContext ctx);
}