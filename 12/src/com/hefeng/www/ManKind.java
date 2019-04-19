package com.hefeng.www;

public class ManKind {

    private int gender; // 性别
    private int salary; // 薪资

    public ManKind() {

    }

    public ManKind(int gender, int salary) {
        this.gender = gender;
        this.salary = salary;
    }

    public void manOrWoman() {
        if (gender == 1) {
            System.out.println("man");
        } else if (gender == 0) {
            System.out.println("woman");
        }
    }

    public void employed() {
        if (salary == 0) {
            System.out.println("no job");
        } else {
            System.out.println("job");
        }
    }
}
