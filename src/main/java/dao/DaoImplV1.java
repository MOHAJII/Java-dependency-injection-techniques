package dao;

public class DaoImplV1 implements IDao {
    @Override
    public int getData() {
        System.out.println("Data get it from database");
        int t = 10;
        return t;
    }
}
