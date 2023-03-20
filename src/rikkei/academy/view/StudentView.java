package rikkei.academy.view;

import rikkei.academy.config.Config;
import rikkei.academy.controller.StudentController;
import rikkei.academy.model.Students;

import java.util.List;

public class StudentView {
    StudentController studentController = new StudentController();
    List<Students> studentsList = studentController.showListStudent();
    public void showListStudent(){

        System.out.println("===ID===NAME===AGE===");
        for (int i = 0; i < studentsList.size(); i++) {
            System.out.println("   "+studentsList.get(i).getId()+"   "+studentsList.get(i).getName()+"   "+studentsList.get(i).getAge());
        }
        System.out.println("Enter the quit to comeback Menu");
        String quit = Config.scanner().nextLine();
        if(quit.equalsIgnoreCase("quit")){
            new Main();
        }
    }
    public void createNewStudent(){
        while (true){
            int id = studentsList.get(studentsList.size()-1).getId()+1;
            System.out.println("Enter the name: ");
            String name = Config.scanner().nextLine();
            System.out.println("Enter the age");
            int age = Config.scanner().nextInt();
            Students students = new Students(id,name,age);
            studentController.createStudent(students);
            System.out.println("Enter the any key to continue or  quit to comeback Menu");
            String quit = Config.scanner().nextLine();
            if(quit.equalsIgnoreCase("quit")){
                new Main();
            }
        }
    }
}
