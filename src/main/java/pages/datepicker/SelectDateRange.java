package pages.datepicker;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import pages.BasePage;

import java.util.List;

public class SelectDateRange extends BasePage {
    @FindBy(id = "from-selectDateRange")
    private WebElement fromSelectDateRange;
    @FindBy(id = "to-selectDateRange")
    private WebElement toSelectDateRange;
    @FindBy(css = "select.ui-datepicker-month")
    private WebElement monthSelector;
    @FindBy(css = " (//tbody)[4]/tr/td")
    private List<WebElement> daySelector;




    public SelectDateRange() {
        super();
    }

    public void fromSelectDate(String date1) {
        fromSelectDateRange.sendKeys(date1);
    }

    public void toSelectDate(String date2) {
        toSelectDateRange.sendKeys(date2);
    }

    public String getTextFromSelectDate() {
        return fromSelectDateRange.getAttribute("name");
    }

    public String getTextToSelectDate() {
        return toSelectDateRange.getAttribute("name");
    }

    public void selectMonth(String month) {
        Select select = new Select(monthSelector);
        select.selectByValue(month);
    }

}
