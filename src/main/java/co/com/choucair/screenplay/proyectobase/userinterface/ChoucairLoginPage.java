package co.com.choucair.screenplay.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class ChoucairLoginPage extends PageObject {
    public static final Target LOGIN_BUTTON = Target.the("button that shows us the form to login")
            .located(By.xpath("//a[@class='btn btn-info btn-sm text-white']"));

    public static final Target USER_TEXT = Target.the("field for the user to enter their username")
            .located(By.xpath("//input[@name='username']"));

    public static final Target PASSWORD_TEXT = Target.the("field for the user to enter their password")
            .located(By.xpath("//input[@name='password']"));

    public static final Target ENTER_BUTTON = Target.the("button that enters the main page")
            .located(By.xpath("//*[text()='Acceder']"));
}
