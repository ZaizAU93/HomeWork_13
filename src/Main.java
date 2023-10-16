import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        //������ 1:
        //1.1 ������� ��������� ArrayList ����� ����.
        //1.2 �������� � ����� c����� 3 ������, ������� ��������� � �������.
        //1.3 �������� 2-� �������.
        //1.4 ������� ��� �� �������.
        //1.5 ������� ����� ������� �� ��������.
        //1.6 ������ ������ ������ ��������.
        //1.7 ���������, ���������� �� ������� � ��������� (�����)
        ArrayList<String> lanWorld = new ArrayList<>();
        lanWorld.add("��������");
        lanWorld.add("�������");
        lanWorld.add("����������");
        System.out.println(lanWorld);

        lanWorld.set(1, "������");
        System.out.println(lanWorld);
        lanWorld.remove(2);
        System.out.println(lanWorld);
        lanWorld.remove("��������");
        System.out.println(lanWorld);

        lanWorld.add("�������");
        lanWorld.add("�����");
        System.out.print(lanWorld.indexOf("������ - "));
        if (lanWorld.contains("������") == true) {
            System.out.println("������� ������� ����������");
        }
        ;

        //������ 2:
        //2.1 ������� ���������� ������ ����� ����.
        //2.2 �������� � ����� ������ 4 ������ ( 2 � ������ � 2 � �����), ������� ��������� �
        //������� (������������ ������ addFirst/addLast).
        //2.3 ������� �� ������ �������� �� ������ � �� ����� ������.
        //2.4 �������� �� ������ �������� �� ������ � �� ����� ������.

        LinkedList<String> lanWorldLinked = new LinkedList<>();
        lanWorldLinked.add("������");
        lanWorldLinked.add("��������");
        lanWorldLinked.add("������");
        lanWorldLinked.add("����������");
        System.out.println(lanWorldLinked);
        lanWorldLinked.addFirst("������");
        lanWorldLinked.addFirst("���������");
        lanWorldLinked.addLast("���������");
        lanWorldLinked.addLast("��������");
        System.out.println(lanWorldLinked);
        lanWorldLinked.removeFirst();
        lanWorldLinked.removeLast();
        System.out.println(lanWorldLinked);
        System.out.println(lanWorldLinked);
        System.out.println("������ ������� ������������ ������ - " + lanWorldLinked.getFirst());
        System.out.println("��������� ������� ������������ ������ - " + lanWorldLinked.getLast());

        System.out.println("------------------------3 ������� ----------");

        HashSet<Person> person = new HashSet<>();
        person.add(new Person("�����", 15));
        person.add(new Person("�������", 16));
        person.add(new Person("�������", 17));
        person.add(new Person("����", 17));
        person.add(new Person("����", 17));

        for (Person s : person) {
            System.out.println(s.getName() + " " + s.getAge());

        }

        System.out.println("------------------------- ����� �������� -----------");



        String nameToDelete = "�������";

        Person poisk = null;
        for (Person p : person) {
            if (p.getName().equals(nameToDelete)) {
                poisk = (Person) p;
            }
        }

        person.remove(poisk);


        for (Person s : person) {
            System.out.println(s.getName() + " " + s.getAge());

        }
        System.out.println("------------------------- 4 ������������ ������� -----------");

        Storage <String> strings = new Storage();
        Storage <Person> pers = new Storage<Person>();
        Storage <Integer> number = new Storage<>();

        strings.setValue("������");
        pers.setValue(poisk);
        number.setValue(14);
        System.out.println("��������� ��������: " + strings.getValue());
        System.out.println("��������� ��������: " + number.getValue());
        System.out.println("������: " + pers.getValue().getName());


    }


    }
