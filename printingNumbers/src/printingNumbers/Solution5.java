package printingNumbers;
import java.util.Scanner;
//5. Display all numbers divisible by 3 and comes in table of 5 
//And Enter n>100 as per the Question

public class Solution5 {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Until where the Numbers which Divisible by 3 and comes in table of 5 are Displayed");
		int n=scan.nextInt();
		numbersDivBy3and5(n);

	}
	public static void numbersDivBy3and5(int n) {
		for(int i=1;i<=n;i++) {
			if(i%3==0 && i%5==0) {
				System.out.println(i);
			}
		}

	}

}
