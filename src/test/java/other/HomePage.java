package other;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HomePage {

    @Test
    public void login() throws Exception {
        System.setProperty("webdriver.chrome.driver", "/Users/TheBestOrNothing/Downloads/chromedriver 2");
        WebDriver driver = new ChromeDriver();
        String baseUrl = "https://www.seattlecca.org";

        driver.get(baseUrl);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        String title = driver.getTitle();
        System.out.println(title);

        WebElement contactUs = driver.findElement(By.xpath("//a[@title='Contact Us']"));
        contactUs.click();

        Select selectSubjectDropDown = new Select(driver.findElement(By.xpath("//select[@id='edit-field-message-subject']")));
        selectSubjectDropDown.selectByIndex(1);

        WebElement name = driver.findElement(By.xpath("//input[@id='edit-field-your-full-name-0-value']"));
        name.sendKeys("Mary");

        WebElement email = driver.findElement(By.xpath("//input[@id='edit-field-email-address-0-value']"));
        email.sendKeys("123@gmail.com");

        WebElement radioButton = driver.findElement(By.xpath("//input[@id='edit-field-do-you-live-in-the-united-yes']"));
        radioButton.click();

        WebElement SCCATitle = driver.findElement(By.xpath("//header[@id='navbar']/div/a"));
        SCCATitle.click();
        if(driver.getTitle().equals("Welcome to Seattle Cancer Care Alliance | Seattle Cancer Care Alliance")) {
            System.out.println("This is the home page");
        }

        Thread.sleep(5000);

        List<WebElement> list = driver.findElements(By.xpath("//ul[@class='menunav menu-main']//li[@class='hasdrop']"));

        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getText());
        }

        Thread.sleep(5000);

        driver.findElement(By.linkText("NEW PATIENTS")).click();
        Thread.sleep(5000);
        driver.findElement(By.linkText("New Patients")).click();

        Thread.sleep(5000);

        SCCATitle.click();
        contactUs.click();

        Actions builder = new Actions(driver);
//        Action mouseOverTollFree = builder.moveToElement()
    }
}
