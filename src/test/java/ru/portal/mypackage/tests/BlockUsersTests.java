package ru.portal.mypackage.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.portal.mypackage.appmanager.AdminHelper;

import java.time.Duration;

public class BlockUsersTests extends TestBase{

    @BeforeMethod
    public void waitBeforeTest(){
        app.wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Test
    public void testStudentBlock() {
        app.admin().goToManagePage();

    }
}
