package org.tgs_ct.probies.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductRepository {
    private final List<ProductCalibratable> products;

    private ProductRepository() {
        ProductMock dell = new ProductMock("Dell Laptop");
        ProductMock macBook = new ProductMock("MacBook");
        ProductMock hpLaptop = new ProductMock("HP Laptop");
        ProductMock iMac = new ProductMock("IMac");
        ProductMock compaq = new ProductMock("Compaq");
        ProductMock lenovo = new ProductMock(null);
        this.products = new ArrayList<>(Arrays.asList(dell, macBook, hpLaptop, iMac, compaq, lenovo));
    }

    public static ProductRepository getInstance() {
        return new ProductRepository();
    }

    public List<ProductCalibratable> query() {
        return products;
    }
}
