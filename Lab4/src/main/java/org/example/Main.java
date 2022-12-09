package org.example;
import com.opencsv.CSVReader;
import java.util.ArrayList;
import java.io.FileReader;

public class Main {
    /**
     * Метод, выполняющий вывод списка на экран
     * @param list Список
     */
    public static void PrintList (ArrayList<Person> list){
        for(Person pers : list){
            System.out.print(pers.ID + " " + pers.Name + " " + pers.Gender + " " +
                    pers.Birthday + " " + pers.Div.ID + " "  + pers.Div.Name+
                    " " + pers.Salary+ "\n");
        }
    }

    /**
     * Метод, проверяющий, было ли использовано данное подразделение ранее
     * @param div Подразделение
     * @param divis Список использованных ранее подразделений
     * @return Подразделение
     */
    public static Division AreThereDivisions(Division div, ArrayList<Division> divis){
        for(Division div1 : divis){
            if(div1.Name.equals(div.Name)){
                return div1;
            }
        }
        divis.add(div);
        return div;
    }
    public static void main(String[] args) {
        ArrayList<Division> divis = new ArrayList<Division>();
        ArrayList<Person> list = new ArrayList<Person>();
        String file="src/main/resources/foreign_names.csv";
        try {
            CSVReader reader = new CSVReader(new FileReader(file));
            String str;
            String[] nextLine;
            reader.readNext();
            while ((nextLine = reader.readNext()) != null) {
                    str=nextLine[0];
                    nextLine=str.split(";");
                    int id = Integer.parseInt(nextLine[0]);
                    String name = nextLine[1];
                    String gender = nextLine[2];
                    String birthday=nextLine[3];
                    Division div=new Division(nextLine[4]);
                    div=AreThereDivisions(div, divis);
                    int salary= Integer.parseInt(nextLine[5]);
                    Person pers=new Person(id,name,gender,div,salary,birthday);
                    list.add(pers);
            }
        } catch (Exception e) {
            System.out.println("");
        }
        PrintList(list);
    }
}