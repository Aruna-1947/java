import java.util.Scanner;
public class UnaryOperator{  
public static void main(String[] args)
{
int x;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of x: "); 
x=sc.nextInt();  
System.out.println(x++);
System.out.println(++x);
System.out.println(x--);
System.out.println(--x);
}}  