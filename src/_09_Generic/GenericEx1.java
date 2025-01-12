package _09_Generic;

import java.util.ArrayList;

class CustomList
{
    ArrayList <String> list = new ArrayList<>();

    public void addElement(String element)
    {
         list.add(element);
    }
    public void removeElement(String element) {list.remove(element);}
    public String get(int i) {return list.get(i);}
    @Override
    public String toString() {return "Customlist =" + list;}


}
class CustomListGeneric<T>
{
    ArrayList <T> list = new ArrayList<>();

    public void addElement(T element)
    {
        list.add(element);
    }
    public void removeElement(T element) {list.remove(element);}
    public T get(int i) {return list.get(i);}
    @Override
    public String toString() {return "Customlist =" + list;}
}
public class GenericEx1
{
    public static void main(String[] args)
    {

        //not String li;
        CustomList li = new CustomList();
        li.addElement("first element");
        li.addElement("second element");
        System.out.println(li.toString());


        //using generic
        CustomListGeneric<Integer> genericL1 = new CustomListGeneric<>();
        genericL1.addElement(3);
        genericL1.addElement(36);
        System.out.println(genericL1.toString());

        //using generic
        CustomListGeneric<Character> genericL2 = new CustomListGeneric<>();
        genericL2.addElement('A');
        genericL2.addElement('B');
        System.out.println(genericL2.toString());





    }
}
