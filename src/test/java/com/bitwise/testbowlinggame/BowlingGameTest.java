package com.bitwise.testbowlinggame;

import com.bitwise.bowlinggame.BowlingGame;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by aartig on 7/25/2016.
 */
public class BowlingGameTest {

    public BowlingGame game;


    @Before
    public void setUp()throws Exception{
        game= new BowlingGame();
    }

    @Test
    public void canRoll(){
        BowlingGame game=new BowlingGame();
        game.roll(0);
    }

    @Test
    public void gutterGame(){
        rollMany(20,0);
        assertEquals(0,game.scores());
    }

    private void rollMany(int rolls, int pins) {
        for (int i = 0; i < rolls; i++) {

            game.roll(pins);
        }
    }

    @Test
    public void allOnce(){
        rollMany(20, 1);
        assertEquals(20,game.scores());
    }

}
