package com.juliencolin.hackerrank.warmups;

import org.junit.Test;

import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;

public class CountSocksPairsTest {

    @Test(expected = IllegalArgumentException.class)
    public void given_NoPairOfSocks_when_countingSocksPairs_then_throwsIllegalArgumentException() {
        new CountSocksPairs().forSocks(
                IntStream.of().toArray()
        );
    }

    @Test(expected = IllegalArgumentException.class)
    public void given_NullPairOfSocks_when_countingSocksPairs_then_throwsIllegalArgumentException() {
        new CountSocksPairs().forSocks(null);
    }

    @Test
    public void given_onlyDifferentSocks_when_countingSocksPairs_then_returnsZero() {
        int noPairs = new CountSocksPairs().forSocks(
                IntStream.of(0, 1, 2).toArray()
        );
        assertEquals(0, noPairs);
    }

    @Test
    public void given_someSocksIncludingPairs_when_countingSocksPairs_then_returnsRightAmountOfPairs() {
        int twoPairs = new CountSocksPairs().forSocks(
                IntStream.of(0, 1, 2, 0, 1).toArray()
        );
        assertEquals(2, twoPairs);
    }
}