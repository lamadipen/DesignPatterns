package com.dipen.classRegistrationavoidreflection;

/**
 * Created by dipen on 4/23/2017.
 */
public class CommercialPlan extends Plan {
    static {
        GetPlanFactory.instance().registerPlan("Commercial",new CommercialPlan());
    }

    @Override
    void getRate() {
        System.out.println("Commercial Rate");
        rate =5.0;
    }

    @Override
    public Plan createPlan() {
        return new CommercialPlan();
    }


}
