
public class Factorial {
	
public static int num=10;

public int getFactorial() { 
int factorial=1; 
 	 	for(int i=num;i>0;i--){ 
 	 	 	factorial*=i; 
 	
 	 	} 	
 	 	return factorial; 
 	   }

@Override
public String toString() {
	return "Factorial [" +"1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 = " +getFactorial() + "]";
} 

 
}
