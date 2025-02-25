package presentation;

import dao.IDao;
import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresentationV4 {
    // Version par instanciation dynamique via le setter et via le constructeur
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("dao", "metier");

        IDao dao = context.getBean(IDao.class);
        IMetier metier = context.getBean(IMetier.class);

        System.out.println("******************PRESENTATION********************");
        System.out.print("          ");
        System.out.println("                 " + metier.calculate());
        System.out.println("**************************************************");
    }
}



