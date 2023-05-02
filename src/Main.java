import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //task в презентации
    /*Programmer programmer=new Programmer();
    programmer.name=scanner.nextLine();
    programmer.surName=scanner.nextLine();
    programmer.age= scanner.nextInt();
        System.out.println("Год рождения ");
    programmer.yearOfBirth();*/



        /*Triangle triangle=new Triangle();
        System.out.println("Введите сторону треугольника ");
        triangle.a=scanner.nextDouble();
        System.out.println("Введите высоту треугольника ");
        triangle.b=scanner.nextDouble();
        triangle.c=2;
        System.out.println("Площадь треугольника зная его основание и высоту равна ");
        triangle.area();*/


        Triangle triangle1=new Triangle();
        System.out.println("Введите первую сторону треугольника ");
        triangle1.a=scanner.nextDouble();
        System.out.println("Введите вторую сторону треугольника ");
        triangle1.b=scanner.nextDouble();
        System.out.println("Введите третью сторону треугольника ");
        triangle1.c=scanner.nextDouble();
        triangle1.area2();//вызываю метод


















    /*Scanner scanner=new Scanner(System.in);
    Student student=new Student("akylai","musaeva",21,"akumusaeva01@gmail.com");
        System.out.println(student.firstName+"\n"+student.lastName+"\n"+student.age+"\n"+student.email);
student.addStudent();

    student.firstName="akylai";
    student.lastName="musaeva";
    student.age=21;
    student.email="akumusaeva01@gmail.com";
    student.addStudent();
        System.out.println(student.firstName+"\n"+student.lastName+"\n"+student.age+"\n"+student.email);

    Student student2=new Student();
    student2.firstName="Asylbek";
    student2.lastName="Abdurashitov";
    student2.age=23;
    student2.email="asylbek@gmail.com";
    student2.addStudent();
        System.out.println(student2.firstName+"\n"+student2.lastName+"\n"+student2.age+"\n"+student2.email);


        Student student3=new Student();//empty object
        int []numbers=new int[1];//empty array

        */


    }
}