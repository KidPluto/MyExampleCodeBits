package net.kidpluto.RomanNumeralsConverter;

import java.util.ListIterator;

public class ConvertToRomanNumerals {

    public ConvertToRomanNumerals() {}

    public String calculate (int number, NumberAndRomanNumeralPairsList numberAndRomanNumerialPairsList) {

        StringBuilder romanNumeral = new StringBuilder();
        NumberAndRomanNumberalPairs numberAndRomanNumberalPairs;
        ListIterator<NumberAndRomanNumberalPairs> iterator =
                numberAndRomanNumerialPairsList.getList().listIterator();
        while (iterator.hasNext()) {
            numberAndRomanNumberalPairs = iterator.next();
            int divideBy = numberAndRomanNumberalPairs.getNumber();
            int divResult = number / divideBy;
            if (divResult > 0) {
                for (int i = 0; i < divResult; i++) {
                    romanNumeral.append(numberAndRomanNumberalPairs.getRomanNumerial());
                    number -= divideBy;
                }
            }
        }
        return romanNumeral.toString();
    }
}
