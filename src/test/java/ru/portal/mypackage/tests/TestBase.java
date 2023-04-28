package ru.portal.mypackage.tests;

import org.openqa.selenium.remote.Browser;
import org.testng.ITestContext;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import ru.portal.mypackage.appmanager.ApplicationManager;

public class TestBase {


    protected static final ApplicationManager app
            = new ApplicationManager(System.getProperty("browser", Browser.FIREFOX.browserName()));

    @BeforeSuite
    public void setUp(ITestContext context) throws Exception {
        app.init();
        context.setAttribute("app", app);

    }


    @AfterSuite(alwaysRun = true)
    public void tearDown() throws Exception {
        app.stop();
    }


    }


   /* @BeforeMethod (enabled = false)
        public void logTestStart(Method m, Object[] p) {
        logger.info("Start test" + m.getName() + " with parameters " + Arrays.asList(p));

    }

    @AfterMethod (enabled = false)
        public void logTestStop(Method m, Object[] p) {
        logger.info("Stop test" + m.getName()+ " with parameters " + Arrays.asList(p));

    }
*/
