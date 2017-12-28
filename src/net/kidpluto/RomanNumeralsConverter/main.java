package net.kidpluto.RomanNumeralsConverter;

public class main {

    public static void main(String args []) {

        ThePairsList ml = new ThePairsList();
        ConvertToRomanNumerials ctrn = new ConvertToRomanNumerials();
        int toConvert = 175;
        System.out.println("Input is: " + toConvert + ", result is: " + ctrn.calculate(175, ml));
    }
}
