Recommend Products
==================

Have web site, on which you want to recommend products for people to buy.

Two methods / operations
  * getFriends given person id, returns friends 
  * getProducts given person id, returns products bought
  
Good code examples
  * http://www.mkyong.com/java/java-object-sorting-example-comparable-and-comparator/

Search method from Collections 
  * https://docs.oracle.com/javase/7/docs/api/java/util/Collections.html#sort(java.util.List)  
  
```
Sort

public static <T extends Comparable<? super T>> void sort(List<T> list)

Sorts the specified list into ascending order, according to the natural ordering of its elements. All elements in 
the list must implement the Comparable interface. 

This sort is guaranteed to be stable: equal elements will not be reordered as a result of the sort.

The specified list must be modifiable, but need not be resizable.

Implementation note: This implementation is a stable, adaptive, iterative mergesort that requires far fewer than 
n lg(n) comparisons when the input array is partially sorted, while offering the performance of a traditional 
mergesort when the input array is randomly ordered. If the input array is nearly sorted, the implementation requires 
approximately n comparisons. Temporary storage requirements vary from a small constant for nearly sorted input arrays 
to n/2 object references for randomly ordered input arrays.

The implementation takes equal advantage of ascending and descending order in its input array, and can take 
advantage of ascending and descending order in different parts of the same input array. It is well-suited to 
merging two or more sorted arrays: simply concatenate the arrays and sort the resulting array.

This implementation dumps the specified list into an array, sorts the array, and iterates over the list resetting 
each element from the corresponding position in the array. This avoids the n2 log(n) performance that would result 
from attempting to sort a linked list in place.

Parameters:
    list - the list to be sorted.
Throws:
    ClassCastException - if the list contains elements that are not mutually comparable (for example, strings 
    and integers).
    UnsupportedOperationException - if the specified list's list-iterator does not support the set operation.
    IllegalArgumentException - (optional) if the implementation detects that the natural ordering of the list 
    elements is found to violate the Comparable contract
```  