package org.PageObjects.TestPage_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginDemo {

    WebDriver driver;


    public LoginDemo(WebDriver driver){
        this.driver=driver;

        PageFactory.initElements(driver,this);

    }


    @FindBy(xpath= "//a[normalize-space()='Login or register']")
    private WebElement loginOrRegister;

    @FindBy(xpath = "//h2[text()='Returning Customer']")
    private WebElement assertText;

    @FindBy(id = "loginFrm_loginname")
    private WebElement userName;

    @FindBy(id = "loginFrm_password")
    private WebElement password;

    @FindBy(css = "button[title='Login'] i[class='fa fa-lock']")
    private WebElement clickLogin;




    public void getLoginOrRegister(){

        loginOrRegister.click();
    }

    public WebElement GetAssertText (){

        assertText.getText();

        return assertText;
    }


    public void loginInfo (String username1, String password1){
        userName.sendKeys(username1);
        password.sendKeys(password1);


    }

    public void setClickLogin (){
        clickLogin.click();


    }


    public void assertDashBoard (){
        clickLogin.click();


    }
}
