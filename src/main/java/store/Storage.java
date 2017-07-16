package store;

import dao.model.Goods;

import java.util.Collection;

/**
 * Created by yuriy on 16.07.2017.
 */
public interface Storage {
    Collection<Goods> values();
    int add(final Goods goods);
    void edit(Goods goods);
    void delete(int id);
    int generateId();
    void close();
    Goods fingByName(final String name);
    Goods get(final int id);

}
