package eetac.upc;

/**
 * Created by Carlos on 15/03/2017.
 */
public class Office extends DAO{
    private String name;
    private String address;

    public Office(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
