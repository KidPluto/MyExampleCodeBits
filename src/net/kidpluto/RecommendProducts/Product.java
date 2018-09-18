package net.kidpluto.RecommendProducts;

import java.util.*;

public class Product implements Comparable<Product> {

    private int id;
    private String description;

    // This attribute is used when the product is in a list
    // and you don't want duplicate items.
    // What other ways are there of doing this?
    private int count;

    public Product(int id, String description) {
        this.id = id;
        this.description = description;
        this.count = 1;
    }
    public int getId() {
        return id;
    }
    public String getDescription() {
        return description;
    }

    // Only used for junit?
    public int getCount () {
        return count;
    }
    // This method is used when the product is in a list
    // and you don't want duplicate items.
    public void incrementCount() {
        count++;
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Id is: ");
        sb.append(id);
        sb.append(", Count is: ");
        sb.append(count);
        sb.append(System.getProperty("line.separator"));
        return sb.toString();
    }
    // Method required to implement Comparable
    @Override
    public int compareTo(Product product) {
        int compareProducts = ((Product) product).getCount();
        // Creates acending list
        // return this.id - compareProducts;
        // Create descending list
        return compareProducts - this.id;
    }
    // Only using the id attribute
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id;
    }
    // Only using the id attribute
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
//    public static void main (String arg []) {
//        // See testProduct.java
//    }
}
