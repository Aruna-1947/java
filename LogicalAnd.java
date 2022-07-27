public class LogicalAnd
{
public static void main(String args[])
{
int a=2;
int b=1;
int c=3;
System.out.println(a<b&&a<c);
System.out.println(a<b&a<c);
System.out.println(a<b&&a++<c);
System.out.println(a);
System.out.println(a<b&a++<c);
System.out.println(a);
}
}