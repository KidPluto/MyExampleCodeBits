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
  
Revisiting this post years later I am horrified at the options available in Java to do this work. A quick search shows me why I now love Kotlin.
  * https://www.bezkoder.com/kotlin-sort-list/

It gets a little uglier when you need to sort by more than one field, but still prettier than Java
  * https://www.bezkoder.com/kotlin-sort-list-objects/

Some more examples
  * https://www.codevscolor.com/kotlin-5-ways-sort-list-ascending-descending

Thinking back, I think the original question was from an in person interview.  Don't remember anythig about the interview, not even how I answered the question.  But I am wondering why here I was documenting sorts are the answer.  Looking at the question now I would think that the data would be in a database, and the answer would be two different selects.
