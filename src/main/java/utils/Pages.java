package utils;

import pages.HomePage;
import pages.Iframe.NormalIframe;
import pages.WebAutomationPage;
import pages.accordion.CollapseContent;
import pages.alerts.Alerts;
import pages.alerts.ShowAlert;
import pages.alerts.ShowConfirm;
import pages.alerts.ShowPrompt;
import pages.autocomplete.AccentFolding;
import pages.autocomplete.MultipleAndRemote;
import pages.checkbox_radio.ProductSelector;
import pages.controlgroup.ToolBar;
import pages.datepicker.SelectDateRange;
import pages.dialog.ModalConfirmation;
import pages.draggable.ConstrainMovement;
import pages.draggable.Handles;
import pages.drppable.Accept;
import pages.drppable.RevertAndDraggablePosition;
import pages.menu.Icons;
import pages.progressbar.DownloadDialog;
import pages.resizable.SynchronousResize;
import pages.resizable.TextArea;
import pages.selectable.Serialize;
import pages.slider.SnapToIncrements;
import pages.sortable.DisplayAsGrid;
import pages.spinner.SpinnerWithLAL;

public class Pages {
    public Pages() {

    }

    public HomePage getHomePage() {
        return new HomePage();
    }

    public WebAutomationPage getWebAutomationPage() {
        return new WebAutomationPage();
    }

    public ConstrainMovement getConstrainMovement() {
        return new ConstrainMovement();
    }

    public Handles getHandles() {
        return new Handles();
    }

    public Accept getAcceptLink() {
        return new Accept();
    }

    public RevertAndDraggablePosition getRevertAndDraggablePositionLink() {
        return new RevertAndDraggablePosition();
    }

    public SynchronousResize getSynchronousResize() {
        return new SynchronousResize();
    }

    public TextArea getTextArea() {
        return new TextArea();
    }

    public Serialize getSerialize() {
        return new Serialize();
    }

    public NormalIframe getNormalIframe() {
        return new NormalIframe();
    }

    public ShowAlert getShowAlert() {
        return new ShowAlert();
    }

    public ShowConfirm getShowConfirm() {
        return new ShowConfirm();
    }

    public ShowPrompt getShowPrompt() {
        return new ShowPrompt();
    }

    public DisplayAsGrid getDisplayAsGrid() {
        return new DisplayAsGrid();
    }

    public ProductSelector getProductSelector() {
        return new ProductSelector();
    }

    public MultipleAndRemote getMultipleAndRemote() {
        return new MultipleAndRemote();
    }

    public Alerts getAlerts() {
        return new Alerts();
    }

    public AccentFolding getAccentFolding() {
        return new AccentFolding();
    }

    public DownloadDialog getDownloadDialog() {
        return new DownloadDialog();
    }

    public ModalConfirmation getModalConfirmation() {
        return new ModalConfirmation();
    }

    public Icons getIcons() {
        return new Icons();
    }

    public ToolBar getToolBar() {
        return new ToolBar();
    }

    public SelectDateRange getSelectDateRange() {
        return new SelectDateRange();
    }

    public SnapToIncrements getSnapToIncrements() {
        return new SnapToIncrements();
    }

    public SpinnerWithLAL getSpinnerWithLAL() {
        return new SpinnerWithLAL();
    }
    public CollapseContent getCollapseContent(){
        return new CollapseContent();
    }

}
