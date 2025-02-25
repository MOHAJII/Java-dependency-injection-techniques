package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements IMetier {
    //@Autowired // Not recommended because it access directly to this object it breaks the principal of encapsulation
    IDao dao;

    // L'injection via le constructeur est la plus recommender
    public MetierImpl(@Qualifier("dao") IDao dao) {

        this.dao = dao;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calculate() {
        double result = dao.getData() * 4;
        return result;
    }
}
