
package beans;

public class User {
    private String name;
    private String surname;
    private boolean edit;
    
    public User(String name,String surname){
        this.name = name;
        this.surname = surname;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }
    
    public String getSurname(){
        return surname;
    }

    public void setEdit(boolean edit){
        this.edit = edit;
    }
    
    public boolean getEdit(){
        return edit;
    }
    
}
