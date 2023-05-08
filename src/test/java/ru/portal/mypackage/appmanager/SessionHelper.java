package ru.portal.mypackage.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class SessionHelper extends HelperBase{
    public SessionHelper(WebDriver wd) {
        super(wd);
    }

    public void logout() {
        wd.findElement(By.linkText("Logout")).click();
    }

    public void login(String username, String password) {
        WebElement dynamicElement = (new WebDriverWait(wd, Duration.ofSeconds(10)))
                .until(ExpectedConditions.presenceOfElementLocated(By.className("card__title")));
        click(By.cssSelector("button.button._3TAJA"));
        type(By.name("username"),username);
        type(By.name("password"),password);
        click(By.id("kc-login"));
    }
}
