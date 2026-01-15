package CollectionsFramework;

import java.util.*;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "Student{id = " + id + ", name = " + name + "}";
    }
}

public class GenericUseStringIntegersCustomObject {

    public static void main(String[] args) {

        List<String> strList = new ArrayList<>();
        strList.add("Java");
        strList.add("Python");
        strList.add("C++");

        List<Integer> intList = new ArrayList<>();
        intList.add(10);
        intList.add(20);
        intList.add(30);

        List<Student> stuList = new ArrayList<>();
        stuList.add(new Student(1,"Thiyagu"));
        stuList.add(new Student(2,"Arun"));

        System.out.println("String Collection : ");
        System.out.println(strList);

        System.out.println("\nInteger Collection : ");
        System.out.println(intList);

        System.out.println("\nStudent Collection : ");
        System.out.println(stuList);

        System.out.println("\nUsing Wildcard : ");
        printAny(strList);

        System.out.println("\nUsing Bounded Type : ");
        printNumber(intList);
    }

    static void printAny(List<?> list) {
        for(Object o : list) {
            System.out.println(o);
        }
    }

    static void printNumber(List<? extends Number> list) {
        for(Number n : list) {
            System.out.println(n);
        }
    }
}
