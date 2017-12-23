package net.kidpluto.CircularListWithTail.test;

import net.kidpluto.CircularListWithTail.CircularListWithTail;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.ListIterator;

import static java.lang.Boolean.TRUE;
import static org.junit.jupiter.api.Assertions.*;

class CircularListWithTailTest {

    final static int SIZE = 10;
    final static int STARTINDEX = 5;
    // 0 --> 1 --> 2 --> 3 --> 4 --> 5 --> 6 --> 7 --> 8 --> 9 --> 5 --> 6 ...

    private static ArrayList<Integer> arrayList;

    @org.junit.jupiter.api.BeforeAll
    // Create ArrayList, to be used as parameter for ctors
    static void beforeAll() {
        arrayList = new ArrayList<Integer>();
        for (int i = 0; i < SIZE; i++) {
            arrayList.add(100 + i);
        }
    }

    @org.junit.jupiter.api.Test
    // Tests ctor using ArrayList
    // Circular list, with no tail is created
    void ctorTakesCollection() {
        CircularListWithTail clwt = new CircularListWithTail( arrayList);
        assertTrue(clwt.size() == SIZE);
        assertTrue((int)clwt.get(1) == 101);
//        int count = 0;
//        ListIterator<CircularListWithTail> iter = clwt.listIterator();
//        while (iter.hasNext()) {
//            count++;
//            iter.next();
//            // Ensure against infinite loop
//            if (count > SIZE) {break;}
//        }
//        assertTrue(count == SIZE, "iter not stopping at the end of the list");
    }

    @org.junit.jupiter.api.Test
    // Test ctor using just circular part start index
    // I don't understand this ctor.  It take a starting value, but returns no list.
    void ctorTakesCircularPartStartIndex() {
        final int SIZE = 5;
        CircularListWithTail clwt = new CircularListWithTail( SIZE);
        // Check for size of zero
        assertTrue( clwt.size() == 0);

        // List is of size 0, this code will do nothing, but also not break.
        ListIterator<CircularListWithTail> iter = clwt.listIterator();
        while (iter.hasNext()) {
            System.out.println(" " + iter.next());
        }
        assertTrue(TRUE);
    }

    @org.junit.jupiter.api.Test
    // Test ctor with ArrayList and circular part start index
    void ctorTakesCircularPartStartIndexAndCollection() {
        CircularListWithTail clwt = new CircularListWithTail( STARTINDEX, arrayList);
        assertTrue(clwt.size() == SIZE);
        assertTrue(clwt.getCircularPartStartIndex() == STARTINDEX);
        assertTrue((int)clwt.get(STARTINDEX) == 105);
        assertTrue((int)clwt.get(STARTINDEX+1) == 106);
    }

    @org.junit.jupiter.api.Test
    // Test ctor with ArrayList and negative value for circular part start point
    void ctorTakesCircularPartStartIndex_Negative_AndCollection() {
        final int STARTINDEX = -5;
        // Ensure that IndexOutOfBoundsException is thrown
        assertThrows(IndexOutOfBoundsException.class, () -> {new CircularListWithTail(STARTINDEX, arrayList);});
    }

    @org.junit.jupiter.api.Test
    // Test the getter for circular part start index
    void getCircularPartStartIndex() {
        CircularListWithTail clwt = new CircularListWithTail( STARTINDEX, arrayList);
        assertTrue(clwt.getCircularPartStartIndex() == STARTINDEX);
    }

    @org.junit.jupiter.api.Test
    // Test the getting for size
    void size() {
        CircularListWithTail clwt = new CircularListWithTail( arrayList);
        assertTrue(clwt.size() == SIZE);
    }

    @org.junit.jupiter.api.Test
    //
    void listIterator() {
        CircularListWithTail clwt = new CircularListWithTail( STARTINDEX, arrayList);
        int count = 0;
        int stop = 12;
        Integer int_1 = 0;
        ListIterator<CircularListWithTail> iter = clwt.listIterator();
        while (iter.hasNext()) {
            count++;
//            iter.next();
            int_1 = (Integer)iter.next().get(iter.nextIndex());
            // Ensure against infinite loop
            if (count == stop) {break;}
        }
        System.out.println("we have : " + int_1);
    }
}