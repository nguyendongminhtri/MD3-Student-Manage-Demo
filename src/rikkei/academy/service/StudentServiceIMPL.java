package rikkei.academy.service;

import rikkei.academy.comperator.ConparatorWithName;
import rikkei.academy.model.Students;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StudentServiceIMPL implements IStudentService{
    public static List<Students> studentsList = new ArrayList<>();
    static {
        studentsList.add(new Students(1, "Khoa", 15));
        studentsList.add(new Students(2, "Chã", 14));
        studentsList.add(new Students(3, "nam", 11));
        studentsList.add(new Students(4, "hung", 14));
        studentsList.add(new Students(5, "khiet", 14));
    }
    @Override
    public List<Students> findAll() {
        return studentsList;
    }

    @Override
    public void save(Students students) {
        if (studentsList.get(students.getId()) != null){
            studentsList.get(students.getId()).setName(students.getName());
            studentsList.get(students.getId()).setAge(students.getAge());
        }else {
            studentsList.add(students);
        }

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
        int index = getIdxById(id);
        if (index!=-1)
        studentsList.remove(getIdxById(id));
        else System.out.println("khong tim thay id can xoa");
//        for (int i = 0; i < studentsList.size(); i++) {
//            if(studentsList.get(i).getId()==id){
//                studentsList.remove(id);
//            }
//        }
    }
    int getIdxById(int id){
        for (int i = 0; i < studentsList.size(); i++) {
            if (studentsList.get(i).getId()==id){
                return i;
            }
        }
        return -1;
    }

    @Override
    public List<Students> sortByName() {
        List<Students> listSort = new ArrayList<Students>(studentsList);
        ConparatorWithName conparatorWithName = new ConparatorWithName();
       Collections.sort(listSort,conparatorWithName);
       return listSort;

    }
}
