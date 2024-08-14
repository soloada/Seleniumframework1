package org.TestCases.TestClass_Practice;

import org.PageObjects.TestPage_Practice.LoginDemo;
import org.TestComponents.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LoginTestDemo extends BaseTest {

    WebDriver driver;
    @Test
    public void loginDemoRunner (){
        LoginDemo loginDemo = new LoginDemo(driver);
        loginDemo.getLoginOrRegister();
        loginDemo.loginInfo("webdriverio2","webdriverio2");



    }
}
