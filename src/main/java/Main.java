import dao.model.Goods;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;


import java.util.Collection;
import java.util.List;

/**
 * Created by Alex on 13.07.2017.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        // Goods goods=ConsoleReaderGoods.readGoods();
        //  SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
     final HibernateUtil storage = new HibernateUtil();
     //final int id = storage.add(new Goods(656,"3254235",33,"123",34));
     final Collection<Goods>goodss=storage.values();
     for(Goods goods:goodss){
         System.out.print(goods.getCompany());
     }
     storage.close();
    }
}

