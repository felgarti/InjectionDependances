package Dao;

import org.springframework.stereotype.Component;

@Component("dao3")
public class DaoImpWB implements IDao{
    @Override
    public double getData() {
        System.out.println("Version Web service ");
        return 7000;
    }
}
