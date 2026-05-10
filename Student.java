import java.util.Scanner;

class Person{
    String name;
    int age;

    void getPersonData(Scanner sc)
    {
        System.out.println("Enter Name: ");
        name = sc.nextLine();

        System.out.println("Enter Age: ");
        age = sc.nextInt();
    }

    void display()
    {
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age) ;
    }
}

class Student extends Person {
    int rollno;
    String course;

    void getStudentData(Scanner sc) {
        getPersonData(sc);
        System.out.println("Enter Roll no.: ");
        rollno = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Course: ");
        course = sc.nextLine();
    }

    void displayInfo() {
        display();
        System.out.println("Roll no.: " + rollno);
        System.out.println("Course: " + course);
    }

    public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            Student s = new Student();

            System.out.println("\n***** Enter Student Details *****");
            s.getStudentData(sc);

            System.out.println("\n***** Student Information *****");
            s.displayInfo();

            sc.close();
        }
    }