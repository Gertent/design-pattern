package com.gertent.d13_01_strategy;

@PriceRegion(min = 20000,max = 30000)
public class SuperVip implements CalPrice {

    @Override
    public Double calPrice(Double orgnicPrice) {
        return orgnicPrice * 0.8;
    }
}
