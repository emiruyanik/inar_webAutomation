package pages.controlgroup;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import pages.BasePage;

import java.util.List;

public class ToolBar extends BasePage {
    @FindBy(css = ".form-select.me-2")
    private List<WebElement> dropdownTabs;
    @FindBy(xpath = "//button[text()='B']")
    private WebElement boldButton;
    @FindBy(xpath = "//button[text()='I']")
    private WebElement italicButton;
    @FindBy(xpath = "//button[text()='U']")
    private WebElement underLineButton;

    @FindBy(css = "#page")
    private WebElement textArea;

    public ToolBar() {
        super();
    }

    public void selectZoom(String zoomRate) {
        Select select = new Select(dropdownTabs.get(0));
        select.selectByVisibleText(zoomRate);
    }

    public void selectBackgroundColour(String backgroundColour) {
        Select select = new Select(dropdownTabs.get(1));
        select.selectByVisibleText(backgroundColour);
    }

    public void selectTextColour(String textColour) {
        Select select = new Select(dropdownTabs.get(2));
        select.selectByVisibleText(textColour);
    }

    public void clickOnBoldButton() {
        boldButton.click();
    }

    public void clickOnItalicButton() {
        italicButton.click();
    }

    public void clickOnUnderlineButton() {
        underLineButton.click();
    }

    public boolean checkZoomRate(String zoomRate) {
        String getTextInfo = getTextInfo();
        return getTextInfo.contains(zoomRate.toLowerCase());
    }

    public boolean checkBackgroundColour(String backGroundColour) {
        String getTextInfo = getTextInfo();
        return getTextInfo.contains(backGroundColour.toLowerCase());
    }

    public boolean checkTextColour(String textColour) {
        String getTextInfo = getTextInfo();
        return getTextInfo.contains(textColour.toLowerCase());
    }

    public boolean checkIsBold() {
        String getTextInfo = getTextInfo();
        return getTextInfo.contains("bold");
    }

    public boolean checkIsItalic() {
        String getTextInfo = getTextInfo();
        return getTextInfo.contains("italic");
    }

    public boolean checkIsUnderline() {
        String getTextInfo = getTextInfo();
        return getTextInfo.contains("underline");
    }

    public String getTextInfo() {
        return textArea.getAttribute("style");
    }

}
