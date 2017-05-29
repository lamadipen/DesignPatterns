package com.dipen.classRegistrationReflection;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by dipen on 4/23/2017.
 */
public class PlanApplication {

    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        GetPlanFactory gf = new GetPlanFactory();
        gf.registerPlan("Domestic",DomesticPlan.class);
        Plan domestic = gf.getPlan("Domestic");

        System.out.println(domestic);
        domestic.getRate();
        domestic.calculateRate(1);

        //Plan commercial = gf.getPlan("Commercial");
        //commercial.getRate();
        //commercial.calculateRate(1);

    }
}
