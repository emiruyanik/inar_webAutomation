import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;

public class ShowConfirmTest extends Hook {
    @Test
    public void testShowConfirm() throws InterruptedException {
        pages.getHomePage().clickOnWebAutomationLink();

        BrowserUtils.keyDown();
        BrowserUtils.wait(1);

        pages.getWebAutomationPage().clickOnAlertsLink();

        BrowserUtils.keyUp();
        BrowserUtils.wait(1);

        pages.getShowConfirm().clickOnShowConfirm();

        BrowserUtils.wait(2);

        String actual = pages.getShowConfirm().getTextFromAlert();
        Assertions.assertEquals("Are you sure?", actual, "Wrong alert text");

        pages.getShowConfirm().clickAccept();


        pages.getShowConfirm().clickAccept();
        BrowserUtils.wait(2);
    }
}
