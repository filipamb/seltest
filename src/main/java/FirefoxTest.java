import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

/**
 * Created by filip on 05.04.17.
 */
public class FirefoxTest {

    public static void main(String[] args) throws InterruptedException {
        // Create HTML Unit Driver - this is the build in Selenium client
        System.setProperty("webdriver.gecko.driver","/home/filip/SeleniumGecko/geckodriver");

        WebDriver driver = new FirefoxDriver();
        // go to url
        driver.get("https://online.t-mobilebankowe.pl/ib/login.html");
        // Check the title of the page
        System.out.println("Page title is: " + driver.getTitle());
        WebElement loginTextBox = driver.findElement(By.id("LoginID"));
        // create an action handler
        Actions actions = new Actions(driver);
        actions.moveToElement(loginTextBox).perform();
        loginTextBox.sendKeys("xxxxx");

        Thread.sleep(2000);

        WebElement submitButton = driver.findElement(By.id("buttonFocusElement"));
        actions.moveToElement(submitButton).perform();
        actions.click().perform();

        Thread.sleep(5000);
        System.out.println("Looking for password");

        List<WebElement> elements = driver.findElements(By.cssSelector("input"));

        for(WebElement element:elements){
            System.out.println(element.getAttribute("id"));
        }

        Thread.sleep(5000);
        driver.quit();
    }
}
