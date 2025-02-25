package presentation;

import dao.DaoImplV1;
import dao.IDao;
import metier.MetierImpl;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class PresentationV2 {
    // Version par instanciation dynamique via le setter et via le constructeur
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("dependencies-configuration.txt"));

            // L'injection de l'implementation de la class dao a partir d'un fichier extern de dconfiguration
            String daoClass = scanner.nextLine();
            Class cDao = Class.forName(daoClass);
            IDao dao = (IDao) cDao.getConstructor().newInstance();


            String metiierClass = scanner.nextLine();
            Class cMetier = Class.forName(metiierClass);
            MetierImpl metier = (MetierImpl) cMetier.getConstructor(IDao.class).newInstance(dao); // Injection via le constructeur

            //  Injection via le setter
            //  Method setDao = cMetier.getMethod("setDao", IDao.class);
            //  setDao.invoke(metier, dao);



            System.out.println("******************PRESENTATION********************");
            System.out.println(metier.calculate());
            System.out.println("**************************************************");

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }





    }
}
