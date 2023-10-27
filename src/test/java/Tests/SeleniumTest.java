package Tests;

import Pages.HomePage;
import Pages.ProductsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumTest {
    public static WebDriver driver;

    @BeforeTest
    public static void Setup(){
        driver = new ChromeDriver();
        driver.get("https://omnicommediagroup.com");
    }

    @Test

        void validateAboutPart(){
            HomePage.click_about();

        ProductsPage.verify_step1_name();
        ProductsPage.verify_step2_name();
        ProductsPage.verify_step3_name();

    }
}
