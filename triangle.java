package basic;
import java.util.*;
public class triangle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		int C=sc.nextInt();
		if(A==C && B==C) {
			System.out.println("equilateral");
			
		}
		else if(A==C || B==C || A==B) {
			System.out.println("isosceles");
		}
		else if(A!=B && B!=C) {
			System.out.println("scalene");
		}
		
	}

}
