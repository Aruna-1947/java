class UseSuper
{
int num=24;//20
UseSuper()
{
this(12);
System.out.println("BASE class Constructor is invoked");
}
UseSuper(int range)
{
System.out.println("Base class constructor is invoked with one parameter");
}
}
class UseThis extends UseSuper
{
int num=10;
int range=34;
UseThis(int num,int range)
{
super();
int i;
this.range=super.num+range;
for(i=0;i<=this.range;i++)
{
System.out.println(num+" * "+i+" = "+num*i);
}
}
}
public class Question1_b{
public static void main(String[] args) 
{
int num=Integer.parseInt(args[0]);
int range=Integer.parseInt(args[1]);
UseThis object=new UseThis(num,range);
}
}
