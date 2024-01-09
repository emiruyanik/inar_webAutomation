package utils;

import pages.HomePage;
import pages.Iframe.NormalIframe;
import pages.WebAutomationPage;
import pages.alerts.ShowAlert;
import pages.alerts.ShowConfirm;
import pages.alerts.ShowPrompt;
import pages.checkbox_radio.ProductSelector;
import pages.draggable.ConstrainMovement;
import pages.draggable.Handles;
import pages.drppable.Accept;
import pages.drppable.RevertAndDraggablePosition;
import pages.resizable.SynchronousResize;
import pages.resizable.TextArea;
import pages.selectable.Serialize;
import pages.sortable.DisplayAsGrid;

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
}
