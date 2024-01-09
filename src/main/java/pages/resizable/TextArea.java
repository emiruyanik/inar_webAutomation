package pages.resizable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class TextArea extends BasePage {
    @FindBy(id = "resizable-text-area-res")
    private WebElement textArea;
    @FindBy(xpath = "//div[@class='ui-wrapper']/div[3]")
    private WebElement holder;

    public TextArea() {
        super();
    }

    public int getWidthOfTextArea() {
        return textArea.getSize().getWidth();
    }

    public int getHeightOfTextArea() {
        return textArea.getSize().getHeight();
    }

    public void clickAndExtendHolder(int xOffset, int yOffset) {
        actions.clickAndHold(holder).moveByOffset(xOffset, yOffset).release().perform();
    }
}
