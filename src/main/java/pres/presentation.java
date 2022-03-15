package pres;

import Dao.DaoImp;
import Metier.IMetierImpl;

public class presentation {
    public static void main(String[] args) {
        DaoImp dao = new DaoImp() ;
        IMetierImpl metier=new IMetierImpl(dao) ;
      //  metier.setDao(dao);
        System.out.println(metier.calcul());
    }
}
