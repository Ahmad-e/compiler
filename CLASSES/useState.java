package CLASSES;

public class useState {
    String nameUseState ;
    String nameSetUseState ;

    public String getNameSetUseState() {
        return nameSetUseState;
    }

    public String getNameUseState() {
        return nameUseState;
    }

    public void setNameSetUseState(String nameSetUseState) {
        this.nameSetUseState = nameSetUseState;
    }

    public void setNameUseState(String nameUseState) {
        this.nameUseState = nameUseState;
    }

    @Override
    public String toString() {
        return "useState=[" + nameUseState +" , "+ nameSetUseState + '\'' + ']';
    }
}
