package com.dipen.classRegistrationReflection;

/**
 * Created by dipen on 4/23/2017.
 */
public class CommercialPlan extends Plan {
    @Override
    void getRate() {
        System.out.println("Commercial Rate");
        rate =5.0;
    }
}
