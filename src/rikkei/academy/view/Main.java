package rikkei.academy.view;

import rikkei.academy.config.Config;

import java.util.Scanner;

public class Main {
    public Main(){
        System.out.println("******************STUDENT MANAGE**********************");
        System.out.println("1. Show List Student ");
        System.out.println("2. Create Student");
        System.out.println("3. Update Student By ID");
        System.out.println("4. Delete Student By ID");
        System.out.println("5. Detail Student By ID");
        System.out.println("6. Sort Student By Name");
        int chooseMenu = Config.scanner().nextInt();
        switch (chooseMenu){
            case 1:
                new StudentView().showListStudent();
                break;
            case 2:
                new StudentView().createNewStudent();
                break;
        }
    }
    public static void main(String[] args) {
        new Main();
    }
}