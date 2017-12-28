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
    void test33() {
        int toConvert = 33;
        System.out.println("Testing converting " + toConvert);
        ConvertToRomanNumerials ctrn = new ConvertToRomanNumerials();
        assertEquals("XXXIII", ctrn.calculate(toConvert, mappingList));
    }
}