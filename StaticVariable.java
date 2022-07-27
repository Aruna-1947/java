//Static Keyword : It is mainly used for memory management.
//it can be 
//1) Variable(also known as class variable)
//---->Static variable can be used to refer to the common property of all objects(which is not unique for each object)
//---->The static variable gets memory only once in the class area at the time of class loading.
//----S.V. Advantages----
//1)It makes your program memory efficient
//2)in java static property is shared to all objects
//2)method(also known as class method)
//3)Block
//4)Nested class 
//Why is the Java main method static?
//Ans) It is because the object is not required to call a static method. If it were a non-static method, JVM creates an object first then call main() method that will lead the problem of extra memory allocation.

class Student
{
int rollno;
String name;
static String college="IIIT";
Student(int r,String n)
{
rollno=r;
name=n;
}
void display()
{
System.out.println(rollno +" "+ name +" "+ college);
}
}
public class StaticVariable
{
public static void main(String args[])
{
Student s1=new Student(111,"Anju");
Student s2=new Student(222,"Devika");
s1.display();
s2.display();
}
}
