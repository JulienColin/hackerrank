package com.juliencolin.hackerrank.warmups;

import java.util.HashSet;
import java.util.Set;

final class CountSocksPairs {

    int forSocks(final int[] socksArray) {
        if (socksArray == null || socksArray.length < 1) {
            throw new IllegalArgumentException("No socks for which we can count pairs");
        }
        return countPairs(socksArray);
    }

    private int countPairs(final int[] socksArray) {
        final Set<Integer> uniqueSocksColors = new HashSet<>();
        int count = 0;
        for (int sockColor : socksArray) {
            if (uniqueSocksColors.contains(sockColor)) {
                count++;
                uniqueSocksColors.remove(sockColor);
            } else {
                uniqueSocksColors.add(sockColor);
            }
        }
        return count;
    }
}
