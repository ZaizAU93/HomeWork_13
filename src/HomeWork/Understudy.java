package HomeWork;
import java.util.HashSet;
import java.util.Scanner;

public class Understudy {
    public static void main(String[] args) {
        //Пользователь вводит набор чисел в виде одной строки с клавиатуры. Например: "1, 2, 3,
        //4, 4, 5". Избавиться от повторяющихся элементов в строке. Вывести результат на экран.
        //При решении использовать коллекции
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку с цифрами  повторяющимися элементами через пробел: ");
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

