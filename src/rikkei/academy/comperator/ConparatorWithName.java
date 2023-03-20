package rikkei.academy.comperator;

import rikkei.academy.model.Students;

import java.util.Comparator;

public class ConparatorWithName implements Comparator<Students> {
    @Override
    public int compare(Students o1, Students o2) {
        int temp = o1.getName().compareTo(o2.getName());
        if (temp!=0){
            return temp;
        }
        return temp;
    }
}
