package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;
@Entity
public class Student {
    @Id
    private int s_id;
    private String s_name;
    private String address;
    @OneToMany(mappedBy = "student") //inverst end
    private List<Watch> watchList;
    public Student() {

    }
    public Student(int s_id, String s_name, String address) {
        this.s_id = s_id;
        this.s_name = s_name;
        this.address = address;

    }
    public int getS_id() {
        return s_id;
    }
    public void setS_id(int s_id) {
        this.s_id = s_id;
    }
    public String getS_name() {
        return s_name;
    }
    public void setS_name(String s_name) {
        this.s_name = s_name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public List<Watch> getWatchList() {
        return watchList;
    }
    public void setWatchList(List<Watch> watchList) {
        this.watchList = watchList;
    }






}
