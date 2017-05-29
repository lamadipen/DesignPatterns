package com.dipen.noob;

/**
 * Created by dipen on 4/23/2017.
 */
public class GetPlanFactory {
    public Plan getPlan(String type)
    {
        if(type.equalsIgnoreCase("Domestic"))
        {
            return new DomesticPlan();
        }else if(type.equalsIgnoreCase("Commercial"))
        {
            return new CommercialPlan();
        }
        else
        {
            return null;
        }
    }
}
