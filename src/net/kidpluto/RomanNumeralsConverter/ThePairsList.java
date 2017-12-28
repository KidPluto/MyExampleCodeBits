package net.kidpluto.RomanNumeralsConverter;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ThePairsList {

    private List<ThePairs> romanSigns = new ArrayList<>();

    public static void main(String args []) {
        ThePairsList ml = new ThePairsList();
        System.out.println(ml.toString());
    }
    public ThePairsList() {
        // Create values, load ArrayList
        romanSigns.add(new ThePairs(100,"C"));
        romanSigns.add(new ThePairs(50, "L"));
        romanSigns.add(new ThePairs(10,"X"));
        romanSigns.add(new ThePairs(9, "IX"));
        romanSigns.add(new ThePairs(5,"V"));
        romanSigns.add(new ThePairs(4, "IV"));
        romanSigns.add(new ThePairs(1, "I"));
    }
    public List<ThePairs> getList() {
        return romanSigns;
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        ThePairs ntn;
        ListIterator itor = romanSigns.listIterator();
        while(itor.hasNext()) {
            ntn = (ThePairs) itor.next();
            sb.append(ntn.toString());
            sb.append(System.getProperty("line.separator"));
        }
        return sb.toString();
    }
}
