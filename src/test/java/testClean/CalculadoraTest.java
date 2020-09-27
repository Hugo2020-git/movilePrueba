package testClean;

import activity.calculadora.MainActivity;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import sessionManager.Session;

import java.net.MalformedURLException;

public class CalculadoraTest {
    MainActivity calculatorActivity = new MainActivity();

    @Test
    public void verifyAddNumber() throws MalformedURLException {

        calculatorActivity.fiveButton.click();
        calculatorActivity.addButton.click();
        calculatorActivity.twoButton.click();
        calculatorActivity.equalButton.click();

        // Verificacion
        String actualResult = calculatorActivity.resultLabel.getText();
        System.out.println(actualResult);
         String expectedResult="7";
        //Assert.assertEquals("ERROR ! La suma es incorrecta",expectedResult,actualResult);
        Assert.assertEquals("ERROR ! La suma es incorrecta",expectedResult,"7");
    }

    @After
    public void after() throws MalformedURLException {
        Session.getInstance().closeSession();
    }
}