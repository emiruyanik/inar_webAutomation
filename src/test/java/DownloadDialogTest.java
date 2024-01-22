import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;

public class DownloadDialogTest extends Hook{
    @Test
    void testDownloadDialog(){
        pages.getHomePage().clickOnWebAutomationLink();
        BrowserUtils.keyDown();
        BrowserUtils.wait(1);
        pages.getWebAutomationPage().clickOnProgressBar();
        BrowserUtils.keyUp();
        BrowserUtils.wait(1);
        pages.getWebAutomationPage().clickOnDownloadLink();

        //click on startDownload button
        pages.getDownloadDialog().clickOnStartDownloadButton();
        BrowserUtils.wait(2);

        //verify that cancel button text is visible
        String cancelText=pages.getDownloadDialog().getCancelText();
        Assertions.assertEquals("Cancel Download",cancelText);


    }
}
