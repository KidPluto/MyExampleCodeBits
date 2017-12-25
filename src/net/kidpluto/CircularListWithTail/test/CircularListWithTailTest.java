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
    void testCtorTakingCollectionOnly() {
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
    void testCtorTakesCircularPartStartIndexOnly() {
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
    void testCtorTakesCircularPartStartIndexAndCollection() {
        CircularListWithTail clwt = new CircularListWithTail( STARTINDEX, arrayList);
        assertTrue(clwt.size() == SIZE);
        assertTrue(clwt.getCircularPartStartIndex() == STARTINDEX);
        assertTrue((int)clwt.get(STARTINDEX) == 105);
        assertTrue((int)clwt.get(STARTINDEX+1) == 106);
    }

    @org.junit.jupiter.api.Test
    // Test ctor with ArrayList and negative value for circular part start point
    void testCtorTakesCircularPartStartIndex_Negative_AndCollection() {
        final int STARTINDEX = -5;
        // Ensure that IndexOutOfBoundsException is thrown
        assertThrows(IndexOutOfBoundsException.class, () -> {new CircularListWithTail(STARTINDEX, arrayList);});
    }

    @org.junit.jupiter.api.Test
    // Test the getter for circular part start index
    void testGetCircularPartStartIndex() {
        CircularListWithTail clwt = new CircularListWithTail( STARTINDEX, arrayList);
        assertTrue(clwt.getCircularPartStartIndex() == STARTINDEX);
    }

    @org.junit.jupiter.api.Test
    // Test the getting for size
    void testGetSize() {
        CircularListWithTail clwt = new CircularListWithTail( arrayList);
        assertTrue(clwt.size() == SIZE);
    }

    @org.junit.jupiter.api.Test
        // Test
    void testIteraforAdd() {
    }

    @org.junit.jupiter.api.Test
        // Test
    void testIteratorRemove() {
    }

    @org.junit.jupiter.api.Test
        // Test
    void testIteratorSet() {
        CircularListWithTail clwt = new CircularListWithTail( arrayList);
        int indexToReplace = 7;
        ArrayList<Integer> newArrayList = new ArrayList<Integer>();
        newArrayList.add(new Integer(27));
        CircularListWithTail newClwt = new CircularListWithTail( newArrayList);

        ListIterator<CircularListWithTail> iter = clwt.listIterator();
        while (iter.hasNext()) {
            iter.next();
            if (iter.nextIndex() == indexToReplace) {
                iter.set(newClwt);
            }
        }
        System.out.println("testIteratorSet: " + clwt.toString());
    }

    @org.junit.jupiter.api.Test
        // Test
    void testIteratorHasPrevious() {
    }

    @org.junit.jupiter.api.Test
        // Test
    void testIteratorPrevious() {
    }

    @org.junit.jupiter.api.Test
        // Test
    void testIteratorPreviousIndex() {
    }

    @org.junit.jupiter.api.Test
        // Test
    void testIteratingBackwardsToTheStart() {
    }


//    @org.junit.jupiter.api.Test
//    //
//    void listIterator() {
//
//        // This test is intended to show that the iterator will go from the last element
//        // in the list to the point where the circular list starts.
//        // This will result in an infinate loop, so using another counter to not know when
//        // to stop looping.
//        // This seems to work, except that .nextIndex is return an incorrect value after
//        // the first iteration.
//        // But somehow this is still working correctly
//        //   clwt.get(iter.nextIndex())
//        //
//        CircularListWithTail clwt = new CircularListWithTail( STARTINDEX, arrayList);
//        int count = 0;
//        int stop = 12;
//        Integer int_1 = 0;
//        ListIterator<CircularListWithTail> iter = clwt.listIterator();
//        while (iter.hasNext()) {
//            System.out.println("nextIndex is: " + iter.nextIndex());
//            System.out.println("Value is: " + clwt.get(iter.nextIndex()));
//            iter.next();
//            if (++count == stop) {break;}
//        }
//    }
}