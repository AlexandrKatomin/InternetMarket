package dao.model;

import lombok.Getter;
import lombok.Setter;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 * Created by yuriy on 16.07.2017.
 */
@Getter
@Setter

public class Goods implements Serializable {

    int id;
    String name;
    Integer price;
    String company;
    Integer countGoods;
    Set<Computer> computers;

    public Goods(int id, String name, Integer price, String company, Integer countGoods) {
        this.id=id;
        this.name=name;
        this.price=price;
        this.company=company;
        this.countGoods=countGoods;
    }
}
