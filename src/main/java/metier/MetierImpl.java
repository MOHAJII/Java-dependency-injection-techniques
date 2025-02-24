package metier;

import dao.IDao;

public class MetierImpl implements IMetier {
    IDao dao;

    public MetierImpl() {
    }

    public MetierImpl(IDao dao) {
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
