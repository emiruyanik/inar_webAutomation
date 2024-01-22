import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;

public class SpinnerWithLALTest extends Hook {
    @Test
    void testSpinnerWithLAL() {
        pages.getHomePage().clickOnWebAutomationLink();
        BrowserUtils.keyDown();

        pages.getWebAutomationPage().clickOnSpinnerLink();
        BrowserUtils.keyUp();

        pages.getWebAutomationPage().clickOnSpinnerWithLalLink();
        Double initValueOfLatitude = pages.getSpinnerWithLAL().getLatitudeValue();

        pages.getSpinnerWithLAL().clickOnUpArrowOfLatitude(4);
        BrowserUtils.wait(2);
        Assertions.assertThat(initValueOfLatitude).isLessThan(pages.getSpinnerWithLAL().getLatitudeValue());

        Double initValueOfLongitude = pages.getSpinnerWithLAL().getLongitudeValue();
        pages.getSpinnerWithLAL().clickOnDownArrowOfLongitude(5);

        BrowserUtils.wait(2);
        Assertions.assertThat(initValueOfLongitude).isGreaterThan(pages.getSpinnerWithLAL().getLongitudeValue());



    }
}
