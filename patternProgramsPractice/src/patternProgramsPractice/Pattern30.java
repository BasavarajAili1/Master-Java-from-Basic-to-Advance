package patternProgramsPractice;

public class Pattern30 {
	//K SHAPE ALPHABET PATTERN
	public static void main(String[] args) {
		int n=5,i,j;
		char ch='A';

		for (i=n-1;i>=0;i--) 
		{
			for (j=0;j<=i;j++) 	
			{
				System.out.print((char)(ch+j)+" ");
			}
			System.out.println();
		}
		for (i=1;i<n;i++) 
		{
			for (j=0;j<=i;j++) 	
			{
				System.out.print((char)(ch+j)+" ");
			}
			System.out.println();
		}
	}
}
