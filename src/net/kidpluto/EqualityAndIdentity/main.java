package net.kidpluto.EqualityAndIdentity;


public class main {

    public static void main (String args []) {

        System.out.println("Identity is tested with .equals()");
        System.out.println("Equality is tested with ==");
        System.out.println();

        Integer a = new Integer(1);
        Integer b = a;
        System.out.println("a and b reference the same object");
        if( a.equals(b)) { System.out.println("These objects are identical"); }
        else { System.out.println("These objects are NOT identical"); }
        if( a==b) { System.out.println("These objects are equal"); }
        else { System.out.println("These objects are NOT equal"); }
        System.out.println();

        Integer c = new Integer(1);
        Integer d = new Integer(1);
        System.out.println("c and d are different objects, containing the same value");
        if( c.equals(d)) {System.out.println("These objects are identical"); }
        else { System.out.println("These objects are NOT identical");}
        if( c==d) {System.out.println("These objects are equal"); }
        else { System.out.println("These objects are NOT equal"); }
        System.out.println();

        //
        Pet midnight = new Pet("midnight");
        Pet twilight = midnight;
        if( midnight.equals(twilight)) { System.out.println("These objects are identical"); }
        else { System.out.println("These objects are NOT identical"); }
        if( midnight==twilight) { System.out.println("These objects are equal"); }
        else { System.out.println("These objects are NOT equal"); }
        System.out.println();

        Pet fluffy = new Pet ("fluffy");
        Pet fluffy_2 = new Pet ("fluffy");
        if( fluffy.equals(fluffy_2)) { System.out.println("These objects are identical"); }
        else { System.out.println("These objects are NOT identical"); }
        if( fluffy==fluffy_2) { System.out.println("These objects are equal"); }
        else { System.out.println("These objects are NOT equal"); }
        System.out.println();
    }
}
