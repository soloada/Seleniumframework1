package org.AbstractComponents;

import org.PageObjects.BookOrderPage;
import org.PageObjects.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;



public class AbstractComponent {
WebDriver driver;
    public AbstractComponent(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }


    @FindBy(xpath = "//header/div[2]/div[1]/div[2]/ul[1]/li[1]/a[1]/span[1]")
    private WebElement currencyLink;

    @FindBy(xpath = "//ul[@class='dropdown-menu currency']/li")
    private List<WebElement> currencies;

    @FindBy(css = "ul[class='nav topcart pull-left'] a[class='dropdown-toggle']")
    private WebElement itemsLink;

    @FindBy(xpath = "//a[@title='View Cart']")
    private WebElement itemsCart;

    @FindBy(css = ".active.menu_home")
    private WebElement HomeBtn;



    @FindBy(xpath = "//ul[@id='main_menu']/li")
    private List<WebElement> homeDropdown;


    @FindBy(xpath = "//a[text()='  Apparel & accessories']")
    private WebElement apparelAccDropdown;

    //@FindBy (xpath = "//body/div[1]/div[1]/div[1]/section[1]/nav[1]/ul[1]/li[2]/a[1]")
    //private WebElement apparelAccessories;

    @FindBy(xpath = "//li[2]//div[1]//ul[1]//li")
    private List<WebElement> apparelAccessoriesDropdown;

    @FindBy(xpath = "//a[text()='  Makeup']")
    private WebElement makeup;
    @FindBy(xpath = "//body/div[1]/div[1]/div[1]/section[1]/nav[1]/ul[1]/li[3]/div[1]/ul[1]/li")
    private List<WebElement> makeupDropdown;

    @FindBy(xpath = "//a[text()='  Skincare']")
    private WebElement skincare;

    @FindBy(xpath = "//li[4]//div[1]//ul[1]//li")
    private List<WebElement> skincareDropdown;

    @FindBy(xpath = "//a[text()='  Fragrance']")
    private WebElement fragrance;

    @FindBy (xpath = "//li[5]//div[1]//ul[1]//li")
    private List<WebElement> FragranceDropdown;

    @FindBy(xpath = "//a[text()='  Men']")
    private WebElement men;

    @FindBy(xpath = "//li[6]//div[1]//ul[1]//li")
    protected List<WebElement> menDropdown;


    @FindBy(xpath = "//a[text()='  Hair Care']")
    private WebElement haircare;

    @FindBy (xpath = "//li[7]//div[1]//ul[1]//li")
    private List<WebElement> haircareDropdown;

    @FindBy(xpath = "//a[text()='  Books']")
    private WebElement books;

    @FindBy (xpath = "//li[8]//div[1]//ul[1]//li")
    private List<WebElement> booksDropdown;

    @FindBy (css = "a.cart")
    private WebElement addToCart;


    @FindBy (css = "a#cart_checkout1")
    private WebElement checkout;

    @FindBy (id = "checkout_btn")
    private WebElement confirmCheckout;

    @FindBy (css = "a[title='Continue']")
    private WebElement contBtn;

    @FindBy (css = "ul[id='customer_menu_top'] li a")
    private WebElement assertEle;

    //private By waitForLoginPageVisibility =By.id("loginFrm_loginname");



    public void getContBtn() {
        contBtn.click();
    }

    public void setCurrency(String currency) {
        Actions action = new Actions(driver);
        action.moveToElement(currencyLink).build().perform();
        for (int i = 0; i < currencies.size(); i++) {
            //System.out.println(currencies.get(i).getText());
            if (currencies.get(i).getText().trim().equalsIgnoreCase(currency.trim())) {
                currencies.get(i).click();
                break;
            }

        }

    }



    public void setItemsLink() {
        Actions action = new Actions(driver);
        action.moveToElement(itemsLink).perform();
        itemsCart.click();

    }

    public void setHomeDropdown(String menuItem) {
        Actions action = new Actions(driver);
        action.moveToElement(HomeBtn).perform();
        for (int i = 0; i < homeDropdown.size(); i++) {
            //System.out.println(homeDropdown.get(i).getText());
            if (homeDropdown.get(i).getText().trim().contains(menuItem)) {
                homeDropdown.get(i).click();
                break;

            }

        }


        //return true;
    }


    public void ApparelDropdown(String selectTShirt) {
        Actions action = new Actions(driver);
        action.moveToElement(apparelAccDropdown).perform();
        for (int i = 0; i < apparelAccessoriesDropdown.size(); i++) {
            System.out.println(apparelAccessoriesDropdown.get(i).getText());

            if (apparelAccessoriesDropdown.get(i).getText().trim().contains(selectTShirt)) {
                apparelAccessoriesDropdown.get(i).click();
                break;
            }

        }
    }

    public void makeupList(String selectFace) {

        Actions actions = new Actions(driver);
        actions.moveToElement(makeup).perform();
        for (int i = 0; i < makeupDropdown.size(); i++) {
            System.out.println(makeupDropdown.get(i).getText());
            if (makeupDropdown.get(i).getText().trim().contains(selectFace)){
                makeupDropdown.get(i).click();
                break;
            }


        }
    }

    public void SkincareMenu(String selectGift_ideas_sets) {

        Actions action = new Actions(driver);
        action.moveToElement(skincare).perform();
        for (int i = 0; i < skincareDropdown.size(); i++) {
            System.out.println(skincareDropdown.get(i).getText());
            if (skincareDropdown.get(i).getText().trim().contains(selectGift_ideas_sets)){
                skincareDropdown.get(i).click();
                break;
            }
        }
    }

    public void FragranceMenu(String selectWomen){
        Actions action = new Actions(driver);
        action.moveToElement(fragrance).perform();

        for (int i = 0; i < FragranceDropdown.size(); i++){
            System.out.println(FragranceDropdown.get(i).getText());
            if (FragranceDropdown.get(i).getText().trim().contains(selectWomen)){
                FragranceDropdown.get(i).click();
                break;
            }

        }

    }

    public void menMenu (String selectPreShave_shave){

        Actions action = new Actions(driver);
        action.moveToElement(men).perform();

        for (int i=0;i<menDropdown.size(); i++){
            System.out.println(menDropdown.get(i).getText());
            if (menDropdown.get(i).getText().trim().contains(selectPreShave_shave)){
                menDropdown.get(i).click();
                break;
            }
        }
    }

    public void HaircareMenu (String selectShampoo){

        Actions action = new Actions(driver);
        action.moveToElement(haircare).perform();

        for (int i=0;i<haircareDropdown.size(); i++){
            System.out.println(haircareDropdown.get(i).getText());
            if (haircareDropdown.get(i).getText().trim().contains(selectShampoo)){
                haircareDropdown.get(i).click();
                break;
            }
        }
    }

    public BookOrderPage booksMenu (String selectPaperback){

        Actions action = new Actions(driver);
        action.moveToElement(books).perform();

        for (int i=0;i<booksDropdown.size(); i++){
            System.out.println(booksDropdown.get(i).getText());
            if (booksDropdown.get(i).getText().trim().contains(selectPaperback)){
                booksDropdown.get(i).click();
                break;
            }
        }
        return new BookOrderPage(driver);
    }

    public void setAddToCart (){

        addToCart.click();
    }


    public LoginPage setCheckout (){
        checkout.click();
        return new LoginPage(driver);


    }

    public void CheckoutConfirmation (){
        confirmCheckout.click();


    }
    //generic wait for visibilityOf
    public void waitForVisibilityOfEle (WebElement ele) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(ele));

    }
    //generic wait for elementToBeClickable
    public void waitForElementToBeClickable (By findBy) {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(findBy));
    }


    public WebElement setAssertEle (){
        assertEle.getText();

    return assertEle;

    }








}
