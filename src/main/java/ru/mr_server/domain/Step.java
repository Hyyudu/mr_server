package ru.mr_server.domain;

import javax.persistence.*;

@Entity
@Table(name = "steps")
@NamedQueries({
//        @NamedQuery(name = "findAllUsers", query = "select u from User u"),
//        @NamedQuery(name = "findUserByLoginPassword", query = "select u from User u where u.login = :login and u.password = :pass")
})
public class Step {
    @Id
    @Column(name = "step_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

//    Широта и долгота точки старта
    @Column(name = "start_lat")
    private float start_lat;

    @Column(name = "start_lng")
    private float start_lng;

//    Широта и долгота точки финиша
    @Column(name = "end_lat")
    private float end_lat;

    @Column(name = "end_lng")
    private float end_lng;

    @Column(name = "start_address")
    private String start_address;

    @Column(name = "end_address")
    private String end_address;

    @Column(name = "length_meters")
    private float length_meters;

    @Column(name = "duration_seconds")
    private float duration_seconds;

    public Step() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
