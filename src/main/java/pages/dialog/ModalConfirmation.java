package pages.dialog;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class ModalConfirmation extends BasePage {
    @FindBy(xpath = "//span[@id='ui-id-46']/../button")
    private WebElement closeIcon;
    @FindBy(id = "ui-id-46")
    private WebElement basicDialogText;
    @FindBy(xpath = "//button[text()='cancel']")
    private WebElement cancelButton;
    @FindBy(id = "ui-id-147")
    private WebElement basicDialogHolder;
    @FindBy(xpath = "(//div[@id='dialog-modal-confirmation']/../div)[7]")
    private WebElement resizableIcon;
    @FindBy(id = "dialog-container-modal-confirmation")
    private WebElement frameContainer;
    @FindBy(id = "dialog-modal-confirmation")
    private WebElement contentBar;

    public ModalConfirmation() {
        super();
    }

    public void clickOnCloseIcon() {
        closeIcon.click();
    }

    public String getDialogText() {
        return basicDialogText.getText();
    }

    public void clickOnCancelButton() {
        cancelButton.click();
    }

    public void setResizableIcon(int xOffset, int yOffset) {
        actions.clickAndHold(resizableIcon).moveByOffset(xOffset, yOffset).release().perform();
    }

    public void setBasicDialogHolder(int xOffset, int yOffset) {
        actions.dragAndDropBy(basicDialogHolder, xOffset, yOffset).perform();
    }

    public boolean isDialogDisplayed() {
        return !frameContainer.getAttribute("style").contains("display: none;");
    }

    public int getWidthOfContentBar() {
        return contentBar.getSize().getWidth();
    }

    public int getHeightOfContentBar() {
        return contentBar.getSize().getHeight();
    }

}
