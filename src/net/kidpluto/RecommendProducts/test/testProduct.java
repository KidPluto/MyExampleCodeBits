package net.kidpluto.RecommendProducts.test;

import net.kidpluto.RecommendProducts.Product;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

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
        Product product_04 = new Product(1, "Cell phone: Motorola 34j5");

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

        assertEquals(2, productList.get(0).getCount());
        assertEquals(1, productList.get(1).getCount());
        assertEquals(1, productList.get(2).getCount());

    }
}