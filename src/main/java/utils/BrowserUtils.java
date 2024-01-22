package utils;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class BrowserUtils {

    private static Actions actions;

    public static void keyDown() {
        actions = new Actions(Driver.getDriver());
        actions.keyDown(Keys.PAGE_DOWN).keyUp(Keys.PAGE_DOWN).build().perform();
        wait(1);
    }

    public static void keyUp() {
        actions = new Actions(Driver.getDriver());
        actions.keyDown(Keys.PAGE_UP).keyUp(Keys.PAGE_UP).build().perform();
        wait(1);
    }

    public static void wait(int second) {
        try {
            Thread.sleep(second * 1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void wait(double second) {
        try {
            Thread.sleep((long) (second * 1000L));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
