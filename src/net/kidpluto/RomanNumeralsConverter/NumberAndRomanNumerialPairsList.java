package net.kidpluto.RomanNumeralsConverter;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class NumberAndRomanNumerialPairsList {

    private List<NumberAndRomanNumberialPairs> romanSigns = new ArrayList<>();

    public static void main(String args []) {
        NumberAndRomanNumerialPairsList ml = new NumberAndRomanNumerialPairsList();
        System.out.println(ml.toString());
    }
    public NumberAndRomanNumerialPairsList() {
        // Create values, load ArrayList
        // Ok, so there is most likely a prettier way of creating this list.
        romanSigns.add(new NumberAndRomanNumberialPairs(100,"C"));
        romanSigns.add(new NumberAndRomanNumberialPairs(50, "L"));
        romanSigns.add(new NumberAndRomanNumberialPairs(10,"X"));
        romanSigns.add(new NumberAndRomanNumberialPairs(9, "IX"));
        romanSigns.add(new NumberAndRomanNumberialPairs(5,"V"));
        romanSigns.add(new NumberAndRomanNumberialPairs(4, "IV"));
        romanSigns.add(new NumberAndRomanNumberialPairs(1, "I"));
    }
    public List<NumberAndRomanNumberialPairs> getList() {
        return romanSigns;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        NumberAndRomanNumberialPairs ntn;
        ListIterator itor = romanSigns.listIterator();
        while(itor.hasNext()) {
            ntn = (NumberAndRomanNumberialPairs) itor.next();
            sb.append(ntn.toString());
            sb.append(System.getProperty("line.separator"));
        }
        return sb.toString();
    }
}
