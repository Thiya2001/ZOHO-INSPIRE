public class Students {
    int rollno;
    String name;
    int age;
    String dept;
    Students(int rollno, String name, int age, String dept) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
        this.dept = dept;
    }
    public void details() {
        System.out.println("RollNo : " + rollno);
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Dept : " + dept);
    }
    public static void main(String[] args) {
        Students[] stud = new Students[10];
        stud[0] = new Students(1003, "Pranav", 19, "CSE");
        stud[1] = new Students(1899, "Gaja", 20, "ECE");
        stud[2] = new Students(1456, "Kavin", 21, "MECH");
        stud[3] = new Students(1678, "Arun", 22, "CIVIL");
        stud[4] = new Students(1234, "Mohan", 20, "EEE");
        stud[5] = new Students(1987, "Vijay", 19, "BioTech");
        stud[6] = new Students(1765, "Hari", 23, "MECH");
        stud[7] = new Students(1543, "Ajay", 21, "BioMed");
        stud[8] = new Students(1322, "Ramesh", 22, "CSE");
        stud[9] = new Students(1455, "Suresh", 20, "ECE");

        for(int i = 0; i < stud.length; i++) {
            System.out.println("Students " + (i + 1) + " Details  : ");
            stud[i].details();
            System.out.println();
        }
    }
}
