class A{
String flower="Jasmine";
}
class B extends A
{
String flower="Rose";
void printFlower()
{
System.out.println(flower);
System.out.println(super.flower);
}
}
class SuperKeyword2
{
public static void main(String args[])
{
B d=new B();
d.printFlower();
}
}