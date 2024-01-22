package pages.slider;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class SnapToIncrements extends BasePage {
    @FindBy(css = "#slider-snap-to-increments>span")
    private WebElement slider;
    @FindBy(id = "#amount-snap-to-increments")
    private WebElement amountText;

    public void moveSliderElement(int xOffset, int yOffset) {
        actions.clickAndHold(slider).moveByOffset(xOffset, yOffset).release().build().perform();
    }

    public String getPaymentText() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        return (String) js.executeScript("return document.querySelector('#amount-snap-to-increments').value;");

    }

    public int getAmount() {
        return Integer.parseInt(getPaymentText().substring(1));
    }

}
