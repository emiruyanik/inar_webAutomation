import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;
import utils.Pages;

public class constrainMovementTest extends Hook {
    SoftAssertions softAssertions = new SoftAssertions();

    @Test
    public void testMovementOfDraggableElements() {
        pages.getHomePage().clickOnWebAutomationLink();
        pages.getWebAutomationPage().clickOnDraggableLink();
        pages.getWebAutomationPage().clickOnConstrainMovementLink();

        //init values without dragging

        int initX = pages.getConstrainMovement().firstElementOFLocationX();
        int initY = pages.getConstrainMovement().firstElementOFLocationY();

        //draggable function is applied
        pages.getConstrainMovement().clickAndDragFirstElement(100, 100);

        //final values
        int finalX = pages.getConstrainMovement().firstElementOFLocationX();
        int finalY = pages.getConstrainMovement().firstElementOFLocationY();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //verify
        softAssertions.assertThat(initX).isEqualTo(finalX);
        softAssertions.assertThat(initY).isLessThan(finalY);


    }
}
