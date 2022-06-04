package com.nitin.demo.myhellowordk8s;/**
 * @author : Nitin Jain
 * @mailto : official.nitinjain@gmail.com
 * @created : 6/3/2022, Friday
 **/

/**
 What this program snippet doing?
 **/
public class Employee {

    private String Name;
    private  int id;
    private String desc;

    public Employee(String name, int id, String desc) {
        Name = name;
        this.id = id;
        this.desc = desc;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "Name='" + Name + '\'' +
                ", id=" + id +
                ", desc='" + desc + '\'' +
                '}';
    }
}
