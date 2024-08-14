package org.TestComponents;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class TakeScreenShot {

    public TakeScreenShot(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    WebDriver driver;

@Test
public void TakingScreenShots() throws IOException {
    File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(src,new File("C:\\prints\\screenshot.png"));


}

}
