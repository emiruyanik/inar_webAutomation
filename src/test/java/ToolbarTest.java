import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;

public class ToolbarTest extends Hook {
    @Test
    void testToolbar() {
        pages.getHomePage().clickOnWebAutomationLink();
        pages.getWebAutomationPage().clickOnControlGroup();
        pages.getWebAutomationPage().clickOnToolBar();

        pages.getToolBar().selectZoom("125%");
        Assertions.assertTrue(pages.getToolBar().checkZoomRate("125%"));

        pages.getToolBar().selectBackgroundColour("Red");
        Assertions.assertTrue(pages.getToolBar().checkTextColour("red"));

        pages.getToolBar().clickOnItalicButton();
        Assertions.assertTrue(pages.getToolBar().checkIsItalic());

        BrowserUtils.wait(4);
    }
}
