class Question3_B{  
  static int data=30;  
  static class Inner{  
   void msg()
{
System.out.println("data is "+data);}  
  }  
  public static void main(String args[])
{  
  Question3_B.Inner obj=new Question3_B.Inner();  
  obj.msg();  
  }  
}  