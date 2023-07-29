package patternProgramsPractice;

public class Pattern26 {
	//K PATTERN WITH NUMBER
	public static void main(String[] args) {
		int n=5;
		// Printing Upper Half for n rows
		// This Loop is to iterate over each row in reverse order
		for(int i=n;i>=1;i--){
			for(int j=1;j<=i;j++){
				System.out.print(j+" "); 
			}
			System.out.println();
		}
		// Printing Lower Half for n-1 rows
		// This Loop is to iterate over each row

		for(int i=2;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+" "); 
			}
			System.out.println();
		}
	}
}
