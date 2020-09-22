package org.tgs_ct.probies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.tgs_ct.probies.data.ProductCalibratable;
import org.tgs_ct.probies.data.ProductRepository;
import org.tgs_ct.probies.data.ProductUi;

import java.util.ArrayList;
import java.util.List;

public class ProductsView implements ProductsViewCalibratable {
    private static final String URL = "localhost:3000";
    @SuppressWarnings("FieldCanBeLocal")
    private static List<ProductCalibratable> products;

    private ProductsView() {
        products = ProductRepository.getInstance().query();
    }

    public static ProductsView directNav() {
        ProductsView productsView = new ProductsView();
        productsView.load();
        productsView.confirmState();
        return productsView;
    }

    private void confirmState() {
        UiHost.getInstance().waitUntilVisible(new By.ById("home"));
    }

    private void load() {
        UiHost.getInstance().load(URL);
    }

    public List<ProductCalibratable> getProducts() {
        List<ProductCalibratable> products = new ArrayList<>();
        By productLocator = new By.ByClassName("product");
        for (WebElement element : UiHost.getInstance().findElements(productLocator)) {
            products.add(ProductUi.getInstance(element));
        }
        return products;
    }

    public String getLabel() {
        By locator = new By.ById("title");
        UiHost.getInstance().waitUntilVisible(locator);
        WebElement element = UiHost.getInstance().findElement(locator);
        return element == null ? "" : element.getText();
    }
}
