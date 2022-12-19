package SeleniumTraining;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GestionNavigateur {

    //public static String browser = "chrome";
   // public static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("test");
        driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-devtools-v106/4.5.3");
        Thread.sleep(2000);
        driver.navigate().to("https://www.traveltodo.com/");
        Thread.sleep(2000);
        driver.close();
        /*if (browser.equals("Firefox"))
       { WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver(); }
        else if (browser.equals("chrome"))
        { WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(); }
        else if (browser.equals("Edge"))
        { WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver(); }
        //Get

         */
        //driver.get("https://www.google.com/");
        }
    }


