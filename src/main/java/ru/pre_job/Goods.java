package ru.pre_job;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by Alex on 13.07.2017.
 */

@Getter
@Setter
public abstract class Goods {
    String id;
    String name;
    double price;
    String company;
    int countGoods;

    final String INPUT_ID = "Введите id:";
    final String INPUT_NAME = "Введите название товара:";
    final String INPUT_PRICE = "Введите цену:";
    final String INPUT_COMPANY = "Введите фирму производителя:";
    final String INPUT_COUNTGOODS = "Введите количество товаров:";

    public void init() {
        ConsoleReader.clearBuffer();
        this.id = ConsoleReader.readString(INPUT_ID);
        this.name = ConsoleReader.readString(INPUT_NAME);
        this.price = ConsoleReader.readDouble(INPUT_PRICE);
        this.company = ConsoleReader.readString(INPUT_COMPANY);
        this.countGoods = ConsoleReader.readInt(INPUT_COUNTGOODS);
    }

    public static Goods personBuild(int typePerson) throws InstantiationException, IllegalAccessException {
        GoodsType type = GoodsType.getTypeGoods(typePerson);
        return type.getAclass().newInstance();
    }

}
