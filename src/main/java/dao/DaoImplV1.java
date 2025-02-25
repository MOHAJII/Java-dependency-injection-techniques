package dao;

public class DaoImplV1 implements IDao {
    @Override
    public int getData() {
        System.out.println("Data Base version");
        int t = 10;
        return t;
    }
}
