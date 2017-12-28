package net.kidpluto.RomanNumeralsConverter;

// Example pair would be 10 X
// 10 is the number which is used to divided by
// X is the value to replace with
// 20 would be replaced with XX
//
public class ThePairs {
    private int number;
    private String numerial;

    ThePairs(int number, String numerial) {
        this.number = number;
        this.numerial = numerial;
    }
    public int getNumber() {
        return number;
    }
    public String getNumerial() {
        return numerial;
    }
    public String toString() {
        return ("[" + number + "] [" + numerial + "] ");
    }
}
