package com.dipen.threadunsafe;

/**
 * Created by dipen on 4/18/2017.
 */
public class Singleton {
    private static Singleton uniqueInstance;

    private Singleton()
    {

    }

    public static Singleton getInstance()
    {
        if(uniqueInstance == null)
        {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }


    public void  callMe() {
        System.out.println("This is invoked from Singleton class");
    }
}
