package org.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Watch {
    @Id
    private int w_id;
    private String w_brand;
    private String price;

    @ManyToOne
    @JoinColumn(name = "Student_id")
    private Student student;  //owner end
    public int getW_id() {
        return w_id;
    }
    public void setW_id(int w_id) {
        this.w_id = w_id;

    }
    public String getW_brand() {
        return w_brand;
    }
    public void setW_brand(String w_brand) {
        this.w_brand = w_brand;
    }
    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }
    public Student getStudent() {
        return student;
    }
    public void setStudent(Student student) {
        this.student = student;
    }
        public Watch(int w_id, String w_brand, String price, Student student) {
        this.w_id = w_id;
        this.w_brand = w_brand;
        this.price = price;
        this.student = student;


        }
        public Watch() {}
}
