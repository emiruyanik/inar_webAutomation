import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;

public class ShowAlertTest extends Hook {
    @Test
    void testShowAlert() throws InterruptedException {
        pages.getHomePage().clickOnWebAutomationLink();
        BrowserUtils.keyDown();
        BrowserUtils.wait(1);

        pages.getWebAutomationPage().clickOnAlertsLink();

        BrowserUtils.keyUp();
        BrowserUtils.wait(1);

        pages.getShowAlert().clickOnShowAlertButton();

        String actual = pages.getShowAlert().getAlertText();
        BrowserUtils.wait(2);
        System.out.println(actual);
        Assertions.assertEquals("This is an alert!",actual,"This is wrong popup");

        pages.getShowAlert().clickOnConfirm();

    }
}
