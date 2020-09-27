package activity.contactManager;
import appiumControl.Button;
import org.openqa.selenium.By;

/**
 * @autor : eynar.pari
 * @date : 19/09/2020.
 **/
public class UpdateDialog {

    public Button okButton;
    public UpdateDialog(){
        okButton = new Button(By.id("android:id/button1"));
    }
}
