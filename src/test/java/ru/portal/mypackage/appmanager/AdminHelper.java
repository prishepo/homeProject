package ru.portal.mypackage.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminHelper extends HelperBase {
    public AdminHelper(WebDriver wd) {
        super(wd);
    }

    public void goToManagePage(){
        wd.findElement(By.linkText("Administration")).click();
    }


}

