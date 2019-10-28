package com.juliencolin.hackerrank.warmups;

final class ValleyCounter {

    private static final char STEP_UP_CHAR = 'U';
    private static final char STEP_DOWN_CHAR = 'D';

    private static final int SEA_LEVEL_POSITION = 0;

    int forPath(final String stringPath) {
        if(stringPath == null || stringPath.isBlank()) {
            throw new IllegalArgumentException("Empty path");
        }
        return countNumberOfValleys(stringPath);
    }

    private int countNumberOfValleys(String stringPath) {
        int numberOfValleys = 0;
        int currentPosition = 0;
        char[] steps = stringPath.toCharArray();
        for(char step : steps) {
            int newPosition = calculateNewPosition(currentPosition, step);
            if(currentPosition == SEA_LEVEL_POSITION && newPosition < SEA_LEVEL_POSITION) {
                numberOfValleys++;
            }
            currentPosition = newPosition;
        }
        return numberOfValleys;
    }

    private int calculateNewPosition(
            final int previousPosition,
            final char step
    ) {
        switch (step) {
            case STEP_UP_CHAR :
                return previousPosition + 1;
            case STEP_DOWN_CHAR :
                return previousPosition - 1;
            default:
                throw new IllegalArgumentException("Unauthorized step");
        }
    }

}
