package Dao;

import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImp implements IDao {
    @Override
    public double getData() {
        System.out.println("version database");
        double temp=Math.random()*40 ;
        return temp;
    }
}
