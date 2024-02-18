package enset.asraoui.dao.ext;

import enset.asraoui.dao.IDao;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
@Repository("dao2")
public class DaoImplV2 implements IDao {
    @Override
    public LocalDate getDate() {
        System.out.println("Web Service Version");
        LocalDate today = LocalDate.now();
        return today;
    }
}
