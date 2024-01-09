package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebAutomationPage extends BasePage {
    @FindBy(linkText = "Draggable")
    private WebElement draggableLink;
    @FindBy(linkText = "Constrain Movement")
    private WebElement constrainMovementLink;
    @FindBy(linkText = "Handles")
    private WebElement handlesLink;
    @FindBy(linkText = "Droppable")
    private WebElement droppableLink;
    @FindBy(linkText = "Accept")
    private WebElement acceptLink;
    @FindBy(linkText = "Revert draggable position")
    private WebElement revertDraggableLink;
    @FindBy(linkText = "Resizable")
    private WebElement resizableLink;
    @FindBy(linkText = "Synchronus Resize")
    private WebElement synchronusResizeLink;
    @FindBy(linkText = "Textarea")
    private WebElement textareaLink;
    @FindBy(linkText = "Selectable")
    private WebElement selectableLink;
    @FindBy(linkText = "Serialize")
    private WebElement serializeLink;
    @FindBy(linkText = "Iframe")
    private WebElement iframeLink;
    @FindBy(linkText = "Normal Iframe")
    private WebElement normalIframeLink;
    @FindBy(linkText = "Alerts")
    private WebElement alertslink;
    @FindBy(linkText = "Sortable")
    private WebElement sortableLink;
    @FindBy(linkText = "Display as Grid")
    private WebElement displayAsGridLink;
    @FindBy(linkText = "Checkbox Radio")
    private WebElement checkBoxRadioLink;
    @FindBy(linkText = "Product Selector")
    private WebElement productSelectorLink;


    public WebAutomationPage() {
        super();
    }

    public void clickOnDraggableLink() {
        draggableLink.click();
    }

    public void clickOnConstrainMovementLink() {
        constrainMovementLink.click();
    }

    public void clickOnHandlesLink() {
        handlesLink.click();
    }

    public void clickOnDroppableLink() {
        droppableLink.click();
    }

    public void clickOnAcceptLink() {
        acceptLink.click();
    }

    public void clickRevertDraggable() {
        revertDraggableLink.click();
    }

    public void clickResizableLink() {
        resizableLink.click();
    }

    public void clickSynchronusResize() {
        synchronusResizeLink.click();
    }

    public void clickTestArea() {
        textareaLink.click();
    }

    public void clickSelectable() {
        selectableLink.click();
    }

    public void clickIframe() {
        iframeLink.click();
    }

    public void clickSerialize() {
        serializeLink.click();
    }

    public void clickNormalIframeLink() {
        normalIframeLink.click();
    }

    public void clickOnAlertsLink() {
        alertslink.click();
    }

    public void clickOnSortableLink() {
        sortableLink.click();
    }

    public void clickOnDisplayAsGridLink() {
        displayAsGridLink.click();
    }

    public void clickOnCheckBoxRadio() {
        checkBoxRadioLink.click();
    }

    public void clickOnDProductSelector() {
        productSelectorLink.click();
    }


}
