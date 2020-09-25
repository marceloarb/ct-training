package org.tgs_ct.probies.data;

import java.util.List;

public class ProductProvider {
    public static ProductProvider getInstance() {
        return new ProductProvider();
    }

    public List<ProductCalibratable> getAll() {
        return ProductRepository.getInstance().query();
    }
}
