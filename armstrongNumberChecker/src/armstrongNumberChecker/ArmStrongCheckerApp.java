package armstrongNumberChecker;
import java.util.Scanner;

public class ArmStrongCheckerApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=scan.nextInt();
		int original=n;
		int count=0;
		while(n!=0) {
			n=n/10;
			count++;
		}
		ArmStrongChecker armStrong=new ArmStrongChecker();
		int res=armStrong.armStrongCheck(original, count);
		System.out.println("Result is "+res);
		if(res==original) {
			System.out.println(original+" is ARMSTRONG NUMBER");
		}
		else {
			System.out.println(original+" is Not an ARMSTRONG NUMBER");
		}
	}
}
