import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;

public class ConstrainMovementTest extends Hook {
    SoftAssertions softAssertions = new SoftAssertions();

    @Test
    public void testMovementOfDraggableElements() throws InterruptedException {
        pages.getHomePage().clickOnWebAutomationLink();
        pages.getWebAutomationPage().clickOnDraggableLink();
        pages.getWebAutomationPage().clickOnConstrainMovementLink();

        //init values for element1 without dragging

        int initX1 = pages.getConstrainMovement().firstElementOFLocationX();
        int initY1 = pages.getConstrainMovement().firstElementOFLocationY();

        //draggable function is applied
        pages.getConstrainMovement().clickAndDragFirstElement(100, 100);

        //final values for first element
        int finalX1 = pages.getConstrainMovement().firstElementOFLocationX();
        int finalY1 = pages.getConstrainMovement().firstElementOFLocationY();


        //verify
        softAssertions.assertThat(initX1).isEqualTo(finalX1);
        softAssertions.assertThat(initY1).isLessThan(finalY1);

        //init values for element2 without dragging

        int initX2 = pages.getConstrainMovement().secondElementOFLocationX();
        int initY2 = pages.getConstrainMovement().secondElementOFLocationY();

        //draggable function is applied
        pages.getConstrainMovement().clickAndDragSecondElement(100, 100);

        //final values for second element
        int finalX2 = pages.getConstrainMovement().secondElementOFLocationX();
        int finalY2 = pages.getConstrainMovement().secondElementOFLocationY();

        //verify for second element
        softAssertions.assertThat(finalX2).isGreaterThan(initX2);
        softAssertions.assertThat(finalY2).isEqualTo(initY2);

        //init values for element3 without dragging

        int initX3 = pages.getConstrainMovement().thirdElementOFLocationX();
        int initY3 = pages.getConstrainMovement().thirdElementOFLocationY();

        //draggable function is applied
        pages.getConstrainMovement().clickAndDragThirdElement(15, 15);

        //final values for second element
        int finalX3 = pages.getConstrainMovement().thirdElementOFLocationX();
        int finalY3 = pages.getConstrainMovement().thirdElementOFLocationY();

        //verify for third element

        softAssertions.assertThat(finalX3).isGreaterThan(initX3);
        softAssertions.assertThat(finalY3).isGreaterThan(initY3);

        //init values for fourth element

        int initX4 = pages.getConstrainMovement().fourthElementOfLocationX();
        int initY4 = pages.getConstrainMovement().fourthElementOfLocationY();

        //draggable function is applied
        pages.getConstrainMovement().clickAndDragThirdElement(10, 10);

        //final values for second element
        int finalX4 = pages.getConstrainMovement().fourthElementOfLocationX();
        int finalY4 = pages.getConstrainMovement().fourthElementOfLocationY();

        Thread.sleep(5000);

        //verify for third element

        softAssertions.assertThat(finalX4).isGreaterThan(initX4);
        softAssertions.assertThat(finalY4).isGreaterThan(initY4);

    }
}
