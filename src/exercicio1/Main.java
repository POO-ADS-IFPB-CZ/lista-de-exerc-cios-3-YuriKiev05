package src.exercicio1;

import java.util.ArrayList;
//MAIN GERADO POR INTELIGENCIA ARTIFICAL! *o resto foi feito por mim
public class Main {
    public static void main(String[] args) {
        // Cria alunos
        Student s1 = new Student("Yuri", "123", new double[]{});
        s1.registerGrades(8);
        s1.registerGrades(7);
        s1.registerGrades(9);

        Student s2 = new Student("Ana", "456", new double[]{});
        s2.registerGrades(5);
        s2.registerGrades(6);

        Student s3 = new Student("Carlos", "789", new double[]{});
        s3.registerGrades(7);
        s3.registerGrades(7);
        s3.registerGrades(6);
        s3.registerGrades(5);
        s3.registerGrades(10); // Excedendo limite, mensagem aparecerá

        // Cria lista de alunos
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);

        // Cria turma
        Turma turma = new Turma(studentList);

        // Imprime aprovados
        System.out.println("Aprovados:");
        turma.approved();

        // Imprime reprovados
        System.out.println("\nReprovados:");
        turma.failed();
    }
}
