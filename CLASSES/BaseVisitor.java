package CLASSES;
import gen.MyLanguageParser;
import gen.MyLanguageParserBaseVisitor;

public class BaseVisitor extends MyLanguageParserBaseVisitor {

    SymbolTable symbolTable = new SymbolTable();

    @Override
    public Page visitPage(MyLanguageParser.PageContext ctx) {
    Page page =new Page();
    for(int i = 0; i < ctx.page_style().size();i++){
        if (ctx.page_style(i) != null){
            page.getPage_styleList().add(visitPage_style(ctx.page_style(i)));
        }
        }
    this.symbolTable.print();

    SemanticCheck semanticCheck = new SemanticCheck();
    semanticCheck.setSymbolTable(this.symbolTable);
    semanticCheck.check();

    return page;
    }

    @Override
    public Page_Style visitPage_style(MyLanguageParser.Page_styleContext ctx) {
       Page_Style page_style = new Page_Style();
       if(ctx.name()!=null)
           page_style.setName(visitName(ctx.name()));
        if(ctx.nav()!=null)
            page_style.setNav(visitNav(ctx.nav()));
        if(ctx.footer()!=null)
            page_style.setFooter(visitFooter(ctx.footer()));
        return page_style;
    }

    @Override
    public Name visitName(MyLanguageParser.NameContext ctx) {
        Name name= new Name();
        if (ctx.page_name()!=null)
        {
            name.setPage_name(visitPage_name(ctx.page_name()));
        }
        else if (ctx.page_name()==null)
        {
            Row row = new Row();
            row.setType("name");
            row.setValue("home");
            symbolTable.getRows().add(row);
        }
        return name;
    }

    @Override
    public Page_Name visitPage_name(MyLanguageParser.Page_nameContext ctx) {
      Page_Name page_name = new Page_Name();
      page_name.setString(ctx.STRING().getText());

      Row row = new Row();
      row.setType("name");
      row.setValue(page_name.getString());
      symbolTable.getRows().add(row);

      return page_name;
    }

    @Override
    public Nav visitNav(MyLanguageParser.NavContext ctx) {
      Nav nav = new Nav();
      nav.setNav(ctx.NAV().getText());

      Row row = new Row();
      row.setType("nav");
      row.setValue(nav.getNav());
      symbolTable.getRows().add(row);

      return nav;
    }

    @Override
    public Footer visitFooter(MyLanguageParser.FooterContext ctx) {
      Footer footer = new Footer();
      footer.setFooter(ctx.FOOTER().getText());

      Row row = new Row();
      row.setType("footer");
      row.setValue(footer.getFooter());
      this.symbolTable.getRows().add(row);

      return footer;
    }
}
