package ru.portal.mypackage.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.lang.model.element.Element;
import java.time.Duration;

import static org.testng.Assert.*;

public class LoginTests extends TestBase{

    @BeforeMethod
    public void waitBeforeTest(){
        app.wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Test
    public void testStudentLogin() throws InterruptedException {

        app.wd.findElement(By.cssSelector("button.button._3TAJA")).click();

        app.wd.findElement(By.id("username")).sendKeys("deadjust5@mail.ru");
        app.wd.findElement(By.id("password")).sendKeys("123qweasd");
        app.wd.findElement(By.id("kc-login")).click();
        Assert.assertTrue(app.wd.findElement(By.xpath("//span[contains(text(),'Степан')]")).isDisplayed());





    }


}
