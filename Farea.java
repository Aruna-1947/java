//to take radius as input from cmd and display corresponding area of circle?
import java.lang.*;
class Circle
{
   double r,res;
   void area(double x)
       { 
         r=x;
         calculate();
       }
   void calculate()
     { 
       res=3.14*r*r;
        display();
      }
   void display()
      {
        System.out.println("area of circle is :"+res);
       }
}
 class Farea
  {
    public static void main(String k[])
    {
      if(k.length!=1)
        {
          System.out.println("please enter only one parameter");
         }
       else
         {
           Circle c=new Circle();
            double d=Double.parseDouble(k[0]); 
            c.area(d);
          }
      }
}