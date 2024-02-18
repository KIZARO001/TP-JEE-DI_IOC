package enset.asraoui.metier;

import java.time.LocalDate;

public class MetierImpl implements IMetier{
    @Override
    public double calcul(LocalDate localDate) {
        return localDate.getDayOfMonth();
    }
}
