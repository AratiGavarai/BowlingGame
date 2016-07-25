package com.bitwise.bowlinggame;

/**
 * Created by aartig on 7/25/2016.
 */
public class BowlingGame {
    private int scores=0;

    public void roll(int pins) {
        scores+=pins;
    }

    public int scores() {
        return scores;
    }
}
