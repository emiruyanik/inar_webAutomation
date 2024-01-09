import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.Pages;

public class HandlesTest extends Hook {

    @Test
    public void testForHandlesElements() {
        pages.getHomePage().clickOnWebAutomationLink();
        pages.getWebAutomationPage().clickOnHandlesLink();

        //init values for element1

        int initX = pages.getHandles().xLocationOfFirstElement();
        int initY = pages.getHandles().yLocationOfFirstElement();

        //apply method
        pages.getHandles().clickAndDropForElement1(100, 100);

        //final values for element1
        int finalX = pages.getHandles().xLocationOfFirstElement();
        int finalY = pages.getHandles().yLocationOfFirstElement();

        //assertion
        Assertions.assertThat(initX).isLessThan(finalX);
        Assertions.assertThat(initY).isLessThan(finalY);

        //init values for element2

        int initX1 = pages.getHandles().xLocationOfSecondElement();
        int initY1 = pages.getHandles().yLocationOfSecondElement();

        //apply method
        pages.getHandles().clickAndDropElement2(100, 100);

        //final values for element1
        int finalX1 = pages.getHandles().xLocationOfSecondElement();
        int finalY1 = pages.getHandles().yLocationOfSecondElement();


        //assertion
        Assertions.assertThat(initX1).isLessThan(finalX1);
        Assertions.assertThat(initY1).isLessThan(finalY1);





    }
}
