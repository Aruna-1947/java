import java.lang.*;
class First
{
     public static void main(int x)
      {
         System.out.println("int method");
       }
     public static void main(String k[])
      {
          System.out.println("main method");
          main();
       }
      public static void main(float j)
       {
          System.out.println("float method");
        }
       public static void main()
       {
           System.out.println("without arguements method");
            main(5.5f);
        }
}