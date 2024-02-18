package enset.asraoui.dao;

import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository("dao")
public class DaoImpl implements IDao{
    @Override
    public LocalDate getDate() {
        System.out.println("DataBase Version");
        LocalDate today = LocalDate.now();
        return today;
    }
}
