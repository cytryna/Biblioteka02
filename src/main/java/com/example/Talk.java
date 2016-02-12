package com.example;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by radek on 10.02.2016.
 */
@Entity
public class Talk {

    @Id
    @GeneratedValue
    private Integer id;

    private String topic;

    public Integer getId() {
        return id;
    }

    public String getTopic() {
        return topic;
    }
}
