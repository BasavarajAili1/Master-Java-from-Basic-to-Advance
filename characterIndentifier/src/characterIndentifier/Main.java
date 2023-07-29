package characterIndentifier;
import java.util.Scanner;

public class Main {
	public static void identifyCharacter(char ch)
	{
		if (Character.isLowerCase(ch))
		{
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				System.out.println(ch+" is Lower-case vowel");
			}
			else {
				System.out.println(ch+" is Lower-case consonant");
			}
		}
		else if(Character.isUpperCase(ch))
		{
			if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
				System.out.println(ch+" is Upper-case vowel");
			}
			else {
				System.out.println(ch+" is Upper-case consonant");
			}
		}
		else if(Character.isDigit(ch)) {
			System.out.println(ch+ " is digit");
		}
		else {
			System.out.println(ch+" is special character");
		}
	}
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Please Enter an Character to be Identified...");
		char ch=scan.next().charAt(0);
		identifyCharacter(ch);
	}
	
}
