package net.kidpluto.ConvertToRomanNumerials;

import java.util.ListIterator;

public class ConvertToRomanNumerials {

    public ConvertToRomanNumerials() {}

    public String calculate (int number, MappingList ml) {

        StringBuffer romanValue = new StringBuffer();
        NumberToNumerial ntn;
        ListIterator<NumberToNumerial> itor = ml.getList().listIterator();
        while (itor.hasNext()) {
            ntn = itor.next();
            int divideBy = ntn.getNumber();
            int value = number / divideBy;
            if (value > 0) {
                for (int i = 0; i < value; i++) {
                    romanValue.append(ntn.getNumerial());
                }
                // Adjust the number, by subtracting ...
                number -= divideBy*value;
            }
        }
        if(number > 0) {
            for (int i = 0; i < number; i++) {
                romanValue.append("I");
            }
        }
        return romanValue.toString();
    }
}
