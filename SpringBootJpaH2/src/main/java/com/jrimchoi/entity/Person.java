package com.jrimchoi.entity;

import com.sun.javafx.beans.IDProperty;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Person {
    @Id
    @GeneratedValue
    @Column(name="id",nullable=false)
    private Integer id;
    private String name;
}
