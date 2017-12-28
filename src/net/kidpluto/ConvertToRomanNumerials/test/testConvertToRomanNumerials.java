package net.kidpluto.ConvertToRomanNumerials.test;

import net.kidpluto.ConvertToRomanNumerials.ConvertToRomanNumerials;
import net.kidpluto.ConvertToRomanNumerials.MappingList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class testConvertToRomanNumerials {

    private MappingList mappingList = new MappingList();

    @org.junit.jupiter.api.BeforeAll
    // Create ArrayList
    static void beforeAll() {
        //
    }

    @org.junit.jupiter.api.Test
        // Tests
    void test49() {
    System.out.println("Testing converting 49");

        ConvertToRomanNumerials ctrn = new ConvertToRomanNumerials();
        int toConvert = 49;
//        System.out.println("Input is: " + toConvert + ", result is: " + ctrn.calculate(175, ml));
        assertEquals(ctrn.calculate(toConvert, mappingList), "XLC");
    }
}