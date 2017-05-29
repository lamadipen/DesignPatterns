package com.dipen.classRegistrationReflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

/**
 * Created by dipen on 4/23/2017.
 * http://www.oodesign.com/factory-pattern.html
 */
public class GetPlanFactory {

    private HashMap<String,Class> registeredPlans = new HashMap();

    public void registerPlan(String key, Class planClass)
    {
        registeredPlans.put(key,planClass);
    }
    public Plan getPlan(String type) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class planClass = (Class) registeredPlans.get(type);

        if(planClass != null)
        {


            Constructor planConstructor = planClass.getDeclaredConstructor(new Class[]{});
            //to call constructor with 1 string paramater
            //Constructor planConstructor = Plan.class.getDeclaredConstructor(new Class[]{String.class});
            System.out.println(planConstructor);

            return (Plan) planConstructor.newInstance();
        }

        return null;
    }
}
