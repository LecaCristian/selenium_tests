package Pages;

import org.openqa.selenium.By;

import static Tests.SeleniumTest.driver;

public class HomePage {

    public static String about_button_xpath="//*[@id='menu-item-4705']";


    public static void click_about(){
        driver.findElement(By.xpath(about_button_xpath)).click();
    }

}
