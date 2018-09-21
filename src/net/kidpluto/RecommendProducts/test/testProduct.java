package net.kidpluto.RecommendProducts.test;

import net.kidpluto.RecommendProducts.Product;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testProduct {

    @org.junit.jupiter.api.BeforeAll
    static void beforeAll() {
        //
    }

    // This shows that if the product already exists on the list the count will be incremented.
    @org.junit.jupiter.api.Test
    void runTheTest() {

        Product product_01 = new Product(1, "Book: The Tides of Time");
        Product product_02 = new Product(2, "Book: Wormword, Your Best Solution for Cabinents");
        Product product_03 = new Product(3, "Toy: Little Boy Craine");
        Product product_04 = new Product(2, "Book: Wormword, Your Best Solution for Cabinents");

        List<Product> productList = new LinkedList<>();

        // Returns -1 if not in list
        int indexOf = productList.indexOf(product_01);
        if (indexOf != -1) {
            productList.get(indexOf).incrementCount();
        } else {
            productList.add(product_01);
        }

        indexOf = productList.indexOf(product_02);
        if (indexOf != -1) {
            productList.get(indexOf).incrementCount();
        } else {
            productList.add(product_02);
        }

        indexOf = productList.indexOf(product_03);
        if (indexOf != -1) {
            productList.get(indexOf).incrementCount();
        } else {
            productList.add(product_03);
        }

        indexOf = productList.indexOf(product_04);
        if (indexOf != -1) {
            productList.get(indexOf).incrementCount();
        } else {
            productList.add(product_04);
        }

//        ListIterator<Product> iterator = productList.listIterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next().toString());
//        }

        assertEquals(1, productList.get(0).getCount());
        assertEquals(2, productList.get(1).getCount());
        assertEquals(1, productList.get(2).getCount());

        // Now lets set things up to show that Collections.sort is working

        Product product_05 = new Product(3, "Toy: Little Boy Craine");
        indexOf = productList.indexOf(product_05);
        if (indexOf != -1) {
            productList.get(indexOf).incrementCount();
        } else {
            productList.add(product_05);
        }

        Product product_06 = new Product(3, "Toy: Little Boy Craine");
        indexOf = productList.indexOf(product_06);
        if (indexOf != -1) {
            productList.get(indexOf).incrementCount();
        } else {
            productList.add(product_06);
        }

        Product product_07 = new Product(3, "Toy: Little Boy Craine");
        indexOf = productList.indexOf(product_07);
        if (indexOf != -1) {
            productList.get(indexOf).incrementCount();
        } else {
            productList.add(product_07);
        }

        // Before the sort

//        ListIterator<Product> iterator = productList.listIterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next().toString());
//        }

        assertEquals(1, productList.get(0).getCount());
        assertEquals(2, productList.get(1).getCount());
        assertEquals(4, productList.get(2).getCount());

        Collections.sort(productList);

        // After the sort

//        ListIterator<Product> iterator = productList.listIterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next().toString());
//        }

        assertEquals(4, productList.get(0).getCount());
        assertEquals(2, productList.get(1).getCount());
        assertEquals(1, productList.get(2).getCount());

    }
}