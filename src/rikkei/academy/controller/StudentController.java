package rikkei.academy.controller;

import rikkei.academy.model.Students;
import rikkei.academy.service.IStudentService;
import rikkei.academy.service.StudentServiceIMPL;

import java.util.List;

public class StudentController {
    IStudentService studentService = new StudentServiceIMPL();
    public List<Students> showListStudent(){
        return studentService.findAll();
    }
    public void createStudent(Students students){
        studentService.save(students);
    }
}
