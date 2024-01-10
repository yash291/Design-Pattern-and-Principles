package Singleton_Design_Pattern;

import java.io.Serializable;

public class Samosa implements Serializable{

    //we have made this variable static because for non static we have to create objects. but we cant create objects
    // we have made this variable private so that no one can access it outside
    private static Samosa samosa;
    //constructor
    private Samosa(){
        // if(samosa != null){
        //     throw new RuntimeException("You are trying to break Singleton pattern");
        // }
    }

    public static Samosa getSamosa(){

        //object of this class
        if(samosa == null){
            synchronized(Samosa.class){
                if(samosa == null){
                    samosa = new Samosa();
                }
            }
        }
        
        return samosa;
    }

    public Object readResolve(){
        return samosa;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        //Problem : return super.clone();
        //Solution:
        return samosa;
    }


}