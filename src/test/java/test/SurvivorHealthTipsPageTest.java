package test;

import com.scca.qa.page.SurvivorHealthTipsPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class SurvivorHealthTipsPageTest extends TestBase {

    @Test
    public void testSurvivorHealthTipsHappyPath() {
        SurvivorHealthTipsPage page = new SurvivorHealthTipsPage(driver);
        page.goToPageLocation();
        String actualResult = page.getPageTitle();
        Assert.assertEquals(actualResult, "Survivor health tips", "Found text displays incorrectly");
    }
}
