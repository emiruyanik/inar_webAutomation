import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;

public class SnapToIncrementsTest extends Hook {
    @Test
    void testIncrements() {
        pages.getHomePage().clickOnWebAutomationLink();
        BrowserUtils.keyDown();

        pages.getWebAutomationPage().clickOnSliderLink();
        pages.getWebAutomationPage().clickOnSnapToIncrementsLink();

        BrowserUtils.keyUp();
        int initValue = pages.getSnapToIncrements().getAmount();

        pages.getSnapToIncrements().moveSliderElement(550, 0);
        int finalValue1 = pages.getSnapToIncrements().getAmount();

        BrowserUtils.wait(2);

        Assertions.assertThat(finalValue1).isGreaterThan(initValue);

        pages.getSnapToIncrements().moveSliderElement(-200, 0);
        int finalValue2 = pages.getSnapToIncrements().getAmount();

        BrowserUtils.wait(2);

        Assertions.assertThat(finalValue1).isGreaterThan(finalValue2);

    }
}
