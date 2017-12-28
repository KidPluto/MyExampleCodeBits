package net.kidpluto.RomanNumeralsConverter;

import java.util.ListIterator;

public class ConvertToRomanNumerials {

    public ConvertToRomanNumerials() {}

    public String calculate (int number, ThePairsList ml) {

        StringBuilder romanValue = new StringBuilder();
        ThePairs ntn;
        ListIterator<ThePairs> itor = ml.getList().listIterator();
        while (itor.hasNext()) {
            ntn = itor.next();
            int divideBy = ntn.getNumber();
            int divResult = number / divideBy;
            if (divResult > 0) {
                for (int i = 0; i < divResult; i++) {
                    romanValue.append(ntn.getNumerial());
                    number -= divideBy;
                }
            }
        }
        return romanValue.toString();
    }
}
