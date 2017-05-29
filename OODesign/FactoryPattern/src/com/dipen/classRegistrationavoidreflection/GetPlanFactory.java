package com.dipen.classRegistrationavoidreflection;

import java.util.HashMap;

/**
 * Created by dipen on 4/23/2017.
 */
public class GetPlanFactory {
    static  HashMap<String,Plan> registeredPlans = new HashMap();
    private static GetPlanFactory singletonFactory = new GetPlanFactory();
    public void registerPlan(String key, Plan objPlan)
    {
        registeredPlans.put(key,objPlan);
        System.out.println(registeredPlans.size());
    }

    public Plan getPlan(String type)
    {
        System.out.println(registeredPlans.get(type));
        return ((Plan)registeredPlans.get(type)).createPlan();
    }

    public static GetPlanFactory instance() {
        return singletonFactory;
    }
}
