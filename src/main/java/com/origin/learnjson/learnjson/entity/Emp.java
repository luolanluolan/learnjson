package com.origin.entity;

/**
 * @Author luolan
 * @Description TODO
 * @Date 2020/3/10 16:12
 **/
public class Emp {
    private String eName;
    private String eSex;

    public Emp() {
    }

    public Emp(String eName, String eSex) {
        this.eName = eName;
        this.eSex = eSex;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public String geteSex() {
        return eSex;
    }

    public void seteSex(String eSex) {
        this.eSex = eSex;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "eName='" + eName + '\'' +
                ", eSex='" + eSex + '\'' +
                '}';
    }
}
