package HomeWork;

import java.util.LinkedList;

public class Animals {

    //������ 2:
    //������� �����, ������� ����� ������� � ���� ��������� � ���������� ��������.
    //����������� ������ �������� � ���������� �������� �� ��������� ��������:
    //����������� ������ � ������ ���������, � ��������� ������ �� �����. �������� ������
    //������� ����� ������ � main ������ ������� ������
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
