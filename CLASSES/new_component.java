package CLASSES;

import java.util.ArrayList;
import java.util.List;

public class new_component {
    List<useState> useStates = new ArrayList<useState>();
    List<component> components = new ArrayList<component>();
    return_html returnHtml;

    public List<useState> getUseStates() {
        return useStates;
    }
    public void setUseStates(List<useState> useStates) {
        this.useStates = useStates;
    }

    public List<component> getComponents() {
        return components;
    }
    public void setComponents(List<component> components) {
        this.components = components;
    }

    public return_html getReturnHtml() {
        return returnHtml;
    }
    public void setReturnHtml(return_html returnHtml) {
        this.returnHtml = returnHtml;
    }

    @Override
    public String toString() {
        return "\nnew_component{" +
                "\n  useStates=" + useStates +
                "\n, components=" + components +
                "\n, returnHtml=" + returnHtml +
                "\n}";
    }
}
