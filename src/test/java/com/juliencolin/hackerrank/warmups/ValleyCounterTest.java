package com.juliencolin.hackerrank.warmups;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ValleyCounterTest {

    @Test(expected = IllegalArgumentException.class)
    public void given_emptyPath_when_countingTheNumberOfValleys_then_throwsIllegalArgumentException() {
        new ValleyCounter().forPath(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void given_pathContainingIllegalStep_when_countingTheNumberOfValleys_then_throwsIllegalArgumentException() {
        new ValleyCounter().forPath("UDF");
    }

    @Test
    public void given_aStringPathContainingOneValley_when_countingTheNumberOfValleys_then_countsTheRightAmountOfValleys() {
        int numberOfValleys = new ValleyCounter().forPath("UDDDUDUU");
        assertEquals(1, numberOfValleys);
    }

    @Test
    public void given_aStringPathContainingTwoValleys_when_countingTheNumberOfValleys_then_countsTheRightAmountOfValleys() {
        int numberOfValleys = new ValleyCounter().forPath("DUUUDDDDUU");
        assertEquals(2, numberOfValleys);
    }

}