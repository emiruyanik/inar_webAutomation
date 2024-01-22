package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.datepicker.SelectDateRange;
import utils.BrowserUtils;

public class WebAutomationPage extends BasePage {
    @FindBy(linkText = "Draggable")
    private WebElement draggableLink;
    @FindBy(linkText = "Dialog")
    private WebElement dialogLink;
    @FindBy(linkText = "Constrain Movement")
    private WebElement constrainMovementLink;
    @FindBy(linkText = "Control Group")
    private WebElement controlGroupLink;
    @FindBy(linkText = "Toolbar")
    private WebElement toolbarLink;

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
    @FindBy(linkText = "Autocomplete")
    private WebElement autocompleteLink;
    @FindBy(linkText = "Multiple & Remote")
    private WebElement multipleRemoteLink;
    @FindBy(linkText = "Accent Folding")
    private WebElement accentFoldingLink;
    @FindBy(linkText = "Menu")
    private WebElement menuLink;
    @FindBy(linkText = "Icons")
    private WebElement iconsLink;
    @FindBy(linkText = "Progress Bar")
    private WebElement progressBarLink;
    @FindBy(linkText = "Download Dialog")
    private WebElement downloadDialogLink;
    @FindBy(linkText = "Modal Confirmation")
    private WebElement modalConfirmationLink;
    @FindBy(linkText = "Datepicker")
    private WebElement datepickerLink;
    @FindBy(linkText = "Select Date Range")
    private WebElement selectDateRangeLink;
    @FindBy(linkText = "Slider")
    private WebElement sliderLink;
    @FindBy(linkText = "Snap to increments")
    private WebElement snapToIncrementsLink;
    @FindBy(linkText = "Spinner")
    private WebElement spinnerLink;
    @FindBy(linkText = "Spinner with longtidute and latitude")
    private WebElement spinnerWithLALLink;
    @FindBy(linkText = "Accordion")
    private WebElement accordionLink;
    @FindBy(linkText = "Collapse Content")
    private WebElement collapseContentLink;


    public WebAutomationPage() {
        super();
    }

    public void clickOnDraggableLink() {
        draggableLink.click();
    }

    public void clickOnDialogLink() {
        dialogLink.click();
    }

    public void clickOnModalConfirmationLink() {
        modalConfirmationLink.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scroll(0,100)");
        BrowserUtils.wait(1);
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

    public void clickOnAutoComplete() {
        autocompleteLink.click();
    }

    public void clickOnMultipleAndRemote() {
        multipleRemoteLink.click();
    }

    public void clickOnAccentFoldingLink() {
        accentFoldingLink.click();
    }

    public void clickOnProgressBar() {
        progressBarLink.click();
    }

    public void clickOnDownloadLink() {
        downloadDialogLink.click();
    }

    public void clickOnMenuLink() {
        menuLink.click();
    }

    public void clickOnIcons() {
        iconsLink.click();
    }

    public void clickOnControlGroup() {
        controlGroupLink.click();
    }

    public void clickOnToolBar() {
        toolbarLink.click();
    }

    public void clickOnDatePickerLink() {
        datepickerLink.click();
    }

    public void clickOnSelectDateRangeLink() {
        selectDateRangeLink.click();
    }

    public void clickOnSliderLink() {
        sliderLink.click();
    }

    public void clickOnSnapToIncrementsLink() {
        snapToIncrementsLink.click();
    }

    public void clickOnSpinnerLink() {
        spinnerLink.click();
    }

    public void clickOnSpinnerWithLalLink() {
        spinnerWithLALLink.click();
    }

    public void clickOnAccordionLink() {
        accordionLink.click();
    }
    public void clickOnCollapseContent(){
        collapseContentLink.click();
    }


}
