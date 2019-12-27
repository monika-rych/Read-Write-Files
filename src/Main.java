
import models.Cheese;
import models.CheeseBurger;
import models.CheeseKind;
import serializatorAndDeserializator.Deserializator;
import serializatorAndDeserializator.Serializator;

public class Main {
    private static final String SER_FILE_PATH = "C:/MojFolder/burger.ser";
    private static final String BURGER_TAB_SER_FILE_PATH = "C:/MojFolder/burgerTab.ser";
    private static final String OBJECT_SER_FILE_PATH = "C:/MojFolder/Object.ser";

    public static void main(String[] args) {

        Serializator serializator = new Serializator("C:/MojFolder/Object.ser");
        Deserializator deserializator = new Deserializator();

        Cheese cheese = new Cheese("yellow", CheeseKind.CHEDDAR);
        CheeseBurger cheeseBurger = new CheeseBurger("Cheeseburger", 22.49F, true, true, cheese);
        System.out.println(cheeseBurger);
        serializator.serialize(cheeseBurger);
        CheeseBurger deserializedCheeseBurger = (CheeseBurger) deserializator.deserialize(OBJECT_SER_FILE_PATH);

        System.out.println("Deserialized object: " + deserializedCheeseBurger);
        System.out.println("isSesamAdded: " + CheeseBurger.isSesameAdded() );
    }
}