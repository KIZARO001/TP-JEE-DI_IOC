package enset.asraoui.pres;

import enset.asraoui.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresWithAnnotation {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("enset.asraoui");
        IMetier metier = context.getBean(IMetier.class);
        System.out.println(metier.calcul());
    }
}
