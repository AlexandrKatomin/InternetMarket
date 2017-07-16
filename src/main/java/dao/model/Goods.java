package dao.model;

import lombok.Getter;
import lombok.Setter;


import javax.persistence.*;

/**
 * Created by yuriy on 16.07.2017.
 */
@Getter
@Setter
@Entity
@Table(name = "goods")
public class Goods {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    @Column(name="name")
    String name;
    @Column(name="price")
    int price;
    @Column(name="company")
    String company;
    @Column(name="countGoods")
    int countGoods;
}
