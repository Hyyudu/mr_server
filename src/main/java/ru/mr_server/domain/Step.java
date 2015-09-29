package ru.mr_server.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "steps")
@NamedQueries({
//        @NamedQuery(name = "findAllUsers", query = "select u from User u"),
//        @NamedQuery(name = "findUserByLoginPassword", query = "select u from User u where u.login = :login and u.password = :pass")
})
public class Step {
    @Id
    @Column(name = "step_id")
//    По факту это хэш, выдаваемый Гуглом
    private String id;

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

    //    Адрес старта и финиша
    @Column(name = "start_address")
    private String start_address;

    @Column(name = "end_address")
    private String end_address;

    //    Длина отрезка в метрах
    @Column(name = "length_meters")
    private float length_meters;

    //    Длительность прохождения в секундах
    @Column(name = "duration_seconds")
    private float duration_seconds;

    public Step() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getStart_lat() {
        return start_lat;
    }

    public void setStart_lat(float start_lat) {
        this.start_lat = start_lat;
    }

    public float getStart_lng() {
        return start_lng;
    }

    public void setStart_lng(float start_lng) {
        this.start_lng = start_lng;
    }

    public float getEnd_lat() {
        return end_lat;
    }

    public void setEnd_lat(float end_lat) {
        this.end_lat = end_lat;
    }

    public float getEnd_lng() {
        return end_lng;
    }

    public void setEnd_lng(float end_lng) {
        this.end_lng = end_lng;
    }

    public String getStart_address() {
        return start_address;
    }

    public void setStart_address(String start_address) {
        this.start_address = start_address;
    }

    public String getEnd_address() {
        return end_address;
    }

    public void setEnd_address(String end_address) {
        this.end_address = end_address;
    }

    public float getLength_meters() {
        return length_meters;
    }

    public void setLength_meters(float length_meters) {
        this.length_meters = length_meters;
    }

    public float getDuration_seconds() {
        return duration_seconds;
    }

    public void setDuration_seconds(float duration_seconds) {
        this.duration_seconds = duration_seconds;
    }

}
