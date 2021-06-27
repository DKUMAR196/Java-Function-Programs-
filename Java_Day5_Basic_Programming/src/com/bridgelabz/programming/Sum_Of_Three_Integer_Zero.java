	package com.bridgelabz.programming;

	import com.bridgelabz.utility.Utility;

	public class Sum_Of_Three_Integer_Zero {
		
		    // If no triplet with 0 sum found in array
		    if (found == false)
		        System.out.println(" not exist ");
		    
		    // Driver code
	public static void main(String[] args)
		{
			Utility utility = new Utility();
			System.out.println("Enter First Number: ");
		    int Number1 = utility.getIntValue();
			System.out.println("Enter Second Number: ");
			int Number2 = utility.getIntValue();
			System.out.println("Enter Third Number: ");
			int Number3 = utility.getIntValue();
			utility.findTriplets(Number1, Number2, Number3);
		}
	}
	

	
	

		

	


