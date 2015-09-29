package ru.mr_server.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "routes")
@NamedQueries({
//        @NamedQuery(name = "findAllUsers", query = "select u from User u"),
//        @NamedQuery(name = "findUserByLoginPassword", query = "select u from User u where u.login = :login and u.password = :pass")
})
public class Route {
    @Id
    @Column(name = "route_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int route_id;

    @Column(name = "user_id")
    private int user_id;

    @Column(name="start_time")
    private int start_time;

    @Column(name = "end_time")
    private int end_time;

    @Column(name = "user_type")
//    driver, passenger или any
    private String user_type;

    @OneToMany(mappedBy = "route", cascade = CascadeType.ALL)
    private List<RouteStep> steps;

    public Route() {
    }

    public int getRoute_id() {
        return route_id;
    }

    public List<RouteStep> getSteps() {
        return steps;
    }

    public void setSteps(List<RouteStep> steps) {
        this.steps = steps;
    }

    public String getUser_type() {
        return user_type;
    }

    public void setUser_type(String user_type) {
        this.user_type = user_type;
    }

    public int getEnd_time() {
        return end_time;
    }

    public void setEnd_time(int end_time) {
        this.end_time = end_time;
    }

    public int getStart_time() {
        return start_time;
    }

    public void setStart_time(int start_time) {
        this.start_time = start_time;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public void setRoute_id(int route_id) {
        this.route_id = route_id;
    }
}
