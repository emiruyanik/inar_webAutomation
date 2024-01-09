import org.assertj.core.api.Assertions;
import org.assertj.core.data.Percentage;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class RevertAndDraggablePositionTest extends Hook {
    @Test
    public void testRevertAndDraggablePosition() {
        pages.getHomePage().clickOnWebAutomationLink();
        pages.getWebAutomationPage().clickOnDroppableLink();
        pages.getWebAutomationPage().clickRevertDraggable();
        //for web element1
        int initX = pages.getRevertAndDraggablePositionLink().locationXOfWebElement1();
        int initY = pages.getRevertAndDraggablePositionLink().locationYOfWebElement1();
        // after drag and drop
        pages.getRevertAndDraggablePositionLink().dragAndDropWebElement1();
        BrowserUtils.wait(2);
        int finalX = pages.getRevertAndDraggablePositionLink().locationXOfWebElement1();
        int finalY = pages.getRevertAndDraggablePositionLink().locationYOfWebElement1();
        //verify
        assertEquals(finalX, initX);
//        assertEquals(finalY, initY);
        Assertions.assertThat(finalY).isCloseTo(initY, Percentage.withPercentage(1));

        //for web element2

        //for web element1

        // after drag and drop
        pages.getRevertAndDraggablePositionLink().dragAndDropWebElement2();

        int initX1 = pages.getRevertAndDraggablePositionLink().locationXOfWebElement2();
        int initY1 = pages.getRevertAndDraggablePositionLink().locationYOfWebElement2();
        BrowserUtils.wait(2);
        int finalX1 = pages.getRevertAndDraggablePositionLink().locationXOfWebElement2();
        int finalY1 = pages.getRevertAndDraggablePositionLink().locationYOfWebElement2();
        //verify
        assertEquals(finalX1, initX1);
        assertEquals(finalY1, initY1);


    }
}
