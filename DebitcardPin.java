import java.util.Scanner;
class DebitcardPin
{  
 public static void main(String args[])
{
  int r,sum=0,temp;    
  int n;
  System.out.println("Enter the 4 digit pin to set: ");
  Scanner s = new Scanner(System.in);
  n = s.nextInt();
  temp=n;    
  while(n>0)
{    
   r=n%10; 
   sum=(sum*10)+r;    
   n=n/10;    
  }    
  if(temp==sum && temp%2==0)    
   System.out.println("your pin has setup successfully ");    
  else    
   System.out.println("please enter a vaid pin which should be even and a palindrome!!!");    
}  
} 