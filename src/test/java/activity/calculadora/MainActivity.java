package activity.calculadora;

import appiumControl.Button;
import appiumControl.Label;
import org.openqa.selenium.By;


public class MainActivity {

    public Button fiveButton;
    public Button twoButton;
    public Button addButton;
    public Button equalButton;
    public Label resultLabel;

    public MainActivity(){
        fiveButton= new Button(By.id("com.sec.android.app.popupcalculator:id/bt_05"));
        twoButton= new Button(By.id("com.sec.android.app.popupcalculator:id/bt_02"));
        addButton= new Button(By.id("com.sec.android.app.popupcalculator:id/bt_add"));
        equalButton= new Button(By.id("com.sec.android.app.popupcalculator:id/bt_equal"));
        resultLabel= new Label(By.id("com.sec.android.app.popupcalculator:id/txtCalc"));
    }
}