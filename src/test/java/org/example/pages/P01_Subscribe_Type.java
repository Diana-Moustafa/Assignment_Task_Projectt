package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static org.example.stepDefs.Hooks.driver;

public class P01_Subscribe_Type {

    public WebElement tranButton() {
        return driver.findElement(By.id("translation-btn"));
    }
}