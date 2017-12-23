package net.kidpluto.CircularListWithTail;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Created by Chris on 4/21/2017.
 *
 * From interview
 * You have a linked list, which connects back to the list.
 * How can you figure out which node that is
 * Thomas B suggested using two iterators, the second +2
 */
public class LoopingLinkedList {

    public static void main(String[] args) {
        final int sizeOfList = 10;
        LinkedList<Integer> theList = new LinkedList<Integer>();
        for (int i = 0; i <sizeOfList ; i++) {
            theList.add(i+100);
        }
        // Try and point last node to node#3, worked
        theList.add( theList.get(2));
        //
//        for (int i = 0; i < sizeOfList+2; i++) {
//            System.out.print("--> " + theList.get(i));
//        }
        ListIterator<Integer> iter = theList.listIterator();
        while (iter.hasNext()) {
            System.out.println("==> " + iter.next().toString());
        }

//       ListIterator<Integer> singleStep = theList.listIterator();
//       ListIterator<Integer> doubleStep = theList.listIterator();

       // Using
//        int completeTrips = 2;
//        for (int i = 0; i < completeTrips; i++) {
//            for (int j = 0; j < sizeOfList; j++) {
////                doubleStep.next();
////                System.out.println(singleStep.next().toString() + ", " + doubleStep.next().toString());
//                System.out.println(singleStep.next().toString());
//            }
//        }

//        for (int i = 0; i < sizeOfList+5; i++) {
//            // Able to cheat, as I know the list doesn't end - but doing it this way breaks
//            // System.out.println("Single: " + theList.get(i).toString() + ", Double: ");
//
//        }
    }
}
//        LoopingLinkedList.LL
//    }
//    private void LL () {
//        // Create a linked list
//        LinkedList<Node> theList = new LinkedList<Node>();
//        for (int i = 0; i < sizeOfList; i++) {
//            Node theNode = new Node();
//            theList.add(new Node());
//        }
//        for (char c : word_2.toCharArray()) {
//            ll_2.add(c);
//        }
//    }
//    private class Node {
//        private String theNode = new String("I am the node. Coco Acho.");
//        public int id;
//        public void node( int id){ this.id = id;};
//    }

