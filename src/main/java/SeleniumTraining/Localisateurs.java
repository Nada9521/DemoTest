package SeleniumTraining;
import org.openqa.selenium.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Localisateurs
{
    public static void main(String[] args)
    {
       WebDriverManager.chromedriver().setup();
       ChromeDriver driver = new ChromeDriver();

        driver.get("https://form.jotform.com/222122888983365?domain=thedemosite.co.uk");
        driver.manage().window().maximize();

        //By id
        driver.findElement(By.id("input_28")).sendKeys("test1");

        //By name
        driver.findElement(By.name("q29_lastName")).sendKeys(("test2"));

        //By TagName
        driver.navigate().to("https://phptravels.com/demo/");
        driver.findElement(By.tagName("input")).sendKeys("test3");

        //By className
        driver.navigate().to("https://www.saucedemo.com/");
        driver.findElement((By.className("form_input"))).sendKeys("test4");

        //By LinkText
        driver.navigate().to("https://www.selenium.dev/documentation/overview/");
        driver.findElement(By.linkText("Components")).click();

        // By partiallinktext
        driver.navigate().to("https://www.selenium.dev/documentation/webdriver");
        driver.findElement(By.partialLinkText("Getting")).click();

        //Relative locator
        driver.navigate().to("https://phptravels.com/demo/");
        WebElement email=driver.findElement(By.name("email"));
        By Bussinesslocator= RelativeLocator.with(By.tagName("input")).above(By.xpath("//input[@name='email']"));
        driver.findElement(Bussinesslocator).sendKeys("testing");
        email.sendKeys("test@info.fr");

    }
}
