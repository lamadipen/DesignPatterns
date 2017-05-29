package com.dipen.noob;

/**
 * Created by dipen on 4/23/2017.
 */
public abstract class Plan {
    protected double rate;
    abstract  void getRate();

    public void calculateRate(int unit)
    {
        System.out.println("Rate after calculation "+(unit*rate));
    }
}
