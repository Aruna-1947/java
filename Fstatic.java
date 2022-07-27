import java.lang.*;
class Fstatic
{
  void display()
{
   display1();
   System.out.println("Display Instance");
}
static void show()
{
System.out.println("Show Static method");
}
void display1()
{ 
Fstatic.show();
System.out.println("dispaly 1 instance method");
}
public static void main(String k[])
{
System.out.println("start of main method");
show();
Fstatic f=new Fstatic();
f.display();
System.out.println("end of main method");
}
}