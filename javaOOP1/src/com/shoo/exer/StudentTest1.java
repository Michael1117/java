package com.shoo.exer;

public class StudentTest1 {
    public static void main(String[] args) {
        Student1[] stus = new Student1[20];

        for (int i = 0; i < stus.length; i++) {
            stus[i] = new Student1();

            stus[i].number = (i + 1);
            stus[i].state = (int) (Math.random() * (6) + 1);
            stus[i].score = (int) (Math.random() * 101);

        }

        StudentTest1 test = new StudentTest1();

        test.print(stus);

        System.out.println("*************************");

        test.searchState(stus, 3);

        System.out.println("*************************");

        test.sort(stus);
        System.out.println("*************************");
        test.print(stus);
    }

    public void print(Student1[] stus) {
        for (int i = 0; i < stus.length; i++) {
            System.out.println(stus[i].info());
        }
    }

    public void searchState(Student1[] stus, int state) {
        for (int i = 0; i < stus.length; i++) {
            if (stus[i].state == state) {
                System.out.println(stus[i].info());
            }
        }
    }

    public void sort(Student1[] stus) {
        for (int i = 0; i < stus.length - 1; i++) {
            for (int j = 0; j < stus.length - 1 - i; j++) {
                if (stus[j].score > stus[j + 1].score) {
                    Student1 temp = stus[j + 1];
                    stus[j + 1] = stus[j];
                    stus[j] = temp;
                }
            }
        }
    }
}

class Student1 {
    int number;
    int state;
    int score;

    public String info() {
        return "学号：" + number + "，年级：" + state + "，成绩" + score;
    }
}
