import java.io.Serializable;

public class Cheese implements Serializable {

    private String color;
    private CheeseKind cheeseKind;

    public Cheese(String color, CheeseKind cheeseKind) {
        this.color = color;
        this.cheeseKind = cheeseKind;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public CheeseKind getCheeseKind() {
        return cheeseKind;
    }

    public void setCheeseKind(CheeseKind cheeseKind) {
        this.cheeseKind = cheeseKind;
    }

    @Override
    public String toString() {
        return "Cheese{" +
                "color='" + color + '\'' +
                ", cheeseKind=" + cheeseKind +
                '}' ;
    }
}
