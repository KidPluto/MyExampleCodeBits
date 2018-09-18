package net.kidpluto.RecommendProducts;

import java.util.List;

public class GetProducts {

    private List<Product> productList;

    public GetProducts() {}

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
    public List<Product> getProductList() {
        return productList;
    }
}
