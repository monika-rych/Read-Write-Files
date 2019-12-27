package serializatorAndDeserializator;

import models.Burger;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serializator {

    public void serialize (Burger o, String path) {

        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(o);
            oos.close();
            fos.close();
            System.out.println("Serialized data is saved in " + path);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Cos poszlo nie tak byc moze zostala podana nie poprawna sciezka do pliku");
        }
    }
    public void serialize (Burger[] objects, String path){

        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(objects);
            oos.close();
            fos.close();
            System.out.println("Serialized data is saved in " + path);
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
            System.out.println("Nie odnaleziono podanej sciezki pliku");
        }catch(IOException e){
            e.printStackTrace();
            System.out.println("Wystapil wyjatek wejscie wyjscia");
        }
    }
}
