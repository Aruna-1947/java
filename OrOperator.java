public class OrOperator
{
public static void main(String args[])
{
int a=5;
int b=2;
int c=3;
System.out.println(a>b||a<c);
System.out.println(a>b|a<c);
System.out.println(a>b||a++<c);
System.out.println(a);
System.out.println(a>b|a++<c);
System.out.println(a);
}
}