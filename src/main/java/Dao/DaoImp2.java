package Dao;

import org.springframework.stereotype.Component;

@Component("dao2")
public class DaoImp2 implements IDao{

    @Override
    public double getData() {
        System.out.println("Version capteurs ");
        return 6000;
    }
}
