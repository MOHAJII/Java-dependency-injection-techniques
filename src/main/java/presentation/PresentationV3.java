package presentation;

import dao.IDao;
import metier.IMetier;
import metier.MetierImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;
import java.util.Scanner;

public class PresentationV3 {
    // Version par instanciation dynamique via le setter et via le constructeur
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        IDao dao = context.getBean(IDao.class);
        IMetier metier = context.getBean(IMetier.class);

        System.out.println("******************PRESENTATION********************");
        System.out.print("          ");
        System.out.println("                 " + metier.calculate());
        System.out.println("**************************************************");
    }
}
