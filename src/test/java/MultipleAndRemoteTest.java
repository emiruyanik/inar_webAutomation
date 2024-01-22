import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MultipleAndRemoteTest extends Hook {
    /*
     * 1. Open the browser and navigate to the page
     * 2. click on web automation link
     * 3. click on the auto complete button
     * 4. click on the multiple and remote button
     * 5. Enter "s" in the text field
     * 6. Verify that the suggestion menu is not displayed
     * 7. Clear the text field
     * 8. Enter "sp" in the text field
     * 9. Verify that "Loading suggestions..." message is displayed
     * 10. Verify that the suggestion menu is displayed
     * 11.Verify that the suggestions in the menu starts with sp(suggestions can be more than one)
     */
    @Test
    void testMultipleAndRemote() {
        //click on web automation link
        pages.getHomePage().clickOnWebAutomationLink();

        //click on the auto complete button
        pages.getWebAutomationPage().clickOnAutoComplete();

        //click on the multiple and remote button
        pages.getWebAutomationPage().clickOnMultipleAndRemote();

        //Enter "s" in the text field
        pages.getMultipleAndRemote().sendLettersToTheTextField("s");

        //Verify that the suggestion menu is not displayed
        Assertions.assertTrue(pages.getMultipleAndRemote().getBirdNames().isEmpty());

        //Clear the text field
        pages.getMultipleAndRemote().clearTextField();

        //Enter "sp" in the text field
        pages.getMultipleAndRemote().sendLettersToTheTextField("sp");

        //Verify that "Loading suggestions..." message is displayed
        Assertions.assertEquals("Loading suggestions...", pages.getMultipleAndRemote().getLoadingMessage(), "The message is not visible");

        //Verify that the suggestion menu is displayed
        Assertions.assertFalse(pages.getMultipleAndRemote().getBirdNames().isEmpty());

        //.Verify that the suggestions in the menu starts with sp(suggestions can be more than one)
        boolean check = true;
        for (String s : pages.getMultipleAndRemote().getBirdNames()) {
            s = s.toLowerCase();
            if (!s.startsWith("sp")) {
                check = false;
                break;
            }

        }
        Assertions.assertTrue(check, "Sp elements are not starting with sp");


    }
}
