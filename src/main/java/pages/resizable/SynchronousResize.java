package pages.resizable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class SynchronousResize extends BasePage {
    @FindBy(id = "resizable-synchr-resize")
    private WebElement element1;
    @FindBy(xpath = "//div[@id='resizable-synchr-resize']/div[3]")
    private WebElement holder1;
    @FindBy(id = "also-synchr-resize")
    private WebElement element3;
    @FindBy(xpath = "//div[@id=' also-synchr-resize']/div[3]")
    private WebElement holder2;

    public SynchronousResize() {
        super();
    }

    public void clickHolder(int xOffset, int yOffset) {
        actions.clickAndHold(holder1).moveByOffset(xOffset, yOffset).release().perform();

    }

    public int widthOfElement1() {
        return element1.getSize().getWidth();
    }

    public int heightOfElement1() {
        return element1.getSize().getHeight();
    }

    public int widthOfElement3() {
        return element3.getSize().getWidth();
    }

    public int heightOfElement3() {
        return element3.getSize().getHeight();
    }
}
