package printingNumbers;
import java.util.Scanner;
//4. Display all numbers divisible by 2 and 5 
//And Enter n>100 as per the Question

public class Solution4 {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Until where the Numbers which Divisible by 2 & 5 are Displayed");
		int n=scan.nextInt();
		numbersDivBy2and5(n);

	}
	public static void numbersDivBy2and5(int n) {
		for(int i=1;i<=n;i++) {
			if(i%2==0 && i%5==0) {
				System.out.println(i);
			}
		}
	}
}
