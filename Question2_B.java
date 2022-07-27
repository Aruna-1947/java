import java.lang.*;
import java.util.*;
class Question2_B{
	public static void main(String arr[]){
		int i;
		float marks[]=new float[6];
		float percentage,sum=0.0f;
		Scanner scan=new Scanner(System.in);
System.out.println("Enter marks of a student : ");
		for(i=0;i<6;i++){
			marks[i]=scan.nextFloat();
			sum=sum+marks[i];
		}
		System.out.println("\n\t The total 6 subject marks of a student is: "+sum);
		percentage=(sum/600)*100;
		System.out.println("\n\t The percentage of student is: "+percentage);
	}
}
