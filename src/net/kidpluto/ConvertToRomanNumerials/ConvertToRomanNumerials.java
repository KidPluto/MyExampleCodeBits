package net.kidpluto.ConvertToRomanNumerials;

// https://www.romannumerals.org/
// 100  C
// 50   L
// 10   X
// 5    V

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ConvertToRomanNumerials {

    public ConvertToRomanNumerials() {}

    public String calculate (int number) {

        List<NumberToNumerial> romanSigns = new ArrayList<NumberToNumerial>();

        // Create values, load ArrayList
        NumberToNumerial oneHundred = new NumberToNumerial(100, "C");
        romanSigns.add(oneHundred);
        NumberToNumerial fifty = new NumberToNumerial(50, "L");
        romanSigns.add(fifty);
        NumberToNumerial ten = new NumberToNumerial(10, "X");
        romanSigns.add(ten);
        NumberToNumerial five = new NumberToNumerial(5, "V");

        StringBuffer romanValue = new StringBuffer();
        ListIterator<NumberToNumerial> itor = romanSigns.listIterator();
        while (itor.hasNext()) {
            NumberToNumerial ntn = itor.next();
            int divideBy = ntn.getNumber();
            int value = number / divideBy;
            if (value > 0) {
                for (int i = 0; i < value; i++) {
                    romanValue.append(ntn.getNumerial());
                }
                number -= divideBy;
            }
        }
        return romanValue.toString();
    }
}
