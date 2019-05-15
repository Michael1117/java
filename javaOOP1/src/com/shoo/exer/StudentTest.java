package com.shoo.exer;

public class StudentTest {
    public static void main(String[] args) {


        // 声明Student类型的数组
        Student[] stus = new Student[20];

        for (int i = 0; i < stus.length; i++) {
            stus[i] = new Student();
            stus[i].number = (i + 1);
            stus[i].state = (int) (Math.random() * (6 - 1 + 1) + 1);
            stus[i].score = (int) (Math.random() * (100 - 0 + 1));
        }


        for (int i = 0; i < stus.length; i++) {
            System.out.println(stus[i].info());
        }

        System.out.println("-------------------------");
        /*for (int i = 0; i < stus.length; i++) {
            if(stus[i].state == 3) {
                System.out.println(stus[i].info());
            }
        }*/

        for (int i = 0; i < stus.length - 1; i++) {
            for (int j = 0; j < stus.length - 1 - i; j++) {
                if (stus[j].score > stus[j + 1].score) {
                    Student temp = stus[j+1];
                    stus[j+1] = stus[j];
                    stus[j] = temp;
                }
            }
        }

        for (int i = 0; i < stus.length; i++) {
            System.out.println(stus[i].info());
        }
    }
}


class Student {

    int number;
    int state;
    int score;

    public String info() {
        return "学号：" + number + "，年级" + state + "，成绩" + score;
    }
}