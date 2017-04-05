import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class ConsoleTest {

    public static void main(String[] args) throws InterruptedException {
        // Create HTML Unit Driver - this is the build in Selenium client
        HtmlUnitDriver driver = new HtmlUnitDriver();
        driver.setJavascriptEnabled(true);
        // go to url
        driver.get("https://online.t-mobilebankowe.pl/ib/login.html");
        // Check the title of the page
        System.out.println("Page title is: " + driver.getTitle());
        String pageSource = driver.getPageSource();
        System.out.println(pageSource);
        driver.findElementById("LoginID");
        Thread.sleep(5000);
        driver.quit();
    }
}
