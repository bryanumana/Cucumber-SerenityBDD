package co.com.choucair.screenplay.proyectobase.tasks;

import co.com.choucair.screenplay.proyectobase.userinterface.ChoucairLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;

public class Login implements Task {
    public static Login onThePage() {
        return Tasks.instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ChoucairLoginPage.LOGIN_BUTTON),
                SendKeys.of("bumanag").into(ChoucairLoginPage.USER_TEXT),
                SendKeys.of("Choucair2022*").into(ChoucairLoginPage.PASSWORD_TEXT),
                Click.on(ChoucairLoginPage.ENTER_BUTTON)
        );

    }
}
