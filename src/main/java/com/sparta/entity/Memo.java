package com.sparta.entity;

import jakarta.persistence.*;


@Entity

@Table(name = "memo")
public class Memo {
    @Id
    private Long id;

    @Column(name = "username", nullable = false, unique = true)
    private String username;


    @Column(name = "contents", nullable = false, length = 500)
    private String contents;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }
}