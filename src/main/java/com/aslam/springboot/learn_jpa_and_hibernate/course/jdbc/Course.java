package com.aslam.springboot.learn_jpa_and_hibernate.course.jdbc;

public class Course {
    private long id;
    private String name;
    private String author;

    public Course() {
    }

    public Course(long id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Course{" +
                "author='" + author + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
