package org.example;

/**
 * Класс, хранящий информацию о человеке
 */
public class Person {
    int ID;
    String Name;
    String Gender;
    Division Div;
    int Salary;
    String Birthday;

    /**
     * Конструктор класса
     */
    public Person(int ID, String Name, String Gender, Division Div, int Salary, String Birthday) {
        this.ID = ID;
        this.Name = Name;
        this.Gender = Gender;
        this.Div = Div;
        this.Salary = Salary;
        this.Birthday = Birthday;
    }
}