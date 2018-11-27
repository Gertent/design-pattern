package com.gertent.d13_01_strategy;

@PriceRegion(min = 3000)
public class GoldVip implements CalPrice {

    @Override
    public Double calPrice(Double orgnicPrice) {
        return orgnicPrice * 0.7;
    }
}
