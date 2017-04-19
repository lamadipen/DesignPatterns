package com.dipen.app;

import com.dipen.protectedconstructor.SingletonProConstructorExt;
import com.dipen.protectedconstructor.SingletonProtectedConstructor;
import com.dipen.threadsafe.SingletonThreadSafe;
import com.dipen.threadunsafe.Singleton;

/**
 * Created by dipen on 4/18/2017.
 * http://www.oodesign.com/singleton-pattern.html
 *
 * Protected constructor
 It is possible to use a protected constructor to in order to permit the subclassing of the singeton.
 This techique has 2 drawbacks that makes singleton inheritance impractical:
 First of all, if the constructor is protected, it means that the class can be instantiated by calling the constructor
 from another class in the same package. A possible solution to avoid it is to create a separate package for the singleton.
 Second of all, in order to use the derived class all the getInstance calls should be changed in the existing code
 from Singleton.getInstance() to NewSingleton.getInstance().
 */
public class MainApp{

    public static void main(String [] args){
        //thread unsafe singleton call
        Singleton singleton =Singleton.getInstance();
        singleton.callMe();

        //thread safe unotptimized
        SingletonThreadSafe singletonTsafe =SingletonThreadSafe.getInstance();
        singleton.callMe();

        //cannot be achieved
        //SingletonProtectedConstructor pc = new SingletonProtectedConstructor();

        SingletonProConstructorExt.getInstance().callMe();
    }
}
