import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

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
        // find the search button on the page
        WebElement searchField = driver.findElement(By
                .id("LoginID"));
        // create an action handler
        Actions actions = new Actions(driver);
        // use the action handler to move the cursor to given element
        actions.moveToElement(searchField).perform();
        searchField.sendKeys("java");
        searchField.submit();

        Thread.sleep(5000);
        driver.quit();
    }
}
