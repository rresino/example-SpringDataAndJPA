package com.rresino.example.config.com.rresino.example.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by rresino on 20/09/2016.
 */
@Entity
@Table(name="home")
public class Home {

    @Id
    @GeneratedValue
    public int id;

    public String name;

}
