package com.dipen.noob;

/**
 * Created by dipen on 4/23/2017.
 */
public class PlanApplication {

    public static void main(String[] args) {
        GetPlanFactory gf = new GetPlanFactory();

        Plan domestic = gf.getPlan("Domestic");
        domestic.getRate();
        domestic.calculateRate(1);

        Plan commercial = gf.getPlan("Commercial");
        commercial.getRate();
        commercial.calculateRate(1);

    }
}
