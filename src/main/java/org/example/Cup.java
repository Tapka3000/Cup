package org.example;

public class Cup {
    public static void main(String[] args) {
        int cup = 200;
        double procent = 0.5;
        double polovina = cup * procent;
        System.out.println("Объем стакана " + cup + " мл");
        System.out.println("Стакан заполнен на " + procent + " из 1");
        System.out.println("Стакан заполнен на " + polovina + " мл");
    }
}
