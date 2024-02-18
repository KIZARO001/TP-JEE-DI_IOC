package enset.asraoui.metier;

import enset.asraoui.dao.IDao;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
@Service("metier")
public class MetierImpl implements IMetier{
    private IDao dao;

    public MetierImpl(@Qualifier("dao2") IDao dao) {
        this.dao = dao;
    }

    public IDao getDao() {
        return dao;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        LocalDate date = dao.getDate();
        return date.getMonthValue();
    }
}
