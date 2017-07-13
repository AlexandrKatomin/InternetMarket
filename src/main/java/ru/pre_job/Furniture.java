package ru.pre_job;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by Alex on 13.07.2017.
 */
@Getter
@Setter
public class Furniture extends Goods {
    String material;
    double width;
    double length;
    double height;
    String type;

    @Override
    public void init() {
        super.init();
        this.material = ConsoleReader.readString("Введите материал мебели:");
        this.width = ConsoleReader.readDouble("Введите ширину мебели:");
        this.length = ConsoleReader.readDouble("Введите длину мебели:");
        this.height = ConsoleReader.readDouble("Введите высоту мебели:");
        this.type = ConsoleReader.readString("Введите тип мебели:");
    }
}
