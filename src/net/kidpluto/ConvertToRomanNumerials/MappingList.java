package net.kidpluto.ConvertToRomanNumerials;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class MappingList {

    private List<NumberToNumerial> romanSigns = new ArrayList<NumberToNumerial>();

    public static void main(String args []) {
        MappingList ml = new MappingList();
        System.out.println(ml.toString());
    }

    public MappingList() {
        // Create values, load ArrayList
        romanSigns.add(new NumberToNumerial(100,"C"));
        romanSigns.add(new NumberToNumerial(50, "L"));
        romanSigns.add(new NumberToNumerial(10,"X"));
        romanSigns.add(new NumberToNumerial(5,"V"));
    }
    public List<NumberToNumerial> getList() {
        return romanSigns;
    }
    public String toString() {
        StringBuffer sb = new StringBuffer();
        NumberToNumerial ntn;
        ListIterator itor = romanSigns.listIterator();
        while(itor.hasNext()) {
            ntn = (NumberToNumerial) itor.next();
            sb.append(ntn.toString() + System.getProperty("line.separator"));
        }
        return sb.toString();
    }
}
