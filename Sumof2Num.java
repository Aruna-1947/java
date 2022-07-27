import java.util.Scanner;

public class Sumof2Num
{
public static void main(String args[])
{
int n1,n2,sum;
int lcm;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the first number: ");
n1=sc.nextInt();
System.out.println("Enter the second number: ");
n2=sc.nextInt();
sum=n1+n2;
int mult=n1*n2;
System.out.println("The sum of two numbers is :"+sum);
System.out.println("The multiplication of two numbers is :"+mult);
int gcd=1;
for(int i=1;i<=n1 && i<=n2;i++)
{
if(n1%i==0 && n2%i==0)
gcd=i;
}
System.out.println("GCD of two numbers is : "+gcd);
lcm=((mult)/gcd);
System.out.println("LCM of two numbers is : "+lcm);
}
}