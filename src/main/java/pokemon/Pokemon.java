package pokemon;

import java.util.ArrayList;
import java.util.List;

public class Pokemon implements Cloneable{

    private List<String> pkmnList;

    public Pokemon(){
        pkmnList = new ArrayList<String>();
    }

    public Pokemon(List<String> list){
        this.pkmnList =list;
    }
    public void loadData(){
        //read all employees from database and put into the list
        pkmnList.add("Pankaj");
        pkmnList.add("Raj");
        pkmnList.add("David");
        pkmnList.add("Lisa");
    }

    public List<String> getPkmnList() {
        return pkmnList;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        List<String> temp = new ArrayList<String>();
        for(String s : this.getPkmnList()){
            temp.add(s);
        }
        return new Pokemon(temp);
    }

}