package HomeWork;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Animals animal = new Animals();
        String line;

       do {
           System.out.println("�������� �������� 1 - �������� �������� ���������, 2 - ������� �������, 3 - ����� �� ���������, 4- ������� ������ �� �����");
            line = scanner.nextLine();
           if (line.equals("1")){
               System.out.println("��������������� ���������");
               animal.animalsArrayList.addFirst(animal.setNameAnimasl(scanner.nextLine()));
           } else if (line.equals("2")){
               System.out.println("������� �������� ���������");
               animal.del();
           } else if (line.equals("4")){
               for (String p: animal.animalsArrayList) {
                   System.out.print(p + " ");
               }
               System.out.println();
           }
       }while(!line.equals("3"));


        }
    }

