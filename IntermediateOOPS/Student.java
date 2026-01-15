public class Student {
    private String name;
    private int age;
    private char grade;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public char getGrade() {
        return grade;
    }
    public static void main(String[] args) {

        Student s = new Student();

        s.setName("John");
        s.setAge(21);
        s.setGrade('A');

        System.out.println("Name : " + s.getName());
        System.out.println("Age : " + s.getAge());
        System.out.println("Grade : " + s.getGrade());
    }    
}
