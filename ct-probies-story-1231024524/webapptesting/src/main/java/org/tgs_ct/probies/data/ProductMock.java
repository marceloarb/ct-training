package org.tgs_ct.probies.data;

public class ProductMock extends ProductCalibratable {
    private final String name;

    ProductMock(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
