import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;
import utils.BrowserUtils;

public class ProductSelectorTest extends Hook {
    @Test
    void testProductSelector() throws InterruptedException {
        pages.getHomePage().clickOnWebAutomationLink();
        pages.getWebAutomationPage().clickOnCheckBoxRadio();
        pages.getWebAutomationPage().clickOnDProductSelector();

        String initStyle = pages.getProductSelector().getClassAttributeOfShape();

        pages.getProductSelector().selectBrand(3);
        pages.getProductSelector().selectShape(2);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scroll(0,300)");
        BrowserUtils.wait(1);
        pages.getProductSelector().selectToggle(1, 2, 3);

        BrowserUtils.wait(2);

        String finalStyle = pages.getProductSelector().getClassAttributeOfShape();

        Assertions.assertNotEquals(initStyle, finalStyle);


    }
}
