package net.kidpluto.ConvertToRomanNumerials;

public class main {

    public static void main(String args []) {

        MappingList ml = new MappingList();
        ConvertToRomanNumerials ctrn = new ConvertToRomanNumerials();
        int toConvert = 175;
        System.out.println("Input is: " + toConvert + ", result is: " + ctrn.calculate(175, ml));
    }
}
