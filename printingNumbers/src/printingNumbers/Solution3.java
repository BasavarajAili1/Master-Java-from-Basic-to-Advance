package printingNumbers;
import java.util.Scanner;
//3. Display all numbers divisible by 5 
//And Enter n>100 as per the Question

public class Solution3 {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Until where the Numbers which Divisible by 5 are Displayed");
		int n=scan.nextInt();
		numbersDivBy5(n);

	}
	public static void numbersDivBy5(int n) {
		for(int i=1;i<=n;i++) {
			if(i%5==0) {
				System.out.println(i);
			}
		}
	}

}
