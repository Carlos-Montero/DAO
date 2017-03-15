package eetac.upc;

/**
 * Created by Carlos on 15/03/2017.
 */
public class User extends DAO{
    private int id;
    private String name;
    private String birthday;

    public User(int id, String name,String birthday) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {

        this.birthday = birthday;
    }
}
