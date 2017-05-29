package com.dipen.classRegistrationavoidreflection;

/**
 * Created by dipen on 4/23/2017.
 */
public class PlanApplication {

    public static void main(String[] args) {
        GetPlanFactory gf = GetPlanFactory.instance();

        System.out.print(gf.registeredPlans.size());
        /*Plan domestic = gf.getPlan("Domestic");
        domestic.getRate();
        domestic.calculateRate(1);*/



    }
}
