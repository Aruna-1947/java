import java.util.Scanner;
public class MultiplicationTable
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number: ");
int num=sc.nextInt();
System.out.println("Enter the range: ");
int range=sc.nextInt();
int i=1;
while(i<=range)
{
System.out.println(num + " * " + i + " = " + num*i);
i++;
}
}
}