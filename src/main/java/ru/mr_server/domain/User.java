package ru.mr_server.domain;

import javax.persistence.*;

/**
 * Created by HEDIN on 10.07.2014.
 */
@Entity
@Table(name = "users")
@NamedQueries({
        @NamedQuery(name = "findAllUsers", query = "select u from User u"),
        @NamedQuery(name = "findUserByLoginPassword", query = "select u from User u where u.login = :login and u.password = :pass")
})
public class User {
    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "login")
    private String login;
    @Column(name = "password")
    private String password;
    @Column(name = "fio")
    private String fio;

    public User() {
    }

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }
}
