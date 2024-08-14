package org.TestCases;

import org.PageObjects.OrderPage;
import org.TestComponents.BaseTest;
import org.testng.annotations.Test;

public class OrderTest extends BaseTest {

    @Test
    public void OrderTest(){
        OrderPage orderPage = new OrderPage(driver);
        orderPage.getProduct();
        //orderPage.getFragranceSize();
        //orderPage.setAddToCart();
    }


}
