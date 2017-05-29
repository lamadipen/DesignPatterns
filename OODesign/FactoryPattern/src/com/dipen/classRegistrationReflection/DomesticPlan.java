package com.dipen.classRegistrationReflection;

/**
 * Created by dipen on 4/23/2017.
 */
public class DomesticPlan extends Plan {


    @Override
    void getRate() {
        System.out.println("Domaestic Rate");
        rate = 3.50;
    }
}
