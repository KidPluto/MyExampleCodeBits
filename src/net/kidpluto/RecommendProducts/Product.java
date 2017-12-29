package net.kidpluto.RecommendProducts;

public class Product {

    private int id;
    private String description;

    public Product(int id, String description) {
        this.id = id;
        this.description = description;
    }
    public int getId() {
        return id;
    }
    public String getDescription() {
        return description;
    }
}
