import java.util.Scanner;
public class factorial
{
public static void main(String args[])
{
int num;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number: ");
num=sc.nextInt();
if(num%2==0)
{
System.out.println("The Entered number is a even number");
}
else
{
System.out.println("The Entered number is a odd number");
}
if(num>0)
{
System.out.println("The Entered number is a positive number");
}
else
{
System.out.println("The Entered number is a negative number");
}
int i,fact=1;
for(i=1;i<=num;i++)
{
fact=fact*i;
}
System.out.println("Factorial of the Entered number is :"+fact);
}
}
