package pages.checkbox_radio;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

public class ProductSelector extends BasePage {
    @FindBy(css = ".brand-options>label")
    private List<WebElement> brandsSelectors;
    @FindBy(css = ".shape-options>label")
    private List<WebElement> shapesSelectors;
    @FindBy(css = ".toggle-options>label")
    private List<WebElement> togglesOptions;
    @FindBy(css = " .shape")
    private WebElement shapeElement;

    public ProductSelector() {
        super();
    }

    public void selectBrand(int index) {
        if (index > 4) {
            throw new RuntimeException("index can not be bigger than 4");
        }
        brandsSelectors.get(index - 1).click();
    }

    public void selectShape(int index) {
        if (index > 4) {
            throw new RuntimeException("index can not be bigger than 4");
        }
        shapesSelectors.get(index - 1).click();
    }

    public void selectToggle(int index) {
        if (index > 3) {
            throw new RuntimeException("index can not be bigger than 3");
        }
        togglesOptions.get(index - 1).click();
    }

    public void selectToggle(int index1, int index2) {
        if (index1 > 3 || index2 > 3) {
            throw new RuntimeException("index can not be bigger than 3");
        }
        togglesOptions.get(index1 - 1).click();
        togglesOptions.get(index2 - 1).click();
    }

    public void selectToggle(int index1, int index2, int index3) {
        if (index1 > 3 || index2 > 3 || index3 > 3) {
            throw new RuntimeException("index can not be bigger than 3");
        }
        togglesOptions.get(index1 - 1).click();
        togglesOptions.get(index2 - 1).click();
        togglesOptions.get(index3 - 1).click();
    }

    public String getClassAttributeOfShape() {
        return shapeElement.getAttribute("class");
    }


}
