package prototype;

import employees.Pokemon;

import java.util.List;

public class PrototypePatternTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        Pokemon emps = new Pokemon();
        emps.loadData();

        //Use the clone method to get the Employee object
        Pokemon empsNew = (Pokemon) emps.clone();
        Pokemon empsNew1 = (Pokemon) emps.clone();
        List<String> list = empsNew.getPkmnList();
        list.add("John");
        List<String> list1 = empsNew1.getPkmnList();
        list1.remove("Pankaj");

        System.out.println("emps List: "+emps.getPkmnList());
        System.out.println("empsNew List: "+list);
        System.out.println("empsNew1 List: "+list1);
    }

}
