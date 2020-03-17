package com.origin.entity;

import java.util.List;

/**
 * @Author luolan
 * @Description TODO
 * @Date 2020/3/10 19:59
 **/
public class ProposalInfoUtil {
    private Teacher itemList;
    private Student kindList;
    private List<Emp> empList;

    public ProposalInfoUtil() {
    }

    public ProposalInfoUtil(Teacher itemList, Student kindList) {
        this.itemList = itemList;
        this.kindList = kindList;
    }

    public Teacher getItemList() {
        return itemList;
    }

    public void setItemList(Teacher itemList) {
        this.itemList = itemList;
    }

    public Student getKindList() {
        return kindList;
    }

    public void setKindList(Student kindList) {
        this.kindList = kindList;
    }

    public List<Emp> getEmpList() {
        return empList;
    }

    public void setEmpList(List<Emp> empList) {
        this.empList = empList;
    }

    @Override
    public String toString() {
        return "ProposalInfoUtil{" +
                "itemList=" + itemList +
                ", kindList=" + kindList +
                ", empList=" + empList +
                '}';
    }
}
