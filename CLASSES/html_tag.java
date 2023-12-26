package CLASSES;

import java.util.ArrayList;
import java.util.List;

public class html_tag {
    String name;
    String text;
    List<html_tag> htmlTags = new ArrayList<html_tag>();

    public void setName(String name) {
        this.name = name;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setHtmlTags(List<html_tag> htmlTags) {
        this.htmlTags = htmlTags;
    }

    public String getName() {
        return name;
    }

    public String getText() {
        return text;
    }

    public List<html_tag> getHtmlTags() {
        return htmlTags;
    }

    @Override
    public String toString() {
        return "\nhtml_tag{" +
                "\nname='" + name + '\'' +
                "\n, text='" + text + '\'' +
                "\n, htmlTags=" + htmlTags +
                "\n}";
    }
}
