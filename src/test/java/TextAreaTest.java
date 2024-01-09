
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class TextAreaTest extends Hook {
    @Test
    void testTexArea() {
        pages.getHomePage().clickOnWebAutomationLink();
        pages.getWebAutomationPage().clickResizableLink();
        pages.getWebAutomationPage().clickTestArea();

        int initWidth = pages.getTextArea().getWidthOfTextArea();
        int initHeight = pages.getTextArea().getHeightOfTextArea();

        pages.getTextArea().clickAndExtendHolder(100, 100);

        int finalWidth = pages.getTextArea().getWidthOfTextArea();
        int finalHeight = pages.getTextArea().getHeightOfTextArea();


        Assertions.assertThat(finalWidth).isGreaterThan(initWidth);
        Assertions.assertThat(finalHeight).isGreaterThan(initHeight);
    }
}
