package com.juliencolin.hackerrank.warmups;

final class RepeatedString {
    private final String inputString;
    private final long numberOfOccurences;

    RepeatedString(
            final String inputString,
            final long numberOfOccurences
    ) {
        this.inputString = inputString;
        this.numberOfOccurences = numberOfOccurences;
    }

    long countNumberOf(final char searchedCharacter) {
        final long numberOfSearchedCharacterInRepeatedString = this.countInIntegerRepeatedString(searchedCharacter);
        final long numberOfSearchedCharacterInTheRest = this.countInRest(searchedCharacter);
        return numberOfSearchedCharacterInRepeatedString + numberOfSearchedCharacterInTheRest;
    }

    private long countInIntegerRepeatedString(final char searchedCharacter) {
        final long numberOfSearchedCharacterInInput = countCharacterOccurencesInString(searchedCharacter, this.inputString);
        final long numberOfTimesInputIsRepeatedInFinalSequence = this.numberOfOccurences / this.inputString.length();
        return numberOfTimesInputIsRepeatedInFinalSequence * numberOfSearchedCharacterInInput;
    }

    private long countInRest(final char searchedCharacter) {
        final long numberOfCharactersInTheRest = this.numberOfOccurences % this.inputString.length();
        final String rest = this.inputString.substring(0, Math.toIntExact(numberOfCharactersInTheRest));
        return countCharacterOccurencesInString(searchedCharacter, rest);
    }

    private static long countCharacterOccurencesInString(
            final char searchedCharacter,
            final String stringToSearch
    ) {
        return  stringToSearch.chars()
                .mapToObj(character -> (char) character)
                .filter(character -> character == searchedCharacter)
                .count();
    }
}
