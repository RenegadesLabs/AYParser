package com.renegades.parser;

import java.util.List;

/**
 * Created by Виталик on 01.03.2017.
 */
public class Aggregator {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        String term = args[0];

        AYStrategy strategy = new AYStrategy();
        List<Offer> offers = strategy.getOffers(term);
        XMLView xmlView = new XMLView();
        xmlView.update(offers);

        long runTime = (System.nanoTime() - startTime) / 1000000;
        System.out.println("Run-time = " + runTime + " ms");
    }
}
