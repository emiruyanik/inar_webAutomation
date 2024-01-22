import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;

public class SelectDateRangeTest extends Hook{
    @Test
    void testSelectDateRange(){
        pages.getHomePage().clickOnWebAutomationLink();

        pages.getWebAutomationPage().clickOnDatePickerLink();

        pages.getWebAutomationPage().clickOnSelectDateRangeLink();

        pages.getSelectDateRange().fromSelectDate("02/06/2024");

        Assertions.assertEquals("02/06/2024",pages.getSelectDateRange().getTextFromSelectDate());

        pages.getSelectDateRange().fromSelectDate("03/20/2024");

        Assertions.assertEquals("03/20/2024",pages.getSelectDateRange().getTextFromSelectDate());

        BrowserUtils.wait(3);
    }
}
