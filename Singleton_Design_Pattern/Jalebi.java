package Singleton_Design_Pattern;

public class Jalebi {
   
    private static Jalebi jalebi = new Jalebi();

    public static Jalebi getJalebi(){
        return jalebi;
    }
}
