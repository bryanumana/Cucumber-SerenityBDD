package co.com.choucair.screenplay.proyectobase.tasks;

import co.com.choucair.screenplay.proyectobase.userinterface.ChoucairLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;

public class Login implements Task {
    private String strNameI;
    private String strPasswordI;

    public Login(String strUserName, String strPassword) {
        this.strNameI = strUserName;
        this.strPasswordI = strPassword;
    }

    public static Login onThePage(String strUserName, String strPassword) {
        return Tasks.instrumented(Login.class, strUserName, strPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ChoucairLoginPage.LOGIN_BUTTON),
                SendKeys.of(strNameI).into(ChoucairLoginPage.USER_TEXT),
                SendKeys.of(strPasswordI).into(ChoucairLoginPage.PASSWORD_TEXT),
                Click.on(ChoucairLoginPage.ENTER_BUTTON)
        );

    }
}
