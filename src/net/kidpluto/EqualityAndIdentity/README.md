Equality and Identity
=====================

Identity
--------
  * Identity ''.equals()''
    * Two objects are called **identical** when they point to the same reference in memory
    * A variable holds the same instance as another variable.
    
````java
      Integer a = new Integer(1);    
      Integer b = a;
````    

Equality
--------
  * Equality ''==''
      * Two objects are considered **equal** when they contain similar data, regardless of the memory locations to which the objects point.
      * Two distinct objects can be used interchangeably. they often have the same id.
````java
      Integer c = new Integer(1);  
      Integer d = new Integer(1);
````

Additional
----------
  * Question from an interview, was something to the effect
    * Why do you need to define .equals and .hashCode?
    * What happens if you don't?