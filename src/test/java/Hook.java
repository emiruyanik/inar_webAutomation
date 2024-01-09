import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Driver;
import utils.Pages;

import java.time.Duration;


public class Hook {
    protected static WebDriver driver;
    Pages pages=new Pages();
    protected WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));


    @BeforeAll
    public static void setUpTestEnvironment() {
        driver = Driver.getDriver();
        driver.get("https://InarAcademy:Fk160621.@test.inar-academy.com");
        String browser = System.getProperty("browser", "chrome");
        if (browser.equalsIgnoreCase("firefox")) {
            driver.navigate().refresh();
        }

    }

    @AfterAll
    public static void tearDown() {
        Driver.closeDriver();
    }
}
