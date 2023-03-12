package org.example.stepDefs;
import io.cucumber.java.en.Given;
import org.example.pages.P01_Subscribe_Type;
import org.example.pages.P02_Subscribe_Price_Currency;
import org.testng.Assert;


public class D02_Subscribe_Price_Currency {
    P01_Subscribe_Type versionBtn = new P01_Subscribe_Type();
    P02_Subscribe_Price_Currency price = new P02_Subscribe_Price_Currency();
    P02_Subscribe_Price_Currency uaeCountry = new P02_Subscribe_Price_Currency();
    P02_Subscribe_Price_Currency dzCountry = new P02_Subscribe_Price_Currency();
    P02_Subscribe_Price_Currency djiCountry = new P02_Subscribe_Price_Currency();
    P02_Subscribe_Price_Currency chadCountry = new P02_Subscribe_Price_Currency();
    P02_Subscribe_Price_Currency iraqCountry = new P02_Subscribe_Price_Currency();
    P02_Subscribe_Price_Currency jordanCountry = new P02_Subscribe_Price_Currency();
    P02_Subscribe_Price_Currency lebanonCountry = new P02_Subscribe_Price_Currency();
    P02_Subscribe_Price_Currency moroccoCountry = new P02_Subscribe_Price_Currency();
    P02_Subscribe_Price_Currency omanCountry = new P02_Subscribe_Price_Currency();
    P02_Subscribe_Price_Currency tunisiaCountry = new P02_Subscribe_Price_Currency();
    P02_Subscribe_Price_Currency yemenCountry = new P02_Subscribe_Price_Currency();
    P02_Subscribe_Price_Currency palestineCountry = new P02_Subscribe_Price_Currency();
    P02_Subscribe_Price_Currency trailFree = new P02_Subscribe_Price_Currency();
    P02_Subscribe_Price_Currency litePrice = new P02_Subscribe_Price_Currency();
    P02_Subscribe_Price_Currency classicPrice = new P02_Subscribe_Price_Currency();
    P02_Subscribe_Price_Currency premiumPrice = new P02_Subscribe_Price_Currency();

    @Given("user validate EG subscription price")
    public void validate_EG_price_Currency()
    {
        versionBtn.tranButton().click();

        // Validate EGYPT Subscription Package
       String liteEGPrice = litePrice.litePackage();
        Assert.assertEquals(liteEGPrice, "1.3 USD/Month\n" +
                "0.25 USD/Month");

        String classEGPrice = classicPrice.classicPackage();
        Assert.assertEquals(classEGPrice, "3.2 USD/Month\n" +
                "0.50 USD/Month");

        String preEGPrice = premiumPrice.premiumPackage();
        Assert.assertEquals(preEGPrice, "5.1 USD/Month\n" +
                "1 USD/Month");
    }
    @Given("user validate UAE subscription price")
    public void validate_UAE_price_Currency()
    {
         price.countryBtn().click();

         uaeCountry.uaeBtn().click();
         String uaeURL = "https://subscribe.jawwy.tv/ae-en";
         Assert.assertEquals(uaeURL, "https://subscribe.jawwy.tv/ae-en");

        // validate UAE trail cost
        String trailUAECost = trailFree.trailCost();
        Assert.assertEquals(trailUAECost, "From 10.00 AED/week");


        // Validate UAE Subscription Package
        String liteUAEPrice = litePrice.litePackage();
        Assert.assertEquals(liteUAEPrice, "5.4 USD/month");

        String classUAEPrice = classicPrice.classicPackage();
        Assert.assertEquals(classUAEPrice, "10.9 USD/month");

        String preUAEPrice = premiumPrice.premiumPackage();
        Assert.assertEquals(preUAEPrice, "16.3 USD/month");
    }
    @Given("user validate Algeria subscription price")
    public void validate_Algeria_price_Currency()
    {
        price.countryBtn().click();

        dzCountry.dzBtn().click();
        String dzURL = "https://subscribe.jawwy.tv/dz-en";
        Assert.assertEquals(dzURL, "https://subscribe.jawwy.tv/dz-en");


        // Validate Algeria Subscription Package
        String liteDZPrice = litePrice.litePackage();
        Assert.assertEquals(liteDZPrice, "2.7 USD/month");

        String classDZPrice = classicPrice.classicPackage();
        Assert.assertEquals(classDZPrice, "5.3 USD/month");

        String preDZPrice = premiumPrice.premiumPackage();
        Assert.assertEquals(preDZPrice, "8 USD/month");
    }
    @Given("user validate DJI subscription price")
    public void validate_DJI_price_Currency()
    {
        price.countryBtn().click();

        djiCountry.djiBtn().click();
        String djiURL = "https://subscribe.jawwy.tv/dj-en";
        Assert.assertEquals(djiURL, "https://subscribe.jawwy.tv/dj-en");


        // Validate DJI Subscription Package
        String liteDJIPrice = litePrice.litePackage();
        Assert.assertEquals(liteDJIPrice, "2.4 USD/month");

        String classDJIPrice = classicPrice.classicPackage();
        Assert.assertEquals(classDJIPrice, "4.8 USD/month");

        String preDJIPrice = premiumPrice.premiumPackage();
        Assert.assertEquals(preDJIPrice, "7.2 USD/month");
    }
    @Given("user validate Chad subscription price")
    public void validate_Chad_price_Currency()
    {
        price.countryBtn().click();

        chadCountry.chadBtn().click();
        String chadURL = "https://subscribe.jawwy.tv/td-en";
        Assert.assertEquals(chadURL, "https://subscribe.jawwy.tv/td-en");


        // Validate Chad Subscription Package
        String liteChadPrice = litePrice.litePackage();
        Assert.assertEquals(liteChadPrice, "2.4 USD/month");

        String classChadPrice = classicPrice.classicPackage();
        Assert.assertEquals(classChadPrice, "4.8 USD/month");

        String preChadPrice = premiumPrice.premiumPackage();
        Assert.assertEquals(preChadPrice, "7.2 USD/month");
    }

    @Given("user validate Iraq subscription price")
    public void validate_Iraq_price_Currency()
    {
        price.countryBtn().click();

        iraqCountry.IraqBtn().click();
        String iraqURL = "https://subscribe.jawwy.tv/iq-en";
        Assert.assertEquals(iraqURL, "https://subscribe.jawwy.tv/iq-en");

        // validate Iraq free trail
        String trailIraqCost = trailFree.trailCost();
        Assert.assertEquals(trailIraqCost, "From 900.00 IQ/week");


        // Validate Iraq Subscription Package
        String liteIraqPrice = litePrice.litePackage();
        Assert.assertEquals(liteIraqPrice, "2.4 USD/month");

        String classIraqPrice = classicPrice.classicPackage();
        Assert.assertEquals(classIraqPrice, "4.1 USD/month");

        String preIraqPrice = premiumPrice.premiumPackage();
        Assert.assertEquals(preIraqPrice, "6.2 USD/month");
    }

    @Given("user validate Jordan subscription price")
    public void validate_Jordan_price_Currency()
    {
        price.countryBtn().click();

        jordanCountry.JordanBtn().click();
        String iraqURL = "https://subscribe.jawwy.tv/jo-en";
        Assert.assertEquals(iraqURL, "https://subscribe.jawwy.tv/jo-en");

        // validate Jordan free trail
        String trailJordanCost = trailFree.trailCost();
        Assert.assertEquals(trailJordanCost, "From 0.99 JOD/week");


        // Validate Jordan Subscription Package
        String liteJordanPrice = litePrice.litePackage();
        Assert.assertEquals(liteJordanPrice, "2.7 USD/month");

        String classJordanPrice = classicPrice.classicPackage();
        Assert.assertEquals(classJordanPrice, "5.2 USD/month");

        String preJordanPrice = premiumPrice.premiumPackage();
        Assert.assertEquals(preJordanPrice, "8 USD/month");
    }

    @Given("user validate Lebanon subscription price")
    public void validate_Lebanon_price_Currency()
    {
        price.countryBtn().click();

        lebanonCountry.LebanonBtn().click();
        String iraqURL = "https://subscribe.jawwy.tv/lb-en";
        Assert.assertEquals(iraqURL, "https://subscribe.jawwy.tv/lb-en");


        // Validate Lebanon Subscription Package
        String liteLebanonPrice = litePrice.litePackage();
        Assert.assertEquals(liteLebanonPrice, "2.4 USD/month");

        String classLebanonPrice = classicPrice.classicPackage();
        Assert.assertEquals(classLebanonPrice, "4.8 USD/month");

        String preLebanonPrice = premiumPrice.premiumPackage();
        Assert.assertEquals(preLebanonPrice, "7.2 USD/month");
    }

    @Given("user validate Morocco subscription price")
    public void validate_Morocco_price_Currency()
    {
        price.countryBtn().click();

        moroccoCountry.MoroccoBtn().click();
        String iraqURL = "https://subscribe.jawwy.tv/ma-en";
        Assert.assertEquals(iraqURL, "https://subscribe.jawwy.tv/ma-en");


        // Validate Morocco Subscription Package
        String liteMoroccoPrice = litePrice.litePackage();
        Assert.assertEquals(liteMoroccoPrice, "2 USD/month");

        String classMoroccoPrice = classicPrice.classicPackage();
        Assert.assertEquals(classMoroccoPrice, "3.9 USD/month");

        String preMoroccoPrice = premiumPrice.premiumPackage();
        Assert.assertEquals(preMoroccoPrice, "5.8 USD/month");
    }

    @Given("user validate Oman subscription price")
    public void validate_Oman_price_Currency()
    {
        price.countryBtn().click();

        omanCountry.OmanBtn().click();
        String omanURL = "https://subscribe.jawwy.tv/om-en";
        Assert.assertEquals(omanURL, "https://subscribe.jawwy.tv/om-en");

        // validate Oman free trial
        String trailOmanCost = trailFree.trailCost();
        Assert.assertEquals(trailOmanCost, "From 1.00 OMR/week");


        // Validate Oman Subscription Package
        String liteOmanPrice = litePrice.litePackage();
        Assert.assertEquals(liteOmanPrice, "5 USD/month");

        String classOmanPrice = classicPrice.classicPackage();
        Assert.assertEquals(classOmanPrice, "10 USD/month");

        String preOmanPrice = premiumPrice.premiumPackage();
        Assert.assertEquals(preOmanPrice, "15 USD/month");
    }

    @Given("user validate Tunisia subscription price")
    public void validate_Tunisia_price_Currency()
    {
        price.countryBtn().click();

        tunisiaCountry.TunisiaBtn().click();
        String tunisiaURL = "https://subscribe.jawwy.tv/tn-en";
        Assert.assertEquals(tunisiaURL, "https://subscribe.jawwy.tv/tn-en");

        // validate Tunisia free trial
        String trailTunisiaCost = trailFree.trailCost();
        Assert.assertEquals(trailTunisiaCost, "From 1.00 TND/week");


        // Validate Tunisia Subscription Package
        String liteTunisiaPrice = litePrice.litePackage();
        Assert.assertEquals(liteTunisiaPrice, "1.7 USD/month");

        String classTunisiaPrice = classicPrice.classicPackage();
        Assert.assertEquals(classTunisiaPrice, "3.4 USD/month");

        String preTunisiaPrice = premiumPrice.premiumPackage();
        Assert.assertEquals(preTunisiaPrice, "5.8 USD/month");
    }

    @Given("user validate Yemen subscription price")
    public void validate_Yemen_price_Currency()
    {
        price.countryBtn().click();

       yemenCountry.YemenBtn().click();
        String tunisiaURL = "https://subscribe.jawwy.tv/ye-en";
        Assert.assertEquals(tunisiaURL, "https://subscribe.jawwy.tv/ye-en");


        // Validate Yemen Subscription Package
        String liteYemenPrice = litePrice.litePackage();
        Assert.assertEquals(liteYemenPrice, "2.4 USD/month");

        String classYemenPrice = classicPrice.classicPackage();
        Assert.assertEquals(classYemenPrice, "4.8 USD/month");

        String preYemenPrice = premiumPrice.premiumPackage();
        Assert.assertEquals(preYemenPrice, "7.2 USD/month");
    }

    @Given("user validate Palestine subscription price")
    public void validate_Palestine_price_Currency()
    {
        price.countryBtn().click();

        palestineCountry.PalestineBtn().click();
        String palestineURL = "https://subscribe.jawwy.tv/ps-en";
        Assert.assertEquals(palestineURL, "https://subscribe.jawwy.tv/ps-en");


        // Validate Palestine Subscription Package
        String litePalestinePrice = litePrice.litePackage();
        Assert.assertEquals(litePalestinePrice, "2.4 USD/month");

        String classPalestinePrice = classicPrice.classicPackage();
        Assert.assertEquals(classPalestinePrice, "4.8 USD/month");

        String prePalestinePrice = premiumPrice.premiumPackage();
        Assert.assertEquals(prePalestinePrice, "7.2 USD/month");
    }
}