package dao.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by yuriy on 16.07.2017.
 */
@Getter
@Setter

public class Computer {
    Long id;
    Goods goods;
    int countCPU;
    int countRAM;
    int countMemoryHDD;
    public Computer(){}
}
