package com.juliencolin.hackerrank.warmups;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RepeatedStringTest {

    @Test
    public void given_aStringAndNumberOfOccurences_when_coutingOccurencesOfACharacter_then_returnsCorrectCount() {
        final RepeatedString repeatedString = new RepeatedString("aba", 10);

        final long numberOfAs = repeatedString.countNumberOf('a');

        assertEquals(7, numberOfAs);
    }
}
