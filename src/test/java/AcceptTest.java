import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AcceptTest extends Hook{
    @Test
    public void acceptTest() throws InterruptedException {
        pages.getHomePage().clickOnWebAutomationLink();
        pages.getWebAutomationPage().clickOnDroppableLink();
        pages.getWebAutomationPage().clickOnAcceptLink();

        //click and drop web element1
        pages.getAcceptLink().dragAndDropElement1();
        //verify
        String absoluteClass=pages.getAcceptLink().getClassAttributeOfWebElement3();
        assertFalse(absoluteClass.contains("ui-state-highlight"),"We shouldn't have dropped in this element");
        //web element2

        pages.getAcceptLink().dragAndDropElement2();

        absoluteClass=pages.getAcceptLink().getClassAttributeOfWebElement3();
        assertTrue(absoluteClass.contains("ui-state-highlight"),"We should have dropped in there");


    }
}
