package class02;

import net.bytebuddy.description.type.TypeDescription;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeworkHRMOrange {
    public static void main(String[] args) throws InterruptedException {

      WebDriver driver= new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
      Thread.sleep(3000);
        WebElement username= driver.findElement(By.name("username"));
        username.sendKeys("abc");
        username.clear();
        username.sendKeys("Admin");
        WebElement pass= driver.findElement(By.name("password"));
        pass.sendKeys("admin123");
        WebElement login= driver.findElement(By.tagName("button"));
        String text= login.getText();
        System.out.println(text);
        login.click();
        driver.quit();







    }
}
