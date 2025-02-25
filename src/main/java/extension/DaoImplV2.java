package extension;

import dao.IDao;

public class DaoImplV2 implements IDao {
    @Override
    public int getData() {
        System.out.println("Web Service version");
        int t = 20;
        return t;
    }
}
