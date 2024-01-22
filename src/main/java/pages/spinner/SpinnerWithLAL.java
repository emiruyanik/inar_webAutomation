package pages.spinner;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import utils.BrowserUtils;

public class SpinnerWithLAL extends BasePage {
    @FindBy(xpath = "(//input[@id='lat-spinner-w-map']/../a/span)[1]")
    private WebElement upArrowOfLatitude;
    @FindBy(xpath = "(//input[@id='lat-spinner-w-map']/../a)[2]/span[1]")
    private WebElement downArrowOfLatitude;
    @FindBy(xpath = "(//input[@id='lng-spinner-w-map']/../a/span)[1]")
    private WebElement upArrowOfLongitude;
    @FindBy(xpath = "(//input[@id='lng-spinner-w-map']/../a)[2]/span[1]")
    private WebElement downArrowOfLongitude;
    @FindBy(id = "lat-spinner-w-map")
    private WebElement latitudeInput;
    @FindBy(id = "lng-spinner-w-map")
    private WebElement longitudeInput;

    public void clickOnUpArrowOfLatitude(int second) {
        actions.clickAndHold(upArrowOfLatitude).perform();
        BrowserUtils.wait(second);
        actions.release().build().perform();
    }

    public void clickOnDownArrowOfLatitude(int second) {
        actions.clickAndHold(downArrowOfLatitude).perform();
        BrowserUtils.wait(second);
        actions.release().build().perform();
    }

    public void clickOnUpArrowOfLongitude(int second) {
        actions.clickAndHold(upArrowOfLongitude).perform();
        BrowserUtils.wait(second);
        actions.release().build().perform();
    }

    public void clickOnDownArrowOfLongitude(int second) {
        actions.clickAndHold(downArrowOfLongitude).perform();
        BrowserUtils.wait(second);
        actions.release().build().perform();
    }

    public void clickOnUpArrowOfLatitude() {
        upArrowOfLatitude.click();
    }

    public void clickOnDownArrowOfLatitude() {
        downArrowOfLatitude.click();
    }

    public void clickOnUpArrowOfLongitude() {
        upArrowOfLongitude.click();
    }

    public void clickOnDownArrowOfLongitude() {
        downArrowOfLongitude.click();
    }

    public Double getLatitudeValue() {
        return Double.parseDouble(latitudeInput.getAttribute("value"));
    }

    public Double getLongitudeValue() {
        return Double.parseDouble(longitudeInput.getAttribute("value"));
    }


}
