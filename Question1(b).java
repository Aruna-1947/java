class UseSuper
{
    int number=20;
    UseSuper()
{
        this(10);
        System.out.println("BASE class Constructor is invoked...");
    }
    UseSuper(int range)
{
        System.out.println("Base class constructor is invoked with a parameter");
    }

class UseThis extends UseSuper{
    int number=10;
    int range=30;
    UseThis(int number,int range)
{
        super();
        int i;
        this.range=super.number+range;
        for(i=0;i<=this.range;i++)
{
            System.out.println(number+" * "+i+" = "+number*i);
        }
    }

public class Question1_b
{
    public static void main(String[] args)
 {
        int number=Integer.parseInt(args[0]);
        int range=Integer.parseInt(args[1]);
        UseThis object=new UseThis(number,range);

    }
}
