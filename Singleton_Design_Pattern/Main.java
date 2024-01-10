package Singleton_Design_Pattern;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class Main {
    public static void main(String[] args) throws Exception{
        Samosa samosa1 = Samosa.getSamosa();
        System.out.println(samosa1.hashCode());
        Samosa samosa2 = Samosa.getSamosa();
        System.out.println(samosa2.hashCode());

        //breaking singleton design pattern:
        Constructor<Samosa> constructor = Samosa.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Samosa s2 = constructor.newInstance();
        System.out.println(s2.hashCode());

        System.out.println(Jalebi.getJalebi().hashCode());
        System.out.println(Jalebi.getJalebi().hashCode());

        //Creating enum to avoid breaking singleton pattern:
        SamosaEnum samosaEnum = SamosaEnum.INSTANCE;
        System.out.println(samosaEnum);

        SamosaEnum samosaEnum2 = SamosaEnum.INSTANCE;
        System.out.println(samosaEnum2);

        //Serailizing object
        Samosa s3 = Samosa.getSamosa();
        System.out.println(s3.hashCode());
        System.out.println("Serialization done");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("abc.ob"));
        oos.writeObject(s3);

        //Deserializing object:
        ObjectInputStream ois =  new ObjectInputStream(new FileInputStream("abc.ob"));
        Samosa s4 = (Samosa) ois.readObject();
        System.out.println(s4.hashCode());
        
        //hashcodes get changed because of cloning object before serailizing then using it for deserializing.
        
        //CLoning objects:
        Samosa s5 = (Samosa) samosa1.clone();
        System.out.println(s5.hashCode());
        //Hashcode is changed as compared to samosa1

    }
}
