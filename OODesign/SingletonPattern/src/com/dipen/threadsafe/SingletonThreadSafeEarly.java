package com.dipen.threadsafe;

/**
 * Created by dipen on 4/18/2017.
 * Early instantiation using implementation with static field.
 *
 * In the following implementattion the singleton object is instantiated when the class is loaded and
 * not when it is first used, due to the fact that the instance member is declared static. This is why
 * in we don't need to synchronize any portion of the code in this case. The class is loaded once this
 * guarantee the uniquity of the object.
 */
public class SingletonThreadSafeEarly {
    private static SingletonThreadSafeEarly uniqueInstance = new SingletonThreadSafeEarly();

    private SingletonThreadSafeEarly()
    {

    }

    public static synchronized SingletonThreadSafeEarly getInstance()
    {

        return uniqueInstance;
    }


    public void  callMe() {
        System.out.println("This is invoked from Singleton class");
    }
}
