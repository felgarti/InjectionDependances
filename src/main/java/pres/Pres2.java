package pres;

import Dao.IDao;
import Metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Pres2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("src/config.txt")) ;

        String DaoClassName=sc.nextLine();
        Class cDao=Class.forName(DaoClassName) ;
       IDao dao= (IDao) cDao.getConstructor().newInstance() ;
       //System.out.println(dao.getData());
       //classCastException si la classe de l'objet dao n implemente pas IDao

        String metierClassName = sc.nextLine() ;
        Class cMetier = Class.forName(metierClassName) ;
        IMetier metier= (IMetier)  cMetier.getConstructor().newInstance() ;

        Method method = cMetier.getMethod("setDao" , IDao.class) ;
        method.invoke(metier, dao) ;

        System.out.println("Résultat => "+metier.calcul());



    }


}
