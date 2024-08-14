package org.TestCases;

import org.PageObjects.HeaderPage;
import org.PageObjects.LoginPage;

import org.TestComponents.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class LoginTest extends BaseTest {
    //WebDriver driver;

    @Test (dataProvider="getData")
    public void login (HashMap<String,String> input){
        HeaderPage headerPage = new HeaderPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        headerPage.clickLoginLink();
        loginPage.loginApplication(input.get("LoginName"),input.get("Password"));

    }

    @DataProvider
    public Object [] [] getData () throws IOException {
        List<HashMap<String,String>> data = getJsonDataMap(System.getProperty("user.dir")+"\\src\\test\\java\\org\\Data\\loginDetails.json");
        return new Object [] []  {{data.get(0)},{data.get(1)}};

        /*HashMap<String,String> map = new HashMap<String, String>();
        map.put("LoginName","webdriverio2");
        map.put("Password","webdriverio2");

        HashMap<String,String> map1 = new HashMap<String, String>();
        map.put("LoginName","webdriverio2");
        map.put("Password","setToFail");*/



    }
}
