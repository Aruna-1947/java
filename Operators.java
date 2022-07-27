import java.util.Scanner;
public class Operators{
public static void main(String[] args)
{
int x;
int a,b;
int c,d;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of x: ");
x=sc.nextInt();
System.out.println(x++); 
System.out.println(++x); 
System.out.println(x--);  
System.out.println(--x);
System.out.println("Enter the values of a and b: ");
a=sc.nextInt();
b=sc.nextInt();
System.out.println(a++ + ++a); 
System.out.println(b++ + b++);
System.out.println(~a);
System.out.println(!a);
System.out.println("Enter the values of c and d: ");
c=sc.nextInt();
d=sc.nextInt();
System.out.println(c+d); 
System.out.println(c-d); 
System.out.println(c*d);  
System.out.println(c/d); 
System.out.println(c%d);
System.out.println(10*10/5+3-1*4/2);  
System.out.println(10<<2);//10*2^2=10*4=40  
System.out.println(20<<2);//20*2^2=20*4=80  
System.out.println(10>>2);//10/2^2=10/4=2  
System.out.println(20>>2);//20/2^2=20/4=5  
System.out.println(-20>>>2);  
int e,f,g;
System.out.println("Enter the values of e and f and g: ");
e=sc.nextInt();
f=sc.nextInt();
g=sc.nextInt();
System.out.println(e<f&&e<g);//false && true = false  
System.out.println(e<f&e<g);//false & true = false 
System.out.println(e<f&&e++<g);
System.out.println(e<f&e++<g);//false && true = false 


System.out.println(e>f||e++<g);//true || true = true  
System.out.println(e);//10 because second condition is not checked  
System.out.println(e>f|e++<g);//true | true = true  
System.out.println(e); 

int min=(e<f)?e:f;  
System.out.println(min);  


a+=4;
b-=4;
System.out.println(a);  
System.out.println(b); 
a*=2;
a/=2;      
System.out.println(a);  
System.out.println(b); 


a=(short)(a+b);
System.out.println(a);

}
}   