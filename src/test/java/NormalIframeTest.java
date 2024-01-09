import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;

public class NormalIframeTest extends Hook {
    @Test
    void normalIframeTest() {
        pages.getHomePage().clickOnWebAutomationLink();

        BrowserUtils.keyDown();
        BrowserUtils.wait(1);

        pages.getWebAutomationPage().clickIframe();

        BrowserUtils.keyUp();
        BrowserUtils.wait(1);

        pages.getWebAutomationPage().clickNormalIframeLink();


        pages.getNormalIframe().passToNormalIframe();
        String actual = pages.getNormalIframe().getTextTitle();
        System.out.println(actual);

        Assertions.assertEquals("Inar academy", actual);
    }
}
