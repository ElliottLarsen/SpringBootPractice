package com.example.CRUD.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

// Table name is same as the class name.
@Entity
public class Article {
    // @Id annotation notes that this is an ID.
    // @GeneratedVale annotation notes that this value is created automatically.
    @Id
    @GeneratedValue
    private Long id;

    // Creates a column.
    @Column
    private String title;

    @Column
    private String content;
}
