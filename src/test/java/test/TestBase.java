package test;

import com.scca.qa.util.DriverUtil;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class TestBase {

    protected WebDriver driver;

    @BeforeClass
    public void setUp() {
       driver = DriverUtil.setUpDriver("chrome");
       String baseUrl = "https://www.seattlecca.org/";
       driver.get(baseUrl);
       driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @AfterClass
    public void tearDown() {
        DriverUtil.closeDriver(driver);
    }

}
