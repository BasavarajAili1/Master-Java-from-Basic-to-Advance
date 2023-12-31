package patternProgramsPractice;

public class Pattern29 {
	//DIAMOND ALPHABET PATTERN
	public static void main(String[] args) {
		int n=6;
		char ch='A';

		//upper pyramid
		for(int i=1;i<=n;i++) {
			//printing spaces
			for(int j=n;j>i;j--) {
				System.out.print(" ");
			}
			//printing alphabets
			for(int k=0;k<i*2-1;k++) {
				System.out.print((char)(ch+k));
			}
			System.out.println();
		}

		//lower pyramid
		for(int i=1;i<=n-1;i++) {
			//printing spaces
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			//printing alphabets
			for (int k=0;k<(n-i)*2-1;k++) {
				System.out.print((char)+(ch+k));
			}
			System.out.println();
		}
	}
}
