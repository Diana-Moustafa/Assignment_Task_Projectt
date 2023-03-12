package org.example.stepDefs;

import io.cucumber.java.en.Given;
import org.example.pages.P01_Subscribe_Type;
import org.testng.Assert;
import static org.example.stepDefs.Hooks.driver;
public class D01_Subscribe_Type {
    P01_Subscribe_Type type = new P01_Subscribe_Type();
    @Given("user validate subscription type")
    public void validate_sub_type()
    {
        type.tranButton().click();
        Assert.assertTrue(driver.getPageSource().contains("Lite"));
        Assert.assertTrue(driver.getPageSource().contains("Classic"));
        Assert.assertTrue(driver.getPageSource().contains("Premium"));

    }
}
