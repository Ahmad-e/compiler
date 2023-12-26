package CLASSES;

public class component {
    String name;
    return_html returnHtml;

    public return_html getReturnHtml() {
        return returnHtml;
    }
    public void setReturnHtml(return_html returnHtml) {
        this.returnHtml = returnHtml;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "\ncomponent {" +
                "\nname='" + name + '\'' +
                "\n, returnHtml=" + returnHtml +
                "\n}";
    }
}
