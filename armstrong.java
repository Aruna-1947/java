import java.util.Scanner;
class armstrong
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num;
System.out.println("Enter a number: ");
num=sc.nextInt();
int r;
int sum=0;
int temp;
temp=num;
while(num>0)
{
r=num%10;
sum=sum+(r*r*r);
num=num/10;
}
if(sum==temp)
{
System.out.println("It is a armstrong number");
}
else
{
System.out.println("It is not a armstrong number");
}
}
}