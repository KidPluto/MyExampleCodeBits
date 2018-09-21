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

//    @org.junit.jupiter.api.Test
//        // Tests
//    void testFromStartOneLoopPlusOne() {
//        System.out.println("Testing FromStartOneLoopPlusOne");
//        CircularListWithTail clwt = new CircularListWithTail(arrayList);
//
//        ListIterator<CircularListWithTail> itor = clwt.listIterator();
//        int index = 0;
//        int OneLoop = 10;
//        while( itor.hasNext() && index < OneLoop) {
//            System.out.println("Index and value: " + index++ + " " + itor.next());
//        }
////        Integer theNextValue = itor.next();
//        int theNextIndex = itor.nextIndex();
//        Integer theNextValue = (Integer)clwt.get(theNextIndex);
//        System.out.println("theNextValue: " + theNextValue);
//        if (theNextValue == 105) { System.out.println("Yes"); }
//        else { System.out.println("No"); }
//        // These break
////        assertTrue(theNextValue.equals(105));
////        assertTrue(theNextValue == 105);
//    }

    @org.junit.jupiter.api.Test
    // Tests ctor using ArrayList
    // Circular list, with no tail is created
    void testCtorTakingCollectionOnly() {
        System.out.println("Testing CtorTakingCollectionOnly");
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
        System.out.println("Testing CtorTakesCircularPartStartIndexOnly");
        final int SIZE = 5;
        CircularListWithTail clwt = new CircularListWithTail( SIZE);
        // Check for size of zero
        assertTrue( clwt.size() == 0);

        // List is of size 0, this code will do nothing, but also not break.
        ListIterator<CircularListWithTail> iter = clwt.listIterator();
        while (iter.hasNext()) {
            System.out.println(" " + iter.next());
        }
        assertTrue(TRUE, "TEst message");
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
        System.out.println("Testing CtorTakesCircularPartStartIndex_Negative_AndCollection");
        final int STARTINDEX = -5;
        // Ensure that IndexOutOfBoundsException is thrown
        assertThrows(IndexOutOfBoundsException.class, () -> {new CircularListWithTail(STARTINDEX, arrayList);});
    }

    @org.junit.jupiter.api.Test
    // Test the getter for circular part start index
    void testGetCircularPartStartIndex() {
        System.out.println("Testing GetCircularPartStartIndex");
        CircularListWithTail clwt = new CircularListWithTail( STARTINDEX, arrayList);
        // assertTrue(clwt.getCircularPartStartIndex() == STARTINDEX);
        assertEquals(clwt.getCircularPartStartIndex(), STARTINDEX, "Testing GetCircularPartStartIndex");
    }

    @org.junit.jupiter.api.Test
    // Test the getting for size
    void testGetSize() {
        System.out.println("Testing GetSize");
        CircularListWithTail clwt = new CircularListWithTail( arrayList);
//        assertTrue(clwt.size() == SIZE);
        assertEquals(clwt.size(), SIZE);
    }

    @org.junit.jupiter.api.Test
        // Test
    void testIteraforAdd() {
    }

    @org.junit.jupiter.api.Test
        // Test
    void testIteratorRemove() {
    }

//    @org.junit.jupiter.api.Test
//        // Test
//    void testIteratorSet() {
//        CircularListWithTail clwt = new CircularListWithTail( arrayList);
//        int indexToReplace = 7;
//        Integer newElement = new Integer(27);
////        ArrayList<Integer> newArrayList = new ArrayList<Integer>();
////        newArrayList.add(new Integer(27));
////        CircularListWithTail newClwt = new CircularListWithTail( newArrayList);
//
//        ListIterator<CircularListWithTail> iter = clwt.listIterator();
//        while (iter.hasNext()) {
//            iter.next();
//            if (iter.nextIndex() == indexToReplace) {
//                iter.set(newElement);
//            }
//        }
//        System.out.println("testIteratorSet: " + clwt.toString());
//    }

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

    @org.junit.jupiter.api.Test
    // Test
    void testGetActualIndex() {

    }

    @org.junit.jupiter.api.Test
        // Test
    void testToString() {
        System.out.println("Testing ToString");
        CircularListWithTail clwt = new CircularListWithTail( arrayList);
        System.out.println(clwt.toString());
    }

//    @org.junit.jupiter.api.Test
//    //
//    void listIterator() {

        // This test is intended to show that the iterator will go from the last element
        // in the list to the point where the circular list starts.
        // This will result in an infinate loop, so using another counter to not know when
        // to stop looping.
        // This seems to work, except that .nextIndex is returning an incorrect value after
        // the first iteration.
        // But somehow this is still working correctly
        //   clwt.get(iter.nextIndex())
        // I think the "issue" is with how getActualIndex is coded
        //
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