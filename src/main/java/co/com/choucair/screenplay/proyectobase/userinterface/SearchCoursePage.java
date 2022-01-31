package co.com.choucair.screenplay.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {

    public static final Target UNIVERSITY_BUTTON = Target.the("button that moves to the courses")
            .located(By.xpath("//div[@id='universidad']"));

    public static final Target COURSE_INPUT= Target.the("field to add the name of the course")
            .located(By.xpath("//input[@id='coursesearchbox']"));

    public static final Target COURSE_BUTTON= Target.the("button that searchs the course")
            .located(By.xpath("//button[@class='btn btn-secondary']"));

    public static final Target COURSE_SELECT= Target.the("selects the course")
            .located(By.xpath("(//*[text() = 'Patrones de Automatizaci\u00f3n'])[1]"));

    public static final Target NAME_COURSE= Target.the("course name")
            .located(By.xpath("//h1[contains(text(), 'Patrones de Automatizaci\u00f3n')]"));
}
