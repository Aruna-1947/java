//This Keyword
//There is a lot of use of this keyword.In java, It acts as  refernce variable which refers to the current object.
//This can be used to refer current class instance variable.
//This can be passed as an arguement in the method call.
//This can be used to invoke current class method(implicity)
//This can be passed as arguement in the constructor call.
//This() can be used to invoke current class Constructor.
//This can be used to return the current class instance from the method.
class Student
{
int rollno;
String name,course;
float fee;
Student(int rollno,String name,String course,float fee)
{
this.rollno=rollno;
this.name=name;
this.course=course;
this.fee=fee;
}
void display()
{
System.out.println(rollno+""+name+""+course+""+fee);
}
}
public class ThisKeyword
{
public static void main(String args[])
{
Student s1=new Student(123,"anjani","java",10000f);
Student s2=new Student(567,"deevena","java",20000f);
s1.display();
s2.display();
}
}