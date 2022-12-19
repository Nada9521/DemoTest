package SeleniumTraining;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.awt.*;

public class FaireClicDroit
{
    public static void main(String[] args)
    {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://jqueryui.com/slider/#colorpicker");
        driver.manage().window().maximize();
        //On doit tout d'abord localiser le cadre
        WebElement Frame=driver.findElement(By.cssSelector("iframe.demo-frame"));
        driver.switchTo().frame(Frame);
        WebElement gl=driver.findElement(By.xpath("//span[startswith(@class,'ui-slider-handle ui-')]"));
        Actions Action=new Actions(driver);
        Action.contextClick(gl).perform();


    }

}
