package presentation;

import dao.DaoImplV1;
import dao.IDao;
import metier.MetierImpl;

public class PresentationV1 {
    // Version par instanciation statique via le setter et via le constructeur
    public static void main(String[] args) {

        IDao dao = new DaoImplV1();
        //MetierImpl metier = new MetierImpl(dao); // Injection via le constructeur
        MetierImpl metier = new MetierImpl();

        metier.setDao(dao); // Injection via le stter


        System.out.println("******************PRESENTATION********************");
        System.out.println(metier.calculate());
        System.out.println("**************************************************");
    }
}
