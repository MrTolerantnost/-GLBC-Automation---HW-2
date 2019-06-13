
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","C:\\Users\\ASUS\\IdeaProjects\\HW#2_Kutashenko\\Drivers\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.anotepad.com"); // Navigate to anotepad.com

        driver.findElement(By.name("notetitle")).sendKeys("My Firs Note"); //Find and fill in "NoteTitleField".
        driver.findElement(By.id("btnSaveNote")).click(); // click "Save" button.
        driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/form/div[2]/div/span[3]/strong/a"));// Ensure that this element is present
        driver.findElement(By.xpath("/html/body/div[2]/div/p[1]")).click(); //Click on delete button
        driver.findElement(By.className("delete")).click(); //Click on "Delete" button
        driver.switchTo().alert().accept(); // accept an alert
        driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div[2]/div[2]/div[2]/div[2]/ul/div"));// Ensure that this element is present




        driver.quit(); // as expected ))

    }

}
