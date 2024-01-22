import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;

public class ShowPromptTest extends Hook {
    @Test
    void testShowPrompt() {
        pages.getHomePage().clickOnWebAutomationLink();

        //page down
        BrowserUtils.keyDown();

        //click on alert link
        pages.getWebAutomationPage().clickOnAlertsLink();

        //page up
        BrowserUtils.keyUp();

        //click on show prompt
        pages.getAlerts().clickOnShowPrompt();

        //send keys
        pages.getShowPrompt().sendKeys("emir");

        //click accept
        pages.getShowPrompt().acceptButton();

        //verify test

        String actual = "Hello, emir!";
        String expected = pages.getShowPrompt().getTextInAlert();
        Assertions.assertEquals(actual, expected, "text is not expected");
        BrowserUtils.wait(3);

        //click on accept
        pages.getShowPrompt().acceptButton();

        BrowserUtils.wait(2);


    }
}
