package net.kidpluto.RomanNumeralsConverter;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class NumberAndRomanNumeralPairsList {

    private List<NumberAndRomanNumberalPairs> romanSigns = new ArrayList<>();

    public static void main(String args []) {
        NumberAndRomanNumeralPairsList ml = new NumberAndRomanNumeralPairsList();
        System.out.println(ml.toString());
    }
    public NumberAndRomanNumeralPairsList() {
        // Create values, load ArrayList
        // Ok, so there is most likely a prettier way of creating this list.
        romanSigns.add(new NumberAndRomanNumberalPairs(100,"C"));
        romanSigns.add(new NumberAndRomanNumberalPairs(50, "L"));
        romanSigns.add(new NumberAndRomanNumberalPairs(10,"X"));
        romanSigns.add(new NumberAndRomanNumberalPairs(9, "IX"));
        romanSigns.add(new NumberAndRomanNumberalPairs(5,"V"));
        romanSigns.add(new NumberAndRomanNumberalPairs(4, "IV"));
        romanSigns.add(new NumberAndRomanNumberalPairs(1, "I"));
    }
    public List<NumberAndRomanNumberalPairs> getList() {
        return romanSigns;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        NumberAndRomanNumberalPairs ntn;
        ListIterator itor = romanSigns.listIterator();
        while(itor.hasNext()) {
            ntn = (NumberAndRomanNumberalPairs) itor.next();
            sb.append(ntn.toString());
            sb.append(System.getProperty("line.separator"));
        }
        return sb.toString();
    }
}
