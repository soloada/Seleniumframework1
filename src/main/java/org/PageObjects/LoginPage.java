package org.PageObjects;

import org.AbstractComponents.AbstractComponent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage   extends AbstractComponent{

    WebDriver driver;
    public LoginPage (WebDriver driver){
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy (id = "loginFrm_loginname")
    public WebElement loginName;

    @FindBy(id = "loginFrm_password")
    public WebElement password;

    @FindBy(css = "button[title='Login']")
    public WebElement loginBtn;

//By waitForLoginPageVisibility =By.id("loginFrm_loginname");



    public void loginApplication(String LoginName,String Password)
    {
        waitForVisibilityOfEle(loginName);
        loginName.sendKeys(LoginName);
        password.sendKeys(Password);
        loginBtn.click();


    }



}
