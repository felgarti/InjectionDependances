package Metier;

import Dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class IMetierImpl implements IMetier {
    @Autowired
    @Qualifier(value = "dao2")
    private IDao  dao ;
    public IMetierImpl(IDao dao)
    {
       this.dao=dao ;
    }
    @Override
    public double calcul() {
        double temp=dao.getData() ;
        return temp+273 ;
        //55:24
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
