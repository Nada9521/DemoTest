package SeleniumTraining;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class GestionFenetreAuthentification
{
    public static void main(String[] args)
    {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        String username = "admin";
        String password = "admin";
        driver.get("https://"+username+":"+password+"@the-internet.herokuapp.com/basic_auth");
        driver.manage().window().maximize();
    }
}
