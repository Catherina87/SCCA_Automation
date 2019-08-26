package other;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ClickOnImage {

    @Test
    public void clickingOnVKImage() {
        System.setProperty("webdriver.chrome.driver", "/Users/TheBestOrNothing/Downloads/chromedriver 2");
        WebDriver driver = new ChromeDriver();

        String baseUrl = "https://www.facebook.com/";
        driver.get(baseUrl);
        WebElement forgotAccount = driver.findElement(By.xpath("//a[contains(text(), 'Forgot account?')]"));
        forgotAccount.click();

        WebElement facebookImage = driver.findElement(By.xpath("//a[@title='Go to Facebook Home']"));
        facebookImage.click();

        if(driver.getTitle().equals("Facebook - Log In or Sign Up")) {
            System.out.println("We are back at FB home page");
        } else {
            System.out.println("We are somewhere else");
        }

        driver.close();
    }
}
