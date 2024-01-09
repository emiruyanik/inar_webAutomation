import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class SynchronousResizeTest extends Hook {
    @Test
    void testSynchronousResize() {
        pages.getHomePage().clickOnWebAutomationLink();
        pages.getWebAutomationPage().clickResizableLink();
        pages.getWebAutomationPage().clickSynchronusResize();

        int initHeight1 = pages.getSynchronousResize().heightOfElement1();
        int initWidth1 = pages.getSynchronousResize().widthOfElement1();

        int initHeight2 = pages.getSynchronousResize().heightOfElement3();
        int initWidth2 = pages.getSynchronousResize().widthOfElement3();

        pages.getSynchronousResize().clickHolder(50, 50);

        int finalHeight1 = pages.getSynchronousResize().heightOfElement1();
        int finalWidth1 = pages.getSynchronousResize().widthOfElement1();

        int finalHeight2 = pages.getSynchronousResize().heightOfElement3();
        int finalWidth2 = pages.getSynchronousResize().widthOfElement3();

        Assertions.assertThat(finalHeight1).isGreaterThan(initHeight1);
        Assertions.assertThat(finalHeight2).isGreaterThan(initHeight2);
        Assertions.assertThat(finalWidth1).isGreaterThan(initWidth1);
        Assertions.assertThat(finalWidth2).isGreaterThan(initWidth2);

    }
}
