package other;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Form {

    @Test
    public void practiceForms() {

        System.setProperty("webdriver.chrome.driver", "/Users/TheBestOrNothing/Downloads/chromedriver 2");
        WebDriver driver = new ChromeDriver();

        String baseURL = "http://demo.guru99.com/test/radio.html";

        driver.get(baseURL);
        WebElement element1 = driver.findElement(By.xpath("//input[@id='vfb-7-1']"));
        element1.click();

        WebElement element2 = driver.findElement(By.xpath("//input[@id ='vfb-7-2']"));
        element2.click();

        WebElement checkBox1 = driver.findElement(By.xpath("//input[@id='vfb-6-0']"));

        for(int i = 0; i < 2; i++) {
            checkBox1.click();
            System.out.println(checkBox1.isSelected());
        }

        if(checkBox1.isSelected()) {
            System.out.println("Checkbox is toggled on");
        } else {
            System.out.println("Checkbox is toggled off");
        }

        if(!checkBox1.isSelected()) {
            System.out.println("Checkbox is now toggled off");
        }

        driver.close();
    }

}
