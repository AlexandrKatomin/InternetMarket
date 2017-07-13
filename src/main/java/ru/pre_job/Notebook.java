package ru.pre_job;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by Alex on 13.07.2017.
 */
@Getter
@Setter
public class Notebook extends Computer {
    double diagonal;
    String timeWork;

    @Override
    public void init(){
        super.init();
        ConsoleReader.clearBuffer();
        this.diagonal=ConsoleReader.readDouble("Введите диагональ ноутбука:");
        this.timeWork=ConsoleReader.readString("Введите время работы от аккумулятора:");
    }
}
