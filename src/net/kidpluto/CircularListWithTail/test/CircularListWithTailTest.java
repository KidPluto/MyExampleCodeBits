package net.kidpluto.CircularListWithTail.test;

import net.kidpluto.CircularListWithTail.CircularListWithTail;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.ListIterator;

import static java.lang.Boolean.TRUE;
import static org.junit.jupiter.api.Assertions.*;

class CircularListWithTailTest {

    @org.junit.jupiter.api.Test
    void ctorTakesCollection() {
        final int SIZE = 10;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < SIZE; i++) {
            arrayList.add(100 + i);
        }
        CircularListWithTail clwt = new CircularListWithTail( arrayList);
        ListIterator<CircularListWithTail> iter = clwt.listIterator();
        while (iter.hasNext()) {
            System.out.println(" " + iter.next());
        }
    }

    @org.junit.jupiter.api.Test
    // I don't understand this ctor.  It take a starting value, but returns no list.
    void ctorTakesCircularPartStartIndex() {
        final int SIZE = 5;
        CircularListWithTail clwt = new CircularListWithTail( SIZE);
        System.out.println("Ok, confused.  Sending in value of 5, the list I get is: " + clwt.size());
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
        final int SIZE = 10;
        final int STARTINDEX = 5;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < SIZE; i++) {
            arrayList.add(100 + i);
        }
        CircularListWithTail clwt = new CircularListWithTail( STARTINDEX, arrayList);
        assertTrue(TRUE);
    }

    @org.junit.jupiter.api.Test
    void getCircularPartStartIndex() {

    }

    @org.junit.jupiter.api.Test
    void size() {
        final int SIZE = 10;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < SIZE; i++) {
            arrayList.add(100 + i);
        }
        CircularListWithTail clwt = new CircularListWithTail( arrayList);
        assertTrue(clwt.size() == SIZE);
    }

    @org.junit.jupiter.api.Test
    void listIterator() {
    }
}