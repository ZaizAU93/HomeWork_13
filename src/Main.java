import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        //Задача 1:
        //1.1 Создать коллекцию ArrayList стран мира.
        //1.2 Добавить к этому cписку 3 страны, вывести результат в консоль.
        //1.3 Заменить 2-й элемент.
        //1.4 Удалить его по индексу.
        //1.5 Удалить любой элемент по значению.
        //1.6 Узнать индекс любого элемента.
        //1.7 Проверить, содержится ли элемент в коллекции (любой)
        ArrayList<String> lanWorld = new ArrayList<>();
        lanWorld.add("Беларусь");
        lanWorld.add("Россияя");
        lanWorld.add("Узбекистан");
        System.out.println(lanWorld);

        lanWorld.set(1, "Япония");
        System.out.println(lanWorld);
        lanWorld.remove(2);
        System.out.println(lanWorld);
        lanWorld.remove("Беларусь");
        System.out.println(lanWorld);

        lanWorld.add("Израиль");
        lanWorld.add("Литва");
        System.out.print(lanWorld.indexOf("Япония - "));
        if (lanWorld.contains("Япония") == true) {
            System.out.println("Искомый элемент содержится");
        }
        ;

        //Задача 2:
        //2.1 Создать двусвязный список стран мира.
        //2.2 Добавить к этому списку 4 страны ( 2 в начало и 2 в конец), вывести результат в
        //консоль (Использовать методы addFirst/addLast).
        //2.3 Удалить по одному элементу из начала и из конца списка.
        //2.4 Получить по одному элементу из начала и из конца списка.

        LinkedList<String> lanWorldLinked = new LinkedList<>();
        lanWorldLinked.add("Япония");
        lanWorldLinked.add("Беларусь");
        lanWorldLinked.add("Россия");
        lanWorldLinked.add("Узбекистан");
        System.out.println(lanWorldLinked);
        lanWorldLinked.addFirst("Турция");
        lanWorldLinked.addFirst("Моноголия");
        lanWorldLinked.addLast("Казахстан");
        lanWorldLinked.addLast("Германия");
        System.out.println(lanWorldLinked);
        lanWorldLinked.removeFirst();
        lanWorldLinked.removeLast();
        System.out.println(lanWorldLinked);
        System.out.println(lanWorldLinked);
        System.out.println("Первый элемент двухсвязного списка - " + lanWorldLinked.getFirst());
        System.out.println("Последний элемент двухсвязного списка - " + lanWorldLinked.getLast());

        System.out.println("------------------------3 задание ----------");

        HashSet<Person> person = new HashSet<>();
        person.add(new Person("Борис", 15));
        person.add(new Person("Бориска", 16));
        person.add(new Person("Борисик", 17));
        person.add(new Person("Петр", 17));
        person.add(new Person("Егор", 17));

        for (Person s : person) {
            System.out.println(s.getName() + " " + s.getAge());

        }

        System.out.println("------------------------- после удаления -----------");



        String nameToDelete = "Бориска";

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
        System.out.println("------------------------- 4 практическое задание -----------");

        Storage <String> strings = new Storage();
        Storage <Person> pers = new Storage<Person>();
        Storage <Integer> number = new Storage<>();

        strings.setValue("строка");
        pers.setValue(poisk);
        number.setValue(14);
        System.out.println("Строковое значение: " + strings.getValue());
        System.out.println("Численное значение: " + number.getValue());
        System.out.println("Объетк: " + pers.getValue().getName());


    }


    }
