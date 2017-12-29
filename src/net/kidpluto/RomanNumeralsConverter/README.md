Convert number to roman numerial notation
==========================================

  * Reminder, for what roman numerial notation is https://www.romannumerals.org/
  * Run testConvertToRomanNumerials to see the code work. Although nothing is printed, as all the tests pass.
  * Tips for solving the problem: 
    * Start out using IIII for 4 and VIIII for 9.  
    * If you have that working, adding the pairs of "4 IV" and "9 IX" to ThePairsList should work with no code changes.
  * Junit code from testConvertToRomanNumerials.java
```java
        assertEquals("I", convert.calculate(1, mappingList));
        assertEquals("II", convert.calculate(2, mappingList));
        assertEquals("III", convert.calculate(3, mappingList));
        assertEquals("IV", convert.calculate(4, mappingList));
        assertEquals("V", convert.calculate(5, mappingList));
        assertEquals("VI", convert.calculate(6, mappingList));
        assertEquals("VII", convert.calculate(7, mappingList));
        assertEquals("VIII", convert.calculate(8, mappingList));
        assertEquals("X", convert.calculate(10, mappingList));
        assertEquals("XI", convert.calculate(11, mappingList));
        assertEquals("XIV", convert.calculate(14, mappingList));
        assertEquals("XIX", convert.calculate(19, mappingList));
        assertEquals("XXIV", convert.calculate(24, mappingList));
        assertEquals("XXIX", convert.calculate(29, mappingList));
        assertEquals("XXXIV", convert.calculate(34, mappingList));
        assertEquals("XXXIX", convert.calculate(39, mappingList));
        assertEquals("XXXXIV", convert.calculate(44, mappingList));
        assertEquals("XXXXIX", convert.calculate(49, mappingList));
        assertEquals("L", convert.calculate(50, mappingList));
        assertEquals("LIV", convert.calculate(54, mappingList));
        assertEquals("LIX", convert.calculate(59, mappingList));
        assertEquals("CC", convert.calculate(200, mappingList));
        assertEquals("CCLIV", convert.calculate(254, mappingList));
```
