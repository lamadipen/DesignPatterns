package com.dipen.threadsafe;

/**
 * Created by dipen on 4/18/2017.
 * We can see that the synchronized method getInstance does not need to be checked for syncronization after
 * the object is initialized. If we see that the singleton object is already created we just have to return
 * it without using any syncronized block. This optimization consist in checking in an unsynchronized block
 * if the object is null and if not to check again and create it in an syncronized block. This is called
 * double locking mechanism.
 */
public class SingletonThreadSafeOpt {
    private static SingletonThreadSafeOpt uniqueInstance;

    private SingletonThreadSafeOpt()
    {

    }

    public static SingletonThreadSafeOpt getInstance()
    {
        if(uniqueInstance == null)
        {
            synchronized (SingletonThreadSafeOpt.class)
            {
                if(uniqueInstance == null)
                {
                    System.out.println("getInstance(): First time getInstance was invoked!");
                    uniqueInstance = new SingletonThreadSafeOpt();
                }
            }
        }
        return uniqueInstance;
    }


    public void  callMe() {
        System.out.println("This is invoked from Singleton class");
    }
}
