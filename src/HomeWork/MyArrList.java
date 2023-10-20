package HomeWork;

public class MyArrList <T>{
    private static final int SIZE = 10;
    public Object[] myArrList;
    public int size;

    //Предусмотреть операции(методы):
    //1. добавления элемента
    //2. удаления элемента
    //3. получение элемента по индексу
    //4. проверка есть ли элемент в коллекции
    //5. очистка всей коллекции
    //Предусмотреть конструктор без параметров - создает массив размером
    //по умолчанию. Предусмотреть конструктор с задаваемым размером внутреннего
    //массива. Предусмотреть возможность автоматического расширения коллекции при
    //добавлении элемента в том случае, когда коллекция уже заполнена


    public MyArrList() {
        myArrList = new Object[SIZE];
        size = 0;
    }

    public void add(T t){
        if (size == myArrList.length){
            expandCapacity();
        }
        myArrList[size++] = t;
    }

    public Object remove(T t) {
        Object[] newMyArrList = new Object[myArrList.length ];
        if (search(t) == true) {
            int j = 0;
            for (int i = 0; i < myArrList.length; i++) {
                if (t.equals(myArrList[i])) {
                    i++;
                }
                newMyArrList[j] = myArrList[i];
                j++;
            System.out.println(newMyArrList[j]);
            }
        }
        return newMyArrList;
    }

    public T indexOf(int index){
        if(index < 0 || index > myArrList.length){
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return (T) myArrList[index];
    }


    private void expandCapacity() {
        int newCapacity = myArrList.length * 2;
        Object[] newElements = new Object[newCapacity];
        System.arraycopy(myArrList, 0, newElements, 0, size);
        myArrList = newElements;
    }

    public boolean search(T t){
        boolean search = false;
        for (Object p: myArrList) {
            if (p.equals(t)){
                return true;
            }
        }
        return false;
    }

    public void printArrList(){
        for (Object p: myArrList){
            System.out.print(p + " ");
        }
   }

    public void removeAtIndex(int index) {
        for (int i = index; i < myArrList.length-1; i++) {
            myArrList[i] = myArrList[i + 1];
        }
        size--;
    }

    public void clear() {
        myArrList = new Object[SIZE];
        size = 0;
    }

}
