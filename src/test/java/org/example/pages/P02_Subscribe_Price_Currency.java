package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static org.example.stepDefs.Hooks.driver;

public class P02_Subscribe_Price_Currency {
    public WebElement countryBtn() {
        return driver.findElement(By.id("country-btn"));

    }
    public WebElement uaeBtn() {
        return driver.findElement(By.id("ae"));

    }

    public WebElement dzBtn() {
        return driver.findElement(By.id("dz"));

    }

    public WebElement djiBtn() {
        return driver.findElement(By.id("dj"));

    }
    public WebElement chadBtn() {
        return driver.findElement(By.id("td"));

    }
    public WebElement IraqBtn() {
        return driver.findElement(By.id("iq"));

    }

    public WebElement JordanBtn() {
        return driver.findElement(By.id("jo"));

    }

    public WebElement LebanonBtn() {
        return driver.findElement(By.id("lb"));

    }
    public WebElement MoroccoBtn() {
        return driver.findElement(By.id("ma"));

    }

    public WebElement OmanBtn() {
        return driver.findElement(By.id("om"));

    }

    public WebElement TunisiaBtn() {
        return driver.findElement(By.id("tn"));

    }

    public WebElement YemenBtn() {
        return driver.findElement(By.id("ye"));

    }

    public WebElement PalestineBtn() {
        return driver.findElement(By.id("ps"));

    }

    public String trailCost() {
        return driver.findElement(By.className("trial-cost")).getText();

    }
    public String litePackage() {
        return driver.findElement(By.id("currency-lite")).getText();

    }
    public String classicPackage() {
        return driver.findElement(By.id("currency-classic")).getText();

    }
    public String premiumPackage() {
        return driver.findElement(By.id("currency-premium")).getText();

    }


}
