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

    //������� ����� Student, ���������� ��������� �������������� � ���, ������, ����,
    //������ �� ���������. ������� ���������, ���������� ������� ������ Student.
    //�������� �����, ������� ������� ��������� �� ������� ������ <3. ���� �������
    //����>=3, ������� ����������� �� ��������� ����. ������������� �������� �����
    //printStudents(List<Student> students, int course), ������� �������� ������ ��������� �
    //����� �����. � ����� �������� �� ������� ����� ��� ��������� �� ������, �������
    //��������� �� ������ �����.

    public static void delStudent(HashSet<Student> students){
       ArrayList <Student> buf = new ArrayList<>();
        for (Student p: students) {
            if(p.getSubjectGrades() < 3){
                System.out.println("������� " + p.name+ "����������� �� " + p.course + " � ������� " + p.group);
                System.out.println("�������� �� �� ������������, ������� ��� �������� �� ��������� " + p.getSubjectGrades());
                buf.add(p);
            } else {
                System.out.println("������� " + p.name+ "����������� �� " + p.course + " � ������� " + p.group);
                p.setCourse(p.getCourse()+1);
                System.out.println("��������� �� ��������� ���� " + p.getSubjectGrades());
            }
        }

        students.removeAll(buf);


    }

    public static void printStudents(ArrayList<Student> students, int course){
        for (Student p: students) {
            if (p.course == course){
                System.out.println("������� " + p.course + " " + p.name);
            }
        }
    }

    public static void printStudents(HashSet<Student> students){
        for (Student p: students) {
                System.out.println(p.name);
            }
        }


}
