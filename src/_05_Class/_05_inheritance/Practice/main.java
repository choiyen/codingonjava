package _05_Class._05_inheritance.Practice;

import _05_Class._02_access_modifier._pack2.C;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Cat cat = new Cat("고양이","울프", 10);
        cat.setSize(107.1);
        cat.setWool("브라운색");
        System.out.println(cat.getKind() + "인 " + cat.getName() + "은 " + cat.getAge() + "이고,  털 색은 " + cat.getWool() + "이고, 크기는 " + cat.getSize() + "이다.");
        System.out.println(cat.makeSound());
        System.out.println(cat.makelike());
        dog dog = new dog("강아지","로이", 8);
        dog.setSize(127.1);
        dog.setWool("검은색");
        System.out.println(dog.getKind() + "인 " + dog.getName() + "은 " + dog.getAge() + "이고,  털 색은 " + dog.getWool() + "이고, 크기는 " + dog.getSize() + "이다.");
        System.out.println(dog.makeSound());
        System.out.println(dog.makelike());
    }
}
