package org.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.Driver;
import java.time.Duration;
import java.util.ArrayList;
import java.util.stream.Stream;

public class javaStreamsCodes {

    WebDriver driver;
    @Test
    public void ArrayMama() {
        ArrayList<String> countries = new ArrayList<String>();
        countries.add("Nigeria");
        countries.add("England");
        countries.add("United State");
        countries.add("Canada");

        Long c = countries.stream().filter(s->s.startsWith("E")).count();
        System.out.println(c);

        Long d= Stream.of("Nigeria,England,United State,Canada").filter(s ->{
            s.startsWith("A");
            return true;
        }).count();
        System.out.println(d);


    }







}
