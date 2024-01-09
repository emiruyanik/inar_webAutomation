package pages.sortable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import utils.BrowserUtils;

import java.util.List;

public class DisplayAsGrid extends BasePage {
    @FindBy(css = "#sortable-disp-as-grid>li")
    private List<WebElement> webElements;

    public DisplayAsGrid() {
        super();
    }

    public void dragAndDropElement(int box1, int box2) throws InterruptedException {
        int xOffset = xLocation(box2) + width(box2) / 2 - xLocation(box1);
        int yOffset = yLocation(box2) + height(box2) / 2 - yLocation(box1);


        actions.dragAndDropBy(webElements.get(box1 - 1), xOffset, yOffset).build().perform();


    }

    public String getText(int index) {
        return webElements.get(index - 1).getText();
    }


    public int width(int index) {
        return webElements.get(index - 1).getSize().getWidth();
    }

    public int height(int index) {
        return webElements.get(index - 1).getSize().getHeight();
    }

    public int xLocation(int index) {
        return webElements.get(index - 1).getLocation().getX();
    }

    public int yLocation(int index) {
        return webElements.get(index - 1).getLocation().getY();
    }
}
