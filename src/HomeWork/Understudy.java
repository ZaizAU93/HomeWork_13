package HomeWork;
import java.util.HashSet;
import java.util.Scanner;

public class Understudy {
    public static void main(String[] args) {
        //������������ ������ ����� ����� � ���� ����� ������ � ����������. ��������: "1, 2, 3,
        //4, 4, 5". ���������� �� ������������� ��������� � ������. ������� ��������� �� �����.
        //��� ������� ������������ ���������
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ������ � �������  �������������� ���������� ����� ������: ");
        String line = scanner.nextLine();

        String[] mas = line.split(" ");
        HashSet <String> result = new HashSet<>();
        int i = 0;

        while (i != mas.length){
            result.add(mas[i]);
            i++;
        }

         for (String p: result){
            System.out.print(p + " ");
            }

    }



    }

