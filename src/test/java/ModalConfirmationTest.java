import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;

public class ModalConfirmationTest extends Hook {
    @Test
    void modalConfirmationTest() {
        pages.getHomePage().clickOnWebAutomationLink();
        BrowserUtils.keyDown();

        pages.getWebAutomationPage().clickOnDialogLink();

        BrowserUtils.keyUp();

        pages.getWebAutomationPage().clickOnModalConfirmationLink();

        int initWidth = pages.getModalConfirmation().getWidthOfContentBar();

        int initHeight = pages.getModalConfirmation().getHeightOfContentBar();


        pages.getModalConfirmation().setResizableIcon(75, 75);
        BrowserUtils.wait(2);

        int finalWidth = pages.getModalConfirmation().getWidthOfContentBar();

        int finalHeight = pages.getModalConfirmation().getHeightOfContentBar();
        System.out.println(finalHeight);

        Assertions.assertTrue(finalHeight > initHeight);
        Assertions.assertTrue(finalWidth > initWidth);


        pages.getModalConfirmation().clickOnCancelButton();
        Assertions.assertFalse(pages.getModalConfirmation().isDialogDisplayed());

        BrowserUtils.wait(2);
    }
}
