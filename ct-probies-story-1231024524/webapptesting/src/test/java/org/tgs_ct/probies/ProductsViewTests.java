package org.tgs_ct.probies;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

@Test
public class ProductsViewTests {
    private static final String PASSED = "";

    @Test(groups = {"smoke", "acceptance", "release"})
    public void smoke() {
        ProductsViewExpected expected = ProductsViewExpected.getInstance();
        ProductsView actual = ProductsView.directNav();
        String calibration = ProductsViewCalibrator.getInstance(expected, actual).calibrate();
        Assert.assertEquals(calibration, PASSED);
    }

    @AfterMethod(alwaysRun = true)
    private void terminate() {
        UiHost.getInstance().close();
    }
}
