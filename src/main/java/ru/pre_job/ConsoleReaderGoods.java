package ru.pre_job;

import static ru.pre_job.Goods.personBuild;

/**
 * Created by Alex on 13.07.2017.
 */
public class ConsoleReaderGoods {
    boolean flag = false;
    public int retypePerson;

    public static Goods readGoods() throws IllegalAccessException, InstantiationException {

        int goodsType = ConsoleReader.readInt(
                "\n1 - ПК\n2 - Ноутбук" +
                        "\n3 - Мебель" + "\n");
        Goods goods = personBuild(goodsType);
        goods.init();
        return goods;
    }
}
