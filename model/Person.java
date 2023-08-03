
package model;


public class Person {
    private String ID, name, phone, address;

    public Person(String ID, String name, String phone, String address) {
        this.ID = ID;
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" + "ID=" + ID + ", name=" + name + ", phone=" + phone + ", address=" + address + '}';
    }
    
    
    
}
