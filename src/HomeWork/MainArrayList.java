package HomeWork;

public class MainArrayList {
    public static void main(String[] args) {
        MyArrList <Integer> arrList = new MyArrList<>();
        arrList.add(1);
        arrList.add(2);
        arrList.add(3);
        arrList.add(4);
        arrList.add(5);
        arrList.add(6);
        arrList.add(7);

        arrList.printArrList();
        System.out.println(arrList.indexOf(5));
        arrList.removeAtIndex(4);
       // System.out.println("Поиск элемента " + arrList.search(5));
        arrList.printArrList();
    }
}
