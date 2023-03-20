package rikkei.academy.service;

import rikkei.academy.model.Students;

import java.util.ArrayList;
import java.util.List;

public class StudentServiceIMPL implements IStudentService{
    public static List<Students> studentsList = new ArrayList<>();
    static {
        studentsList.add(new Students(1, "Khoa", 15));
        studentsList.add(new Students(2, "Chã", 14));
    }
    @Override
    public List<Students> findAll() {
        return studentsList;
    }

    @Override
    public void save(Students students) {
        studentsList.add(students);
    }

    @Override
    public Students findById(int id) {
        for (int i = 0; i < studentsList.size(); i++) {
            if(studentsList.get(i).getId()==id){
                return studentsList.get(i);
            }
        }
        return null;
    }

    @Override
    public void deleteById(int id) {
        for (int i = 0; i < studentsList.size(); i++) {
            if(studentsList.get(i).getId()==id){
                studentsList.remove(id);
            }
        }
    }
}
