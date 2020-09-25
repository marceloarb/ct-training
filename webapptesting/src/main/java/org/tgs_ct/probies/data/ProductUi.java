package org.tgs_ct.probies.data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ProductUi extends ProductCalibratable {
    private final String name;

    private ProductUi(WebElement productElement) {
        By nameLocator = new By.ByClassName("product-name");
        name = productElement.findElement(nameLocator).getText();
    }

    public static ProductUi getInstance(WebElement productElement) {
        return new ProductUi(productElement);
    }

    @Override
    String getName() {
        return name;
    }
}
