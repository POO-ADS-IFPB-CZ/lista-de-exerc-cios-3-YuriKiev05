package src.exercicio1;

import java.util.ArrayList;

public class Turma {
    private ArrayList<Student> students = new ArrayList<>();

    public Turma(ArrayList<Student> students) {
        this.students = students;
    }

    public void approved(){
        for(Student student : students){
            if(student.isApproved()) System.out.println(student.getName());
        }
    }

    public void failed(){
        for(Student student : students){
            if(!student.isApproved()) System.out.println(student.getName());
        }
    }
}
