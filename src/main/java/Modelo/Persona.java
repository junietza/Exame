/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import java.io.Serializable;
import java.time.LocalDate;
/**
 *
 * @author Sistemas-23
 */
public class Persona implements Serializable{
    private int personId;
    private String namefirst;
    private String namesecond;
    private String lastnameone;
    private String lastnametwo;
    private LocalDate birthDay;
    private int age;
    private int experience;
    private int money;

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getNamefirst() {
        return namefirst;
    }

    public void setNamefirst(String namefirst) {
        this.namefirst = namefirst;
    }

    public String getNamesecond() {
        return namesecond;
    }

    public void setNamesecond(String namesecond) {
        this.namesecond = namesecond;
    }

    public String getLastnameone() {
        return lastnameone;
    }

    public void setLastnameone(String lastnameone) {
        this.lastnameone = lastnameone;
    }

    public String getLastnametwo() {
        return lastnametwo;
    }

    public void setLastnametwo(String lastnametwo) {
        this.lastnametwo = lastnametwo;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
    
    public String toString() {
        return "Person{" + "personId=" + personId + ", name=" + namefirst+
       " + namesecond=" +namesecond
                + ", lastNameone" + lastnameone + ", lastnametwo" + lastnametwo
                + ", birthDay" + birthDay + ", age=" + age
                + ", money" + money + ", experience" + experience+ '}';
                
    }

}
