package net.kidpluto.RecommendProducts;

import java.util.List;

public class Products {

    private List<Product> productList;

    public Products() {}

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
    public List<Product> getProductList() {
        return productList;
    }
}
