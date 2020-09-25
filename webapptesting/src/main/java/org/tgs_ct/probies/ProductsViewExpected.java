package org.tgs_ct.probies;

import org.tgs_ct.probies.data.ProductCalibratable;
import org.tgs_ct.probies.data.ProductExpected;
import org.tgs_ct.probies.data.ProductProvider;

import java.util.ArrayList;
import java.util.List;

public class ProductsViewExpected implements ProductsViewCalibratable {
    private ProductsViewExpected() {
    }

    public static ProductsViewExpected getInstance() {
        return new ProductsViewExpected();
    }

    @Override
    public List<ProductCalibratable> getProducts() {
        List<ProductCalibratable> expectedProducts = new ArrayList<>();
        for (ProductCalibratable product : ProductProvider.getInstance().getAll()) {
            expectedProducts.add(ProductExpected.getInstance(product));
        }
        return expectedProducts;
    }

    @Override
    public String getLabel() {
        return "Product name";
    }
}
