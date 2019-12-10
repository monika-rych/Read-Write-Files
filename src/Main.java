
import java.io.*;
import java.util.Arrays;

public class Main {
    private static final String SER_FILE_PATH = "C:/MojFolder/burger.ser";
    private static final String BURGER_TAB_SER_FILE_PATH = "C:/MojFolder/burgerTab.ser";
    private static final String OBJECT_SER_FILE_PATH = "C:/MojFolder/Object.ser";

    public static void main(String[] args) {

     /*   Burger vegeBurger = new Burger("Vege", 14.99F, false, true);
        Burger meetBurger = new Burger("Meet", 18.99F, true, false);
        Burger regularBurger = new Burger("Regular", 15.99F, true, true);
*/

    /*    serializeBurger(regularBurger);
        Burger burger = deserializeBurger();
        System.out.println(burger);*/


/*
        Burger[] burgerTab = {vegeBurger, meetBurger, regularBurger};
        serializeBurgerTab(burgerTab);*/
  /*      Burger[] loadedBurgerTab = deserializeBurgerTab();

        for(Burger b : loadedBurgerTab){
            System.out.println(b);
        }
        System.out.println(Arrays.toString(loadedBurgerTab));
*/
        Serializator serializator = new Serializator();
        Deserializator deserializator = new Deserializator();

        Cheese cheese = new Cheese("yellow", CheeseKind.CHEDDAR);
        CheeseBurger cheeseBurger = new CheeseBurger("Cheeseburger", 22.49F, true, true, cheese);
        System.out.println(cheeseBurger);
        serializator.serialize(cheeseBurger, OBJECT_SER_FILE_PATH);
        CheeseBurger deserializedCheeseBurger = (CheeseBurger) deserializator.deserialize(OBJECT_SER_FILE_PATH);

        System.out.println("Deserialized object: " + deserializedCheeseBurger);
        System.out.println("isSesamAdded: " + CheeseBurger.isSesameAdded() );
    }
}