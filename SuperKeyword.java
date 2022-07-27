//SUPER Keyword
//Super : It can be used to refer immediate parent class instance variable.
//Super : It can b used to invoke immediate parent class method
//Super() : It can be used to invoke immediate parent class constructor


class A
{
A()
{
System.out.println("Class A is created");
}
}
class B extends A
{
B()
{
System.out.println("Class B is created");
}
}
public class SuperKeyword
{
public static void main(String args[])
{
B d=new B();
}
}
