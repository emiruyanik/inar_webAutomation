import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import utils.Driver;
import utils.Pages;


public class Hook {
    protected static WebDriver driver;
    Pages pages=new Pages();

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
