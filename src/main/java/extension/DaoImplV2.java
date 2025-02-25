package extension;

import dao.IDao;
import org.springframework.stereotype.Component;

@Component("daoV2")
public class DaoImplV2 implements IDao {
    @Override
    public int getData() {
        System.out.println("Web Service version");
        int t = 20;
        return t;
    }
}
