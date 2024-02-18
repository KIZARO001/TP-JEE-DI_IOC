package enset.asraoui.pres;

import enset.asraoui.dao.DaoImpl;
import enset.asraoui.dao.IDao;
import enset.asraoui.metier.IMetier;
import enset.asraoui.metier.MetierImpl;

public class presInstanciationStatique {
    public static void main(String[] args) {
        IDao dao = new DaoImpl();
        IMetier metier = new MetierImpl(dao);
        System.out.println("The current month is "+metier.calcul());
    }

}
