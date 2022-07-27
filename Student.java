import java.util.Scanner;
class Student
{
int age,idno,branch,gender;
double percentage;
Student()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Your Name : ");
name=sc.nextLine();

System.out.println("Enter Your ID : ");
idno=sc.nextLine();

System.out.println("Enter Your Gender : ");
gender=sc.nextLine();

System.out.println("Enter Your Branch : ");
branch=sc.nextLine();

System.out.println("Enter Your Age : ");
age=sc.nextInt();

System.out.println("Enter Your Marks in DS : ");
marks=sc.nextInt();

System.out.println("Enter percentage of E1-Sem2 : ");
percentage=sc.nextDouble();

System.out.println("Your details recorded and our device will welcomes you : ");
}

public void display()
{
System.out.println();
System.out.println();
System.out.println("Welcome "+idno+"to Java Course");
System.out.println("Name: "+name);
System.out.println("Gender: "+gender);
System.out.println("Branch: "+branch);
System.out.println("Age: "+age);
System.out.println("Marks in DS: "+marks);
System.out.println("percentage: "+percentage);
}
}

public class Question3{
	public static void main(String[] args) {
		Student student1=new Student();
		student1.display();
	}
}
