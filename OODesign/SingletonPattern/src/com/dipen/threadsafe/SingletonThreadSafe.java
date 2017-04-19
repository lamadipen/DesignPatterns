package com.dipen.threadsafe;

/**
 * Created by dipen on 4/18/2017.
 * method synchronization is costly
 */
public class SingletonThreadSafe {
    private static SingletonThreadSafe uniqueInstance;

    private SingletonThreadSafe()
    {

    }

    public static synchronized  SingletonThreadSafe getInstance()
    {
        if(uniqueInstance == null)
        {
            uniqueInstance = new SingletonThreadSafe();
        }
        return uniqueInstance;
    }


    public void  callMe() {
        System.out.println("This is invoked from Singleton class");
    }
}
