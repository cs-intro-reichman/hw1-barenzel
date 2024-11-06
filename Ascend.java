// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		 int lim = Integer.parseInt(args[0]);
		 // three variables from the range 
		int a = (int)(Math.random()*lim);
		int b = (int)(Math.random()*lim);
		int c = (int)(Math.random()*lim);
 
		 // checking the smallest number
		int checkMin1 = Math.min(a,b);
		int checkMin2 = Math.min(checkMin1,c);
 
		// cheking the biggest number
		int checkMax1 = Math.max(a,b);
		int checkMax2 = Math.max(checkMax1,c);
 
		// checking the middle number
		int middle = (a+b+c)-(checkMax2+checkMin2);
 
 
		System.out.println(a+" "+b+" "+c);
		System.out.println(checkMin2+" "+middle+" "+checkMax2);
	}
}
