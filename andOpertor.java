package basic;
import java.util.*;
public class andOpertor {
	
	/* if(condition1 & condition2){  // logical and (single ampersand)
	 *        statements}
	 *        
	 *  if(condition 1 && condition2){  //short circuit and (double ampersand)  ->> it ill not even check 2nd condition if 1st condition is false
	 *       statements;
	 *       }      
	 *        
	 *        */
	Scanner sc=new Scanner(System.in);
	int age=sc.nextInt();
	int totalStay=sc.nextInt();
	if(age>=18 && totalStay>=10) {
		System.out.println("he/she is eligible to eat");
	}
	else {
		System.out.println("he/she is not eligible");
	}

}
