package net.kidpluto.RecommendProducts;

import java.util.*;

public class Product implements Comparable<Product> {

    private int id;
    private String description;

    // This attribute is used when the product is in a list
    // and the frequency of the product is needed to be know.
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
//    public void setCount (int count) {
//        this.count = count;
//    }
    // Only used for junit?
    public int getCount () {
        return count;
    }
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
    // Needed to implement Comparable
    @Override
    public int compareTo(Product product) {
        int compareProducts = ((Product) product).getCount();
        // return this.id - compareProducts;
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
    public static void main (String arg []) {
//        Product product_01 = new Product(1, "Book: The Tides of Time");
//        Product product_02 = new Product(2, "Book: Wormword, Your Best Solution for Cabinents");
//        Product product_03 = new Product(3, "Toy: Little Boy Craine");
//        Product product_04 = new Product(1, "Cell phone: Motorola 34j5");
//
//        List<Product> productList = new LinkedList<>();
//
//        // Returns -1 if not in list
//        int indexOf = productList.indexOf(product_01);
//
//        if (indexOf!=-1) {
//            productList.get(indexOf).incrementCount();
//        }
//        else {
//            productList.add(product_01);
//        }
//
//        indexOf = productList.indexOf(product_02);
//
//        if (indexOf!=-1) {
//            productList.get(indexOf).incrementCount();
//        }
//        else {
//            productList.add(product_02);
//        }
//
//        indexOf = productList.indexOf(product_03);
//
//        if (indexOf!=-1) {
//            productList.get(indexOf).incrementCount();
//        }
//        else {
//            productList.add(product_03);
//        }
//
//        indexOf = productList.indexOf(product_04);
//
//        if (indexOf!=-1) {
//            productList.get(indexOf).incrementCount();
//        }
//        else {
//            productList.add(product_04);
//        }
//
//        ListIterator<Product> iterator = productList.listIterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next().toString());
//        }
    }
}
