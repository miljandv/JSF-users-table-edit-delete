package controllers;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.ArrayList;
import java.io.Serializable;
import javax.faces.model.SelectItem;
import java.util.ArrayList;
import java.util.List;
import beans.User;
import java.util.HashMap;
import java.util.LinkedHashMap;

@ManagedBean
@SessionScoped
public class MyController implements Serializable{
    
    public MyController(){
        fill_users();
    }
    private int sel_num;

    public int getSel_num(){
        return sel_num;
    }
    
    public void setSel_num(int sel_num){
        this.sel_num = sel_num;
    }
    
    private String sel_1;

    public String getSel_1(){
        return sel_1;
    }
    
    public void setSel_1(String sel_1){
        this.sel_1 = sel_1;
    }
    

    private SelectItem[] numbers = new SelectItem[]{
        new SelectItem(1,"one"),
        new SelectItem(2,"two"),
        new SelectItem(3,"three")
    };

    public SelectItem[] getNumbers(){
        return numbers;
    }

    public void setNumbers(SelectItem[] numbers){
        this.numbers = numbers;
    }

    private ArrayList<String> numlist = new ArrayList<String>(){
        {
            add("one");
            add("two");
            add("three");
        }
    };

    public ArrayList<String> getNumlist(){
        return numlist;
    }
    
    public void setNumlist(ArrayList<String> numlist){
        this.numlist = numlist;
    }
    
    private List<SelectItem> stuff;

    public List<SelectItem> getStuff(){
        return stuff;
    }
    
    public void setStuff(List<SelectItem> stuff){
        this.stuff = stuff;
    }

    public void fill_stuff(){
        stuff =  new ArrayList<SelectItem>(){
            {
                add(new SelectItem(1,"stuff_1"));
                add(new SelectItem(2,"stuff_2"));
                add(new SelectItem(3,"stuff_3"));
                add(new SelectItem(4,"stuff_4"));
            }
        };
        numlist.add("four");
    }
    private String sel_stuff;

    public void setSel_stuff(String set_stuff){
        this.sel_stuff = sel_stuff;
    }
    
    public String getSel_stuff(){
        return sel_stuff;
    }

    private List<User> users = new ArrayList<User>();

    public void setUsers(List<User> users){
        this.users = users;
    }
    
    public List<User> getUsers(){
        return users;
    }

    public void fill_users(){
        users.add(new User("Petar","Peric"));
        users.add(new User("Zetar","Zeric"));
        users.add(new User("Metar","Meric"));
    }

    private List<String> sel_users;

    public void setSel_users(List<String> sel_users){
        this.sel_users = sel_users;
    }
    
    public List<String> getSel_users(){
        return sel_users;
    }
    
    private HashMap<String,String> map = new LinkedHashMap<String,String>();

    public void setMap(HashMap<String,String> map){
        this.map = map;
    }
    
    public HashMap<String,String> getMap(){
        return map;
    }

    public void fill_map(){
        map.put("k1","v1");
        map.put("k2","v2");
        map.put("k3","v3");
    }

    public void delete(User user){
        users.remove(user);
    }
}






