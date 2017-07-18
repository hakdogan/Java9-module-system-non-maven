package com.kodcu.user;

/**
 * Created by hakdogan on 18/07/2017.
 */
public class User {

    private String firstName;
    private String lastName;
    private String rofession;
    private int age;

    public User(){}

    public User(String firstName, String lastName, String rofession, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.rofession = rofession;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRofession() {
        return rofession;
    }

    public void setRofession(String rofession) {
        this.rofession = rofession;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", rofession='" + rofession + '\'' +
                ", age=" + age +
                '}';
    }
}
