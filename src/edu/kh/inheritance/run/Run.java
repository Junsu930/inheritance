package edu.kh.inheritance.run;
import java.util.Arrays;

import edu.kh.inheritance.model.service.InheritanceService;
public class Run {
	
	public static void main (String[] args) {
		
		InheritanceService is = new InheritanceService();
		
		is.ex3();
	
		String str = "김준수, 김바비, 김엉, 추추리";
		
		String[] arr = new String [4];
		arr = str.split(",");  
		
		System.out.println(Arrays.toString(arr));
		
	}

}
