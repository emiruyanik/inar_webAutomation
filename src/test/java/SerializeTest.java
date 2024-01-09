import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import utils.BrowserUtils;

import java.security.Key;

public class SerializeTest extends Hook {
    @Test
    void testSerialize() throws InterruptedException {
        pages.getHomePage().clickOnWebAutomationLink();
        pages.getWebAutomationPage().clickSelectable();
        pages.getWebAutomationPage().clickSerialize();

        //click only one element
        pages.getSerialize().clickOnlyOneElement(1);
        Assertions.assertEquals("You've selected: #1.", pages.getSerialize().getInformation());
        BrowserUtils.wait(1);
        //click ome more than with ctrl key
        BrowserUtils.keyDown();
        BrowserUtils.wait(2);

        pages.getSerialize().clickWithCtrlKeyAndSelectMoreThanOne(3, 5, 6);
        Assertions.assertEquals("You've selected: #1 #3 #5 #6.", pages.getSerialize().getInformation());

        BrowserUtils.keyUp();
        BrowserUtils.wait(2);

        //click one more than using mouse
        pages.getSerialize().selectPressingMouseAndSelectMoreThanOne(2, 5);
        BrowserUtils.wait(2);
        Assertions.assertEquals("You've selected: #2 #3 #4 #5.", pages.getSerialize().getInformation());


    }
}
