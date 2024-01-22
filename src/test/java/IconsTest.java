import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;
import utils.BrowserUtils;

public class IconsTest extends Hook{
    @Test
    void testIcons(){
        pages.getHomePage().clickOnWebAutomationLink();
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scroll(0,300)");
        BrowserUtils.wait(1);
        pages.getWebAutomationPage().clickOnMenuLink();
        pages.getWebAutomationPage().clickOnIcons();
        BrowserUtils.wait(1);
        Assertions.assertTrue(pages.getIcons().isClickable("Zoom Out"));

    }
}
