package HomeWork;

import java.util.LinkedList;

public class Animals {

    //Задача 2:
    //Создать класс, который будет хранить в себе коллекцию с названиями животных.
    //Реализовать методы удаления и добавления животных по следующим правилам:
    //добавляется всегда в начало коллекции, а удаляется всегда из конца. Показать работу
    //объекта этого класса в main методе другого класса
    public String nameAnimasl;
    LinkedList<String> animalsArrayList = new LinkedList<String>();

    public String getNameAnimasl() {
        return nameAnimasl;
    }

    public String setNameAnimasl(String nameAnimasl) {
        this.nameAnimasl = nameAnimasl;
        return nameAnimasl;
    }

    public void del(){
        animalsArrayList.remove(animalsArrayList.size()-1);
    }

    public void add(){
        animalsArrayList.addFirst(nameAnimasl);
    }






}
