class Person {
    String name;
    int age;
    String address;
}

class Student extends Person {
    int grade;
    String school;
}

public class PersonStudent {
    public static void main(String[] args) {
        
        Student st = new Student();

        st.name = "John";
        st.age = 16;
        st.address = "123 North Street";

        st.grade = 10;
        st.school = "Sunshine High School";

        System.out.println("Student Details : ");
        System.out.println("Name : " + st.name);
        System.out.println("Age : " + st.age);
        System.out.println("Address : " + st.address);
        System.out.println("Grade : " + st.grade);
        System.out.println("School : " + st.school);
    }
}
