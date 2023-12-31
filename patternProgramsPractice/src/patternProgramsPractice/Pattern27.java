package patternProgramsPractice;

public class Pattern27 {
	//DIAMOND NUMERIC PATTERN
	public static void main(String[] args) {
		int n=5;
		//Outer Loop to handle number of rows for 1st half
		for(int i=1;i<=n;i++)
		{
			// This inner loop prints the spaces
			for(int j=n-i;j>=1;j--)
			{
				System.out.print(" ");
			}

			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		//This outer loop handles number of rows for lower half
		for(int i=n-1;i>=1;i--)
		{
			for(int j=n-i;j>=1;j--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
