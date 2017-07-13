package ru.pre_job;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by Alex on 13.07.2017.
 */
@Getter
@Setter
public class PC extends Computer {
    String formFactor;

    @Override
    public void init(){
        super.init();
        ConsoleReader.clearBuffer();
        this.formFactor=ConsoleReader.readString("Введите формфактор:");
    }
}
