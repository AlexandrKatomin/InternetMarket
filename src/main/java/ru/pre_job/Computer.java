package ru.pre_job;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by Alex on 13.07.2017.
 */
@Getter
@Setter
public class Computer extends Goods {
    int countCPU;
    int countRAM;
    int countMemoryHDD;


    @Override
    public void init() {
        super.init();
        this.countCPU = ConsoleReader.readInt("Введите количество процессоров:");
        this.countRAM = ConsoleReader.readInt("Введите оперативной памяти:");
        this.countMemoryHDD = ConsoleReader.readInt("Введите количество памяти в жестком диске:");
    }
}
