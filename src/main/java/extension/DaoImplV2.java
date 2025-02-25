package extern;

import dao.IDao;

public class DaoImplV2 implements IDao {
    @Override
    public int getData() {
        System.out.println("Data get it from web service");
        int t = 20;
        return t;
    }
}
