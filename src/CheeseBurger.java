

public class CheeseBurger extends Burger { //implements serializable wziete z klasy buger

    private Cheese cheese;
    private static boolean sesameAdded = false;

    public CheeseBurger(String name, float price, boolean meetAdded, boolean vegetablesAdded, Cheese cheese) {
        super(name, price, meetAdded, vegetablesAdded);
        this.cheese = cheese;
    }

    public Cheese getCheese() {
        return cheese;
    }

    public void setCheese(Cheese cheese) {
        this.cheese = cheese;
    }

    public static boolean isSesameAdded() {
        return sesameAdded;
    }

    public static void setSesameAdded(boolean sesameAdded) {
        CheeseBurger.sesameAdded = sesameAdded;
    }

    @Override
    public String toString() {
        return "CheeseBurger{" +
                "cheese=" + cheese +
                '}' + super.toString();
    }
}
