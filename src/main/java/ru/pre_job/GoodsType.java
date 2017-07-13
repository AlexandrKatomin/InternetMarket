package ru.pre_job;

import lombok.Getter;

/**
 * Created by Alex on 13.07.2017.
 */

@Getter
public enum GoodsType {
    PC("ПК", 1, PC.class),
    Notebook("Ноутбук", 2, Notebook.class),
    Furniture("Мебель", 3, Furniture.class);

    String value;
    int number;
    Class<? extends Goods> aclass;

    GoodsType(String value, int number, Class<? extends Goods> aclass) {
        this.aclass = aclass;
        this.number = number;
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    public static GoodsType getTypeGoods(int number) {
        for (GoodsType goodsType : GoodsType.values()) {
            if (goodsType.number == number)
                return goodsType;
        }
        return null;
    }


    public static GoodsType getTypeGoods(String value) {
        for (GoodsType goodsType : values()) {
            if (goodsType.value.equals(value)) {
                return goodsType;
            }
        }
        return null;

    }
}
