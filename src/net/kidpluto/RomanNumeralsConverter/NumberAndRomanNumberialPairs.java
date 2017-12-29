package net.kidpluto.RomanNumeralsConverter;

// Example pair would be "10 X"
// 10 is the number which is used to divided by
// X is the value to replace with
//
public class NumberAndRomanNumberialPairs {
    private int number;
    private String romanNumerial;

    NumberAndRomanNumberialPairs(int number, String numerial) {
        this.number = number;
        this.romanNumerial = numerial;
    }
    public int getNumber() {
        return number;
    }
    public String getRomanNumerial() {
        return romanNumerial;
    }
    public String toString() {
        return ("[" + number + "] [" + romanNumerial + "] ");
    }
}
