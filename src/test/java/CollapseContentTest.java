import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;

public class CollapseContentTest extends Hook{
    @Test
    void testCollapseContent(){
        pages.getHomePage().clickOnWebAutomationLink();

        pages.getWebAutomationPage().clickOnAccordionLink();
        pages.getWebAutomationPage().clickOnCollapseContent();

        pages.getCollapseContent().clickOnElement(2);
        BrowserUtils.wait(2);
        Assertions.assertTrue(pages.getCollapseContent().isClicked(2));

        pages.getCollapseContent().clickOnElement(1);
        BrowserUtils.wait(2);
        Assertions.assertTrue(pages.getCollapseContent().isClicked(1));

        pages.getCollapseContent().clickOnElement(0);
        BrowserUtils.wait(2);
        Assertions.assertTrue(pages.getCollapseContent().isClicked(0));
    }
}
