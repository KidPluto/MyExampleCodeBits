package net.kidpluto.CircularListWithTail;

import java.util.ArrayList;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {

        final int SIZE = 10;

        // Create and populate ArrayList
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < SIZE; i++) {
            arrayList.add(100 + i);
        }
        // Create CLWT from ArrayList
        CircularListWithTail clwt = new CircularListWithTail( arrayList);

        System.out.println("Create circular list with tail, with size of: " + clwt.size());

//        // What happens when the ctor, with just the start index, is used?
//        // There is no data, so how can you iterate
//        CircularListWithTail clwt_2 = new CircularListWithTail(5);
//        // Correctly says size is 0
//        System.out.println("Size is: " + clwt_2.size());
//        // How about iteraing?
//        // Correctly doesn't do anything. - good junit
//        ListIterator<CircularListWithTail> iterator_2 = clwt_2.listIterator();
//        while (iterator_2.hasNext()) {
//            System.out.println(" " + iterator_2.next());
//        }

//        // How do I compare two elements?
//        Integer int_1 = clwt.get(2);
//        Integer int_2 = clwt.get(2);
//        Integer int_3 =


        // What happens before setCircularPartStartIndex
        // Correctly just goes to the end of the list - good junit
//        clwt.setCircularPartStartIndex(3);
//        for (int i = 0; i < 15; i++) {
//            System.out.println("--> " + i + ", " + clwt.get(i));

        // This shows that you can iterate the circular list, correctly.
        // I assume you can't do this using for and .get(i)
        ListIterator<CircularListWithTail> iterator_1 = clwt.listIterator();
        ListIterator<CircularListWithTail> iterator_2 = clwt.listIterator();
        while (iterator_1.hasNext()) {
            Integer int_1 = (Integer)iterator_1.next().get(iterator_1.nextIndex());
            iterator_2.next();
            Integer int_2 = (Integer)iterator_2.next().get(iterator_2.nextIndex());
            System.out.println(" " + int_1 + ", " + int_2);
            if( int_1.equals(int_2)) {
                System.out.println("Found it");
                break;
            }
//            System.out.println(" " + iterator_1.next() + ", " + iterator_2.next());
//            // Don't know how to check for equals
//            if (iterator_1.equals(iterator_2)) {
//                System.out.println("Found it");
//                break;
//            }
        }
            // 10 long
            // 1    2
            // 2    4
            // 3    6
            // 4    8
            // 5    10
            // 6    2
            // 7    4
            // 8    6
            // 9    8
            // 10   10 <--
            // No tail, list of 10, iterators should match after to rounds
    // }

    }
}
