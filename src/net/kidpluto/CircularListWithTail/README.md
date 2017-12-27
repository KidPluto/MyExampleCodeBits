Circular List with Tail
=======================

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
