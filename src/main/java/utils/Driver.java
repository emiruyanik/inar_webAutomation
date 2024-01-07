package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Driver {
    private static final ThreadLocal<WebDriver> DRIVER_THREAD_LOCAL = new ThreadLocal<>();

    private Driver() {
        throw new UnsupportedOperationException();
    }

    public static synchronized WebDriver getDriver() {
        String browser = System.getProperty("browser", "chrome");
        WebDriver driver;
        if (DRIVER_THREAD_LOCAL.get() == null) {
            switch (browser.toLowerCase()) {
                case "edge" -> {
                    EdgeOptions edgeOptions = new EdgeOptions();
                    edgeOptions.addArguments("--start-maximized");
                    driver = new EdgeDriver(edgeOptions);
                }
                case "firefox" -> {
                    FirefoxOptions firefoxOptions = new FirefoxOptions();
                    firefoxOptions.addArguments("--width-1920");
                    firefoxOptions.addArguments("--height-1080");
                    driver = new FirefoxDriver(firefoxOptions);
                }
                default -> {
                    ChromeOptions chromeOptions = new ChromeOptions();
                    chromeOptions.addArguments("--start-maximized");
                    driver = new ChromeDriver(chromeOptions);
                }
            }
            DRIVER_THREAD_LOCAL.set(driver);
        }
        return DRIVER_THREAD_LOCAL.get();
    }

    public static synchronized void closeDriver() {
        WebDriver driver = Driver.getDriver();
        if (driver != null) {
            driver.quit();
        }
        DRIVER_THREAD_LOCAL.remove();
    }
}
