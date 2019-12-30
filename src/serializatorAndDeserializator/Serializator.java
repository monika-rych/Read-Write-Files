package serializatorAndDeserializator;

import models.Burger;
import models.CheeseBurger;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serializator {
    private String path;


    public Serializator(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void serialize (Burger objects){

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
