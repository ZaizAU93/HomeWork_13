package HomeWork;

import java.util.ArrayList;
import java.util.HashSet;

public class Student {
    public String name;
    public String group;
    public int course;
    private double subjectGrades;


    public double getSubjectGrades() {
        return subjectGrades;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public Student(String name, String group, int course, double subjectGrades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.subjectGrades = subjectGrades;
    }

    //Создать класс Student, содержащий следующие характеристики – имя, группа, курс,
    //оценки по предметам. Создать коллекцию, содержащую объекты класса Student.
    //Написать метод, который удаляет студентов со средним баллом <3. Если средний
    //балл>=3, студент переводится на следующий курс. Дополнительно написать метод
    //printStudents(List<Student> students, int course), который получает список студентов и
    //номер курса. А также печатает на консоль имена тех студентов из списка, которые
    //обучаются на данном курсе.

    public static void delStudent(HashSet<Student> students){
       ArrayList <Student> buf = new ArrayList<>();
        for (Student p: students) {
            if(p.getSubjectGrades() < 3){
                System.out.println("Студент " + p.name+ "обучающийся на " + p.course + " в групппе " + p.group);
                System.out.println("отчислен за не успеваемость, средний бал которого за полугодие " + p.getSubjectGrades());
                buf.add(p);
            } else {
                System.out.println("Студент " + p.name+ "обучающийся на " + p.course + " в групппе " + p.group);
                p.setCourse(p.getCourse()+1);
                System.out.println("переведен на следующий курс " + p.getSubjectGrades());
            }
        }

        students.removeAll(buf);


    }

    public static void printStudents(ArrayList<Student> students, int course){
        for (Student p: students) {
            if (p.course == course){
                System.out.println("Студент " + p.course + " " + p.name);
            }
        }
    }

    public static void printStudents(HashSet<Student> students){
        for (Student p: students) {
                System.out.println(p.name);
            }
        }


}
