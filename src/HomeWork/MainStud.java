package HomeWork;

import java.util.ArrayList;
import java.util.HashSet;

public class MainStud {
    public static void main(String[] args) {

        HashSet <Student> students = new HashSet<Student>();
            students.add(new Student("����� ����������", "3f", 3,3.6));
            students.add(new Student("���� �", "3f", 3,2.3));
            students.add(new Student("����� �����", "3f", 3,3.6));
            students.add(new Student("���� ���", "3f", 3,2.6));
            students.add(new Student("����� ���������", "3�", 3,4.6));
            students.add(new Student("����� ���������", "3�", 3,3.6));
            students.add(new Student("���� ���", "3f", 3,1.6));

            Student.printStudents(students);
            Student.delStudent(students);
            System.out.println("����� �������� ");
             Student.printStudents(students);
            ArrayList <Student> arrStudents = new ArrayList<>(students);
            Student.printStudents(arrStudents, 3);


        };
    }

