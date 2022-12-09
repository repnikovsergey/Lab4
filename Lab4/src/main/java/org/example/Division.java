package org.example;
import java.util.Random;

/**
 * Класс, хранящий информацию о подразделении
 */
public class Division {
    int ID;
    String Name;

    /**
     * Конструктор класса
     */
    public Division(String Name){
        this.Name=Name;
        Random rand=new Random();
        ID=rand.nextInt();
    }
}
