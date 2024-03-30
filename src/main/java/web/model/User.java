package web.model;

import org.springframework.stereotype.Component;

import javax.persistence.*;


//@Component
@Entity
@Table (name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    int id;
    @Column (name = "Name")
    private String name;
    @Column(name = "Surname")
    private String surName;
    @Column(name = "Age")
    private byte age;
    @Column(name = "City")
    private String city;

    public User() {
    }

    public User(String name, String surName, byte age, String city) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }
}
