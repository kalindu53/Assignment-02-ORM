package org.example;


import org.example.config.FactoryConfiguration;
import org.example.entity.Student;
import org.example.entity.Watch;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        Watch watch = new Watch();
        watch.setW_id(1);
        watch.setW_brand("brand1");
        watch.setPrice("1200");

       Watch watch1= new Watch();
       watch1.setW_id(2);
       watch1.setW_brand("brand2");
       watch1.setPrice("1500");

        Student student = new Student();
        List<Watch> watchList = new ArrayList<>();
        watchList.add(watch);
        watchList.add(watch1);
        student.setS_id(1);
        student.setS_name("kamal");
        student.setAddress("panadura");

        watch.setStudent(student);
        watch1.setStudent(student);
        session.save(watch);
        session.save(watch1);
        session.save(student);
        transaction.commit();
        session.close();


    }
}