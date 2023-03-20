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
    public void sort(){
       List<Students> listSort = studentController.sortByName();
        System.out.println("===ID===NAME===AGE===");
        for (int i = 0; i < listSort.size(); i++) {
            System.out.println("   "+listSort.get(i).getId()+"   "+listSort.get(i).getName()+"   "+listSort.get(i).getAge());
        }
        System.out.println("Enter the quit to comeback Menu");
        String quit = Config.scanner().nextLine();
        if(quit.equalsIgnoreCase("quit")){
            new Main();
        }
    }
    public void delete(){
        System.out.println("nhap id muon xoa: ");
        int idDel = Config.scanner().nextInt();
        studentController.delete(idDel);
        for (int i = 0; i < studentsList.size(); i++) {
            System.out.println("   "+studentsList.get(i).getId()+"   "+studentsList.get(i).getName()+"   "+studentsList.get(i).getAge());
        }
        System.out.println("Enter the quit to comeback Menu");
        String quit = Config.scanner().nextLine();
        if(quit.equalsIgnoreCase("quit")){
            new Main();
        }
    }
    public void update(){
        System.out.println("nhap id muon sua: ");
        int idUp = Config.scanner().nextInt();
        System.out.println("nhap ten muon sua: ");
        String nameUp = Config.scanner().nextLine();
        System.out.println("nhap tuoi muon sua: ");
        int ageUp = Config.scanner().nextInt();
        Students studentUp= new Students(idUp,nameUp,ageUp);
        studentController.update(studentUp);
        for (int i = 0; i < studentsList.size(); i++) {
            System.out.println("   "+studentsList.get(i).getId()+"   "+studentsList.get(i).getName()+"   "+studentsList.get(i).getAge());
        }
        System.out.println("Enter the quit to comeback Menu");
        String quit = Config.scanner().nextLine();
        if(quit.equalsIgnoreCase("quit")){
            new Main();
        }
    }
    public void detail(){
        System.out.println("nhap id muon xem: ");
        int id = Config.scanner().nextInt();
       Students students =  studentController.detail(id);
        System.out.println(students);
        System.out.println("Enter the quit to comeback Menu");
        String quit = Config.scanner().nextLine();
        if(quit.equalsIgnoreCase("quit")){
            new Main();
        }
    }
}
