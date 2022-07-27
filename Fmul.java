import java.lang.*;
class Multiplication
{
    int mul(int a,int b)
       {
           return a*b;
        }
     static int add(int a,int b)
        {
            return a+b;
         }
};
class Fmul
 {
      public static void main(String k[])
       {
          System.out.println("main method");
          Multiplication m=new Multiplication();
          System.out.println("multiplication:"+m.mul(2,3));
          System.out.println("addition is:"+Multiplication.add(2,3));
        }
 }