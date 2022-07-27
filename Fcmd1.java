import java.lang.*;
class Fcmd1
{
    public static void main(String k[])
     {
       if(k.length!=2)
        { 
          System.out.println("please enter two parameters");
         }
        else
           {
             System.out.println("start of main method");
             System.out.println(k[0]);
             System.out.println(k[1]);
              int a=Integer.parseInt(k[0]);
              int b=Integer.parseInt(k[1]);
              System.out.println("addition operator over strings is:"+(k[0]+k[1]));
              System.out.println("addition operator over integers is:"+(a+b));
              System.out.println("end of main method");
}

}