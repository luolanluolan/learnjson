package com.origin.entity;

/**
 * @Author luolan
 * @Description TODO
 * @Date 2020/3/9 19:17
 **/
public class Teacher {
    private String tName;
    private String tSex;
    private int tAge;

    public Teacher() {
    }

    public Teacher(String tName, String tSex) {
        this.tName = tName;
        this.tSex = tSex;
    }

    public Teacher(String tName, String tSex, int tAge) {
        this.tName = tName;
        this.tSex = tSex;
        this.tAge = tAge;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public String gettSex() {
        return tSex;
    }

    public void settSex(String tSex) {
        this.tSex = tSex;
    }

    public int gettAge() {
        return tAge;
    }

    public void settAge(int tAge) {
        this.tAge = tAge;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "tName='" + tName + '\'' +
                ", tSex='" + tSex + '\'' +
                '}';
    }
}
