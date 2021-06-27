package com.bridgelabz.utility;

import java.io.PrintWriter;
import java.util.Scanner;

public class Utility {
Scanner scanner;

public Utility() {
scanner = new Scanner(System.in);
}
public int getIntValue() {
	return scanner.nextInt();
}
public double getDouble() {
	return scanner.nextDouble();
	}
public boolean getBoolean() {
	return scanner.nextBoolean();
}

		//flip coin percentile
public static void flipCoin(int numberOfFlip) {
	double heads = 0, tails = 0;
	for(int i = 0; i<numberOfFlip; i++) {
		double side = Math.random();
		if(side>0.5) {
			heads++;
		}
		else {
			tails++;
		}
	}
     System.out.println("Number of head occurance ::" + heads);
     System.out.println("Number of head occurance ::" + (numberOfFlip-heads));
     double headPercent = ((heads * 100)/numberOfFlip);
     double tailPercent = ((tails * 100)/numberOfFlip);
     System.out.println("Heads Percentage ::" + headPercent + "%");
     System.out.println("Tails Percentage ::" + tailPercent + "%");

}

           //LEAP YEAR
public void checkLeapYear(int ValueOfYear) {
	int temp = ValueOfYear, noOfDigit=0;
	do {
		noOfDigit++;
		ValueOfYear /= ValueOfYear/10;
	}while(ValueOfYear != 0);
	if(noOfDigit == 4) {
		
		if((temp % 4 == 0 || temp % 400 == 0) && temp % 100 == 0){
			System.out.println(temp+" is a Leap Year");
		}
		else 
			System.out.println(temp+" is not Leap Year");
		}
		else 
			System.out.println(temp+"is not valid Leap Year");
	}

      //POWER OF TWO
public void getPowerOfTwo(int n) {
	if (n>=0 && n<=31) {
		int power = 0;
		for (int i=0; i<=n; i++) {
			power = (1<<i);
			System.out.println("2^"+i+ "  =  "  +power);
		}
	}
}

       //EVEN ODD
public void getEvenOdd(int num) {
	if(num%2 == 0)
		System.out.println(num+" is even number");
	else
		System.out.println(num+" is odd number");
}

       //QUOTIENT REMAINDERE
public void getQuotientRemainder(int Dividend, int Divisor ) {
	int Quotient, Remainder;
	Remainder = Dividend % Divisor;
	Quotient = Dividend / Divisor;
	System.out.println(" Remainder = " +Remainder+ " Quotient = " +Quotient);
	
}

      //SWEAP THE NUMBER
public void SwapNumber(int num1 ,int num2) {
	int temp;
	temp = num1;
	num1 = num2;
	num2 = temp;
	System.out.println("num1 = "+num1+" num2 = "+num2);
}

       //VOWEL OR CONSONENT
public void checkAlphabate(char alphabates) {
	boolean vowel ;
	if(alphabates == 'a' || alphabates == 'A')
		vowel  = true;
	else if(alphabates == 'e'|| alphabates == 'E')
		vowel  = true;
	else if(alphabates == 'i'|| alphabates == 'I')
		vowel  = true;
	else if(alphabates == 'o'|| alphabates == 'O')
		vowel  = true;
	else if(alphabates == 'u'|| alphabates == 'U')
		vowel  = true;
	else
		vowel = false;
	
	if (vowel)
		System.out.println(alphabates+" is vowel");
	else
		System.out.println(alphabates+" is Consonent");
}


         //HARMONIC NUMBER
public void getHarmonic(int num) {
	float sum = 0;
	for (float i=1;i<=num;i++) {
		sum+=1/i;
	}
	System.out.println("Nth Harmonic Value =" +sum);

}


        	//FACTOR
public void getPrimeFactor(int num) {
	for(int i=2;i<num;i++) {
		int cnt = 0;
		if (num%i == 0) {
		
			for(int j=2;j<i;j++) {
				if (i%j == 0) {
					cnt = 1;
				}
				
			}
			if (cnt == 0)
				System.out.println("Prime factor = " +i);
		}
	 }
   }

		//LARGEST AMONG THREE
public void getLargestNumber(int num1, int num2, int num3) {
	int Firstnum, Secondnum;
	Firstnum = (num1>num2)? num1:num2; 
	Secondnum = (Firstnum>num3)? Firstnum:num3; 
	System.out.println(Secondnum+" is greatest among "+num1+", "+num2+", "+num3);
	}

		//2D ARRAY
public <T> void print2DArray(T[][] inputArray, int rows, int columns) {
	PrintWriter printwriter = new PrintWriter(System.out);
	// TODO Auto-generated method stub
	for (int i =0;i<rows;i++)
	{
		for (int j =0;j<columns;j++)
		{ 
			printwriter.write(inputArray[i][j]+" ");
			printwriter.flush();
			//System.out.print(inputArray[i][j]+" ");
		}
		System.out.println();
		}
	}


     //SUM OF THREE INTEGER ARE ZERO
public static void findTriplets( int arr [], int n, int n1) {
	
	 boolean found = false;
	    for (int i=0; i<n-2; i++)
	    {
	        for (int j=i+1; j<n-1; j++)
	        {
	            for (int k=j+1; k<n; k++)
	            {
	                if (arr[i]+arr[j]+arr[k] == 0)
	                {
	                    System.out.print(arr[i]);
	                    System.out.print(" ");
	                    System.out.print(arr[j]);
	                    System.out.print(" ");
	                    System.out.print(arr[k]);
	                    System.out.print("\n");
	                    found = true;
	                }
	            }
	        }
	    }
	}
	    
	    //DISTANCE
public void getnum(double x, double y) {
			//int x1 = 0;
			//int y1 = 0;
			
			double distance;
			
			distance = Math.sqrt(x*x+y*y);
			System.out.println(distance);
		}
	    
	    //QUADRATIC 
public void getQuadratic(double a, double b ,double c) {
			double secondRoot = 0 , firstRoot = 0; 
			double determinant = (b*b)-(4*a*c);
			double sqrt = Math.sqrt(determinant);
			if(determinant>0) {
				firstRoot = (-b + sqrt)/(2*a);
				secondRoot = (-b - sqrt)/(2*a);
				System.out.println("Roots are ::" +firstRoot +"and"+secondRoot);
			}
			else if(determinant==0) {
				System.out.println("Root is" +(-b/(2*a)));
			}
			else {
				System.out.println("Root is not real");
			}
		}
	}
	        





