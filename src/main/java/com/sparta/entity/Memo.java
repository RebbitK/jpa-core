package com.sparta.entity;

import jakarta.persistence.*;


@Entity

@Table(name = "memo")
public class Memo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username", nullable = false, unique = true)
    private String username;


    @Column(name = "contents", nullable = false, length = 500)
    private String contents;
}