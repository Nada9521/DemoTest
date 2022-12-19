package SeleniumTraining;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

import static java.lang.Thread.sleep;

public class ListeDeroulanteSuggestionAutomatique {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.traveltodo.com/");
        driver.manage().window().maximize();
        WebElement element=driver.findElement(By.xpath("//label[text()=' Votre Destination ']"));
        //Effectuer un survol de souris
        Actions action=new Actions(driver);
        action.moveToElement(element).perform();
        element.click(); WebElement from= driver.findElement(By.xpath("//input[@id='locality']"));
        Thread.sleep(2000);
        from.sendKeys("t");
        Thread.sleep(2000);
        //Placer la souris vers le bas
        from.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(2000);
        from.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(2000);
        from.sendKeys(Keys.ENTER);
        Thread.sleep(2000);


    }
}
