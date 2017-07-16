
import dao.model.Goods;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import store.Storage;


import java.util.Collection;

/**
 * Created by yuriy on 16.07.2017.
 */


public class HibernateUtil implements Storage{
    private final SessionFactory factory;

    public HibernateUtil(){
        factory=new Configuration().configure().buildSessionFactory();
    }




    @Override
    public Collection<Goods> values() {
       final Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
        try{
            return session.createQuery("from Goods").list();
        }finally {
            tx.commit();
            session.close();
        }
    }

    @Override
    public int add(Goods goods) {
        final Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
        try{
            session.save(goods);
            return goods.getId();
        }finally {
            tx.commit();
            session.close();
        }
    }

    @Override
    public void edit(Goods goods) {

    }

    @Override
    public void delete(int id) {
        final Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
        try{
            session.delete(new Goods(id,null,null,null,null));
        }finally {
            tx.commit();
            session.close();
        }
    }

    @Override
    public int generateId() {
        return 0;
    }

    @Override
    public void close() {
        this.factory.close();
    }

    @Override
    public Goods fingByName(String name) {
        return null;
    }

    @Override
    public Goods get(int id) {
        return null;
    }
}
