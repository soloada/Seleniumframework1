package org.PageObjects;

import org.AbstractComponents.AbstractComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookOrderPage extends AbstractComponent {


    WebDriver driver;

    public BookOrderPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }



    @FindBy (css = ".maintext")
    public WebElement orderConformation;


    @FindBy (xpath = "//body/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/a[1]")
    private WebElement AllegiantByVeronicaRoth;



    public void getAllegiantByVeronicaRoth() {
        AllegiantByVeronicaRoth.click();
    }



}
