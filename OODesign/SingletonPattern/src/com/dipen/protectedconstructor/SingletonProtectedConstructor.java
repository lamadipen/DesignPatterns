package com.dipen.protectedconstructor;

/**
 * Created by dipen on 4/18/2017.
 */
public class SingletonProtectedConstructor {
    private static SingletonProtectedConstructor uniqueInstance;

    protected SingletonProtectedConstructor()
    {

    }

    public static SingletonProtectedConstructor getInstance()
    {
        if(uniqueInstance == null)
        {
            uniqueInstance = new SingletonProtectedConstructor();
        }
        return uniqueInstance;
    }


    public void  callMe() {
        System.out.println("This is invoked from protected constructor extended Singleton class");
    }
}
