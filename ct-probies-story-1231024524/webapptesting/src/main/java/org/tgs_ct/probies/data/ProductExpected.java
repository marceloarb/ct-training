package org.tgs_ct.probies.data;

public class ProductExpected extends ProductCalibratable {
    private final ProductCalibratable product;

    private ProductExpected(ProductCalibratable product) {
        this.product = product;
    }

    public static ProductExpected getInstance(ProductCalibratable product) {
        return new ProductExpected(product);
    }

    @Override
    String getName() {
        String name = product.getName();
        return (name == null) ? "[unknown]" : name;
    }
}
