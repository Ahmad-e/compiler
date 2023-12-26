// Generated from C:/Users/ASUS/IdeaProjects/MyNewLanguage/MyLanguageParser.g4 by ANTLR 4.13.1
package gen;
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
	 * Visit a parse tree produced by {@link MyLanguageParser#page}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPage(MyLanguageParser.PageContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#page_style}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPage_style(MyLanguageParser.Page_styleContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(MyLanguageParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#page_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPage_name(MyLanguageParser.Page_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#nav}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNav(MyLanguageParser.NavContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#footer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFooter(MyLanguageParser.FooterContext ctx);
}