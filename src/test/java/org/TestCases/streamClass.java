package org.TestCases;

import org.PageObjects.SubmenuPage;
import org.TestComponents.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class streamClass extends BaseTest {
    WebDriver driver;


    @Test
    public void streamTest (){

        SubmenuPage submenuPage = new SubmenuPage(driver);
        submenuPage.getSubmenu().stream().filter(menuList-> menuList.getText().equalsIgnoreCase("  Men"))
                .forEach(WebElement::click);

        submenuPage.getMenFragrance().stream().filter(menFragrance-> menFragrance.getText().equalsIgnoreCase("Pre-Shave & Shaving"))
                .forEach(WebElement::click);
        Assert.assertTrue(driver.findElement(By.cssSelector("span.maintext"))
                .getText().trim().equalsIgnoreCase("PRE-SHAVE & SHAVING".trim()));

        List<WebElement> ele = driver.findElements(By.id("iamamilionaire"));






        /*for (int i=0;i<submenu.size();i++){
            System.out.println(submenu.get(i).getText());
            if (submenu.get(i).getText().trim().equalsIgnoreCase("MEN".trim())){
                submenu.get(i).click();
            }
        }*/
        //driver.findElement(By.cssSelector(".active.menu_home")).click();



    }
}
