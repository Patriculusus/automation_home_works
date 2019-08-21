package home_work_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Phones {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\TestFreamework\\Home\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://rozetka.com.ua/mobile-phones/c80003/preset=smartfon;sort=popularity/");
        Thread.sleep(5000);
        List<WebElement> phones = driver.findElements(By.xpath(".//div[@class=\"g-i-tile g-i-tile-catalog\" and .//i[@class = 'g-tag-icon-small-popularity g-tag-i sprite']] "));

        System.out.println(phones.size());
        System.out.println("Name of phones:");
        int counter = 0;
        for (WebElement e : phones) {
            System.out.println(e.findElement(By.xpath(".//div[@class = 'g-i-tile-i-title clearfix']/a")).getText());
            counter++;
            if (counter == 3) break;
        }
    }
}
