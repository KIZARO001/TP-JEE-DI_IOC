package enset.asraoui.dao;

import java.time.LocalDate;

public class DaoImpl implements IDao{
    @Override
    public LocalDate getDate() {
        LocalDate today = LocalDate.now();
        return today;
    }
}
