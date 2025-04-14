package com.springbootprocessunicodewithmysql.demo.model;


import jakarta.persistence.*;

@Entity
@Table(name = "userstable")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", columnDefinition="int", nullable = false)
    private Integer id = null;

    @Column(name = "displayname", columnDefinition="varchar(60)", unique = false, nullable = false)
    private String displayname;

    @Column(name = "lastname", columnDefinition="varchar(60)", unique = false, nullable = false)
    private String lastname;

    @Column(name = "firstname", columnDefinition="varchar(60)", unique = false, nullable = false)
    private String firstname;

    public User (){}

    public User (String displayname, String lastname, String firstname){
        this.displayname = displayname;
        this.lastname = lastname;
        this.firstname = firstname;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDisplayname(String displayname){
        this.displayname = displayname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }


    public int getId() { return id; }

    public String getDisplayname() {
        return displayname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getFirstname() {
        return firstname;
    }


    public String toString(){
        return this.getId() + "|" +
                this.getDisplayname() + "|" +
                this.getLastname() + "|" +
                this.getFirstname() ;
    }

}
