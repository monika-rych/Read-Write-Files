

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserializator {
    public Object deserialize(String path) {

        Object o = null;

        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            o = ois.readObject();
            ois.close();
            fis.close();
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
            System.out.println("Nie odnaleziono podanej sciezki pliku");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Wystapil wyjatek wejscie wyjscia");
        } catch (ClassNotFoundException classNotFoundException) {
            classNotFoundException.printStackTrace();
            System.out.println("Wpodanym pliku nie bylo obiektu klasy burger");
        }
        return o;
    }
//    public java.lang.Object deserialize(String path) {
//
//        java.lang.Object o = null;
//        FileInputStream fis = null;
//        ObjectInputStream ois = null;
//
//        try {
//             fis = new FileInputStream(path);
//             ois = new ObjectInputStream(fis);
//            o = ois.readObject();
//        }catch (FileNotFoundException fileNotFoundException){
//            fileNotFoundException.printStackTrace();
//            System.out.println("Nie odnaleziono podanej sciezki pliku");
//        }catch (IOException e){
//            e.printStackTrace();
//            System.out.println("Wystapil wyjatek wejscie wyjscia");
//        }catch (ClassNotFoundException classNotFoundException){
//            classNotFoundException.printStackTrace();
//            System.out.println("Wpodanym pliku nie bylo obiektu klasy burger");
//        }
//        finally {
//            try {
//                ois.close();
//            }catch (IOException e) {
//                e.printStackTrace();
//                System.out.println("Wystapil wyjatek wejscie wyjscia");
//            }
//            try {
//                fis.close();
//            }catch (IOException e) {
//                e.printStackTrace();
//                System.out.println("Wystapil wyjatek wejscie wyjscia");
//            }
//
//        }
//        return o;
//    }

    public Object[] deserializeBurgerTab(String path) { //to jeszcze pocwiczyc
        Object[] objects = null;
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            objects = (Object[]) ois.readObject();
            ois.close();
            fis.close();
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
            System.out.println("Nie odnaleziono podanej sciezki pliku");
        } catch (IOException ioexception) {
            ioexception.printStackTrace();
            System.out.println("Wystapil wyjatek wejscie wyjscia");
        } catch (ClassNotFoundException classNotFoundException) {
            classNotFoundException.printStackTrace();
            System.out.println("Wpodanym pliku nie bylo tablicy klasy burger");
        }
        return objects;
    }

}
