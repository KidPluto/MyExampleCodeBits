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

    private static ArrayList<Integer> arrayList;

    @org.junit.jupiter.api.BeforeAll
    static void beforeAll() {
        arrayList = new ArrayList<Integer>();
        for (int i = 0; i < SIZE; i++) {
            arrayList.add(100 + i);
        }
    }

    @org.junit.jupiter.api.Test
    void ctorTakesCollection() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < SIZE; i++) {
            arrayList.add(100 + i);
        }
        CircularListWithTail clwt = new CircularListWithTail( arrayList);
        assertTrue(clwt.size() == SIZE);
        assertTrue((int)clwt.get(1) == 101);
    }

    @org.junit.jupiter.api.Test
    // I don't understand this ctor.  It take a starting value, but returns no list.
    void ctorTakesCircularPartStartIndex() {
        final int SIZE = 5;
        CircularListWithTail clwt = new CircularListWithTail( SIZE);
        assertTrue( clwt.size() == 0);

        // List is of size 0, this code will do nothing, but also not break.
        ListIterator<CircularListWithTail> iter = clwt.listIterator();
        while (iter.hasNext()) {
            System.out.println(" " + iter.next());
        }
        assertTrue(TRUE);
    }

    @org.junit.jupiter.api.Test
    void ctorTakesCircularPartStartIndexAndCollection() {

        CircularListWithTail clwt = new CircularListWithTail( STARTINDEX, arrayList);
        assertTrue(clwt.size() == SIZE);
        assertTrue(clwt.getCircularPartStartIndex() == STARTINDEX);
        assertTrue((int)clwt.get(STARTINDEX) == 105);
    }

    @org.junit.jupiter.api.Test
    // Ensure that a negative value for start index throws IndexOutOfBounds
    void ctorTakesCircularPartStartIndex_Negative_AndCollection() {
//        final int SIZE = 10;
        final int STARTINDEX = -5;
//        ArrayList<Integer> arrayList = new ArrayList<Integer>();
//        for (int i = 0; i < SIZE; i++) {
//            arrayList.add(100 + i);
//        }
        assertThrows(IndexOutOfBoundsException.class, () -> {new CircularListWithTail(STARTINDEX, arrayList);});
    }

    @org.junit.jupiter.api.Test
    void getCircularPartStartIndex() {

    }

    @org.junit.jupiter.api.Test
    void size() {
        CircularListWithTail clwt = new CircularListWithTail( arrayList);
        assertTrue(clwt.size() == SIZE);
    }

    @org.junit.jupiter.api.Test
    void listIterator() {
    }
}