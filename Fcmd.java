import java.lang.*;
class Fcmd
{
 public static void main(String k[])
 {
   System.out.println("start of main method");
    for(int i=0;i<k.length;i++)
    System.out.println(i+"index"+k[i]);
    System.out.println("oth index"+k[0]);
    System.out.println("1st index"+k[1]);
    int a=Integer.parseInt(k[0]);
    int b=Integer.parseInt(k[1]);
    System.out.println("addition is: "k[0]+k[1]);
    System.out.println("addition operator over strings is : "+(k[0]+k[1]);
    System.out.println("addition operator over integers is : "+(a));
    System.out.println("end of main method");
  }

 }