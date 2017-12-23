package net.kidpluto.CircularListWithTail.test;

import net.kidpluto.CircularListWithTail.CircularListWithTail;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;

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
        assertTrue(TRUE);
    }

    @org.junit.jupiter.api.Test
    void ctorTakesCircularPartStartIndex() {
        final int SIZE = 5;
        CircularListWithTail clwt = new CircularListWithTail( SIZE);
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