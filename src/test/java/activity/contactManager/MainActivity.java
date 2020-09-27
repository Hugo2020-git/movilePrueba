package activity.contactManager;

import appiumControl.Button;
import appiumControl.Label;
import org.openqa.selenium.By;

/**
 * @autor : eynar.pari
 * @date : 19/09/2020.
 **/
public class MainActivity {

    public Button addContactButton;

    public MainActivity(){
        addContactButton= new Button(By.xpath("//android.widget.Button[@content-desc=\"Add Contact\"]"));
    }

    public boolean isDisplayedContact(String nameContact){
        String locator="//android.widget.TextView[@text='"+nameContact+"']";
        Label contact = new Label(By.xpath(locator));
        return contact.isDisplayed();
    }
}
