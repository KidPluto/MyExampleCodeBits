Circular List with Tail
=======================

To address the original question "given you have a list which last element points to some other element in the list, how would you figure out what element that is?"
  * Have two iterators. Iterator #1 takes one step, while iterator #2 takes two steps.  At some point they will be pointing to the same node?
  * Have two iterators. For each step iterator #1 takes, iterator #2 travels the size+1, you check if they are pointing to the same node.
  * Have a backing list, for which you have a pointer for every element in the list.  Then you .... ?


Problem #1
----------
 Don't understand how to use the Iterator set method.  It appears to be asking for a CircularListWithTail, and you can see why that would be a problem.  Unsuccessfully attempted to passing an Integer.

Problem #2
----------
The Interator index value keeps incrementing when entering the looping portion of the structure.  So if you have an array of 10, with the loop index at 5, if you do 12 .next() calls the index is 12 instead of 7.  But you do get the correct element when asking for it.


Problem #3
----------
If the index keeps incrementing, as seen in Problem #2, then the call to .previous will require you iterate over the same elements more then once before getting back to the start.

Problem #4
----------
.toString seems to get into an infinate loop
And my first attempt at writing this doesn't look like it works either.

Problem #5
----------
I am able to do this, and get the value printed out. 
````java
System.out.println("Index and value: " + index++ + " " + itor.next());
````
But I am not able to do this
````java
Integer theNextValue = itor.next();
````
Maybe I need to do this?
````java
Integer theNextValue = (Integer)clwt.get(theNextIndex);
````
Problem #6
----------
These assertTrue statements break, really no idea why.
````java
int theNextIndex = itor.nextIndex();
Integer theNextValue = (Integer)clwt.get(theNextIndex);
System.out.println("theNextValue: " + theNextValue);
// These break
//        assertTrue(theNextValue.equals(105));
//        assertTrue(theNextValue == 105);
````
