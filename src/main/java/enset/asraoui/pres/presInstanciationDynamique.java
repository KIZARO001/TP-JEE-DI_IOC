package enset.asraoui.pres;

import enset.asraoui.dao.IDao;
import enset.asraoui.metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class presInstanciationDynamique {
    public static void main(String[] args) {
        try {

            /****** Pour qu'il se compile correctement faut decommenter le constructeur sans parametre de la class MetierImpl*******/

            Scanner scanner = new Scanner(new File("src/main/resources/config.txt"));
            String daoClass = scanner.nextLine();
            Class cDao = Class.forName(daoClass);
            IDao dao = (IDao) cDao.newInstance();

            String metierClass = scanner.nextLine();
            Class cMetier = Class.forName(metierClass);
            IMetier metier = (IMetier) cMetier.newInstance();
            Method methodsetDao = cMetier.getMethod("setDao", IDao.class);
            methodsetDao.invoke(metier,dao);


            System.out.println("The current month is "+metier.calcul());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
