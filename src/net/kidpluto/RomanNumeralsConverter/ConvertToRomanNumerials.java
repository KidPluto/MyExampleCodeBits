package net.kidpluto.RomanNumeralsConverter;

import java.util.ListIterator;

public class ConvertToRomanNumerials {

    public ConvertToRomanNumerials() {}

    public String calculate (int number, NumberAndRomanNumerialPairsList numberAndRomanNumerialPairsList) {

        StringBuilder romanNumerial = new StringBuilder();
        NumberAndRomanNumberialPairs numberAndRomanNumberialPairs;
        ListIterator<NumberAndRomanNumberialPairs> iterator =
                numberAndRomanNumerialPairsList.getList().listIterator();
        while (iterator.hasNext()) {
            numberAndRomanNumberialPairs = iterator.next();
            int divideBy = numberAndRomanNumberialPairs.getNumber();
            int divResult = number / divideBy;
            if (divResult > 0) {
                for (int i = 0; i < divResult; i++) {
                    romanNumerial.append(numberAndRomanNumberialPairs.getRomanNumerial());
                    number -= divideBy;
                }
            }
        }
        return romanNumerial.toString();
    }
}
