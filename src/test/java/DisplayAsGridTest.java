import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;
import utils.BrowserUtils;

public class DisplayAsGridTest extends Hook {
    @Test
    public void testDisplayAsGrid() throws InterruptedException {
        pages.getHomePage().clickOnWebAutomationLink();
        pages.getWebAutomationPage().clickOnSortableLink();

        pages.getWebAutomationPage().clickOnSortableLink();
        pages.getWebAutomationPage().clickOnDisplayAsGridLink();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scroll(0,150)");
        BrowserUtils.wait(1);


        String init1 = pages.getDisplayAsGrid().getText(1);

        pages.getDisplayAsGrid().dragAndDropElement(1, 6);

        String final1 = pages.getDisplayAsGrid().getText(6);


        Assertions.assertThat(init1).isEqualTo(final1);


       
    }

}
