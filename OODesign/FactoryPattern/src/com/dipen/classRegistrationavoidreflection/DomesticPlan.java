package com.dipen.classRegistrationavoidreflection;

/**
 * Created by dipen on 4/23/2017.
 */
public class DomesticPlan extends Plan {


    static {
        GetPlanFactory.instance().registerPlan("Domestic",new DomesticPlan());
    }

    @Override
    void getRate() {
        System.out.println("Domestic Rate");
        rate = 3.50;
    }

    @Override
    public Plan createPlan() {
        return new DomesticPlan();
    }

}
