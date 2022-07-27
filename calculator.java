import java.util.Scanner;
public class calculator
{
public static void main(String args[])
{
Scanner input=new Scanner(System.in);
System.out.println("Enter two numbers: ");
double first=input.nextDouble();
double second=input.nextDouble();
System.out.println("1.Addition\n");
System.out.println("2.Substraction\n");
System.out.println("3.Multiplication\n");
System.out.println("4.Division\n");
System.out.println("5.Modulo Division\n");
System.out.println("Enter the operation value : ");
int value=input.nextInt();
double result;
switch(value)
{
       case 1 :
               result=first+second;
               System.out.println("first+second= "+result);
               break;
               
       case 2 :
               result=first-second;
               System.out.println("first-second= "+result);
               break;
               
       case 3 :
               result=first*second;
               System.out.println("first * second ="+result);
               break;
       case 4 :
               if(second==0)
               {
                System.out.println("Cannot perform Division\n");
                }
                else
               {
               result=first/second;
               System.out.println("first / second = "+result);
               }
               break;
       case 5 :
               if(second==0)
               {
                System.out.println("Cannot perform Modulus\n");
                }
                else
               {
               result=first%second;
               System.out.println("first % second = "+result);
               }
               break;
       default :
                System.out.println("Error!!operation cannot perform..");
                return;
       }
        
}
}




