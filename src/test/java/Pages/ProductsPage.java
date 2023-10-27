package Pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import static Tests.SeleniumTest.driver;

public class ProductsPage {
    public static String firstAtribute_xpath = "//h2[contains(text(),'Client-First')]";

    public static String secondAtribute_xpath = "//h2[contains(text(),'Data-Led')]";

    public static String thirdAtribute_xpath = "//h2[contains(text(),'People-Powered')]";

    public static void verify_step1_name() {
        String expectedTitle = "Client-First";
        String step1 = driver.findElement(By.xpath(firstAtribute_xpath)).getText();
        Assert.assertEquals(expectedTitle, step1);
    }

    public static void verify_step2_name() {
        String expectedTitle = "Data-Led";
        String step2 = driver.findElement(By.xpath(secondAtribute_xpath)).getText();
        Assert.assertEquals(expectedTitle, step2);
    }

    public static void verify_step3_name() {
        String expectedTitle = "People-Powered";
        String step3 = driver.findElement(By.xpath(thirdAtribute_xpath)).getText();
        Assert.assertEquals(expectedTitle, step3);
    }
}
