package HomeWork;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Animals animal = new Animals();
        String line;

       do {
           System.out.println("Выберите действие 1 - добавить название животного, 2 - удалить элемент, 3 - выйти из программы, 4- вывести список на экран");
            line = scanner.nextLine();
           if (line.equals("1")){
               System.out.println("Введитеназвание животного");
               animal.animalsArrayList.addFirst(animal.setNameAnimasl(scanner.nextLine()));
           } else if (line.equals("2")){
               System.out.println("Удаляем название животного");
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

