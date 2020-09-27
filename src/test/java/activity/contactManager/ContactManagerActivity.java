package activity.contactManager;

import appiumControl.Button;
import appiumControl.TextBox;
import org.openqa.selenium.By;

/**
 * @autor : eynar.pari
 * @date : 19/09/2020.
 **/
public class ContactManagerActivity {
    public TextBox contactName;
    public TextBox contactNumber;
    public TextBox contactEmail;
    public Button saveButton;

    public ContactManagerActivity(){
        contactName= new TextBox(By.id("com.example.android.contactmanager:id/contactNameEditText"));
        contactNumber= new TextBox(By.id("com.example.android.contactmanager:id/contactPhoneEditText"));
        contactEmail= new TextBox(By.id("com.example.android.contactmanager:id/contactEmailEditText"));
        saveButton= new Button(By.xpath("//android.widget.Button[@content-desc=\"Save\"]"));
    }
}
