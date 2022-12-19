package SeleniumTraining;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectionMenuDéroulant
{
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.tunisianet.com.tn/");
        driver.manage().window().maximize();
        WebElement Id=driver.findElement(By.id("search_category"));
        Select select=new Select(Id);
        select.selectByIndex(5);
        Thread.sleep(4000);
        select.selectByValue("727");
        Thread.sleep(4000);
        select.selectByVisibleText("------Sécurité");
        Thread.sleep(4000);


    }
}
