package Fast_Class_Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrouserOpen {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://mail.google.com");
        Thread.sleep(2500);
        driver.quit();

    }
}

