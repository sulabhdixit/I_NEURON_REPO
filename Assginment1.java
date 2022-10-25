
										ASSIGNMENT-1(I-NEURON)


Q1)Solution
package in.neuron.com;

public class pattern1 {

	public static void main(String[] args) {
		int n=11;
		int i=0;
		int j=0;
		for(i=0;i<n;i++) {
			for( j=0;j<n;j++) {
				if(j==(n-1)/2) {
					System.out.print("*");
				}
					
				else
					System.out.print(" ");
			}
			System.out.print("  ");
			for( j=0;j<n;j++) {
				if(j==0&&j<(n-1)||j==(n-1)||i==j) {
					System.out.print("*");
				}
					
				else
					System.out.print(" ");
			}
			System.out.print("  ");

			
			for( j=0;j<n;j++) {
				if(i==0||j==0|i==(n-1)||i==(n-1)/2&&j<=(n-1)/2) {
					System.out.print("*");
				}
					
				else
					System.out.print(" ");
			}
			System.out.print("  ");

			
			for( j=0;j<n;j++) {
				if(i==(n-1)||j==0||j==(n-1)){
					if((i==(n-1)&&j==0)||(i==(n-1)&&j==(n-1))) {
						System.out.print(" ");}
						else {
							System.out.print("*");}}
					
				else {
					System.out.print(" ");}
			}
			System.out.print("  ");

			
			for( j=0;j<n;j++) {
				if(j==0||i==0||j==(n-1)&&i<(n-1)/2||i==(n-1)/2||i>(n-1)/2&&j>(n-1)/2&&i==j){
					if(i==0&&j==0||i==0&&j==(n-1)||j==(n-1)&&i==(n-1)/2){
						System.out.print(" ");}
					else	{
					System.out.print("*");
						}
				}
				
					
				else
					System.out.print(" ");
			}
			System.out.print("  ");

			
			for( j=0;j<n;j++) {
				
				if(i==0||i==(n-1)||j==0||j==(n-1)) {
					if((i==0 && j==0) || (i==0 && j==(n-1))
							|| (i==(n-1) && j==0) || (i==(n-1) && j==(n-1))) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");

			
			for( j=0;j<n;j++) {
				if(j==0||j==(n-1)||i==j){
					System.out.print("*");
				}
					
				else
					System.out.print(" ");
			}
			System.out.print("  ");
			System.out.println();
		}
		}
		}


 

Q2)Solution

package in.neuron.com;

public class myfirstprogram {
	

public static void main(String[] args) {
		int n=4;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {	
					System.out.print(i);
			}
			System.out.println(" ");	
		}
	}

}


Q3)Solution

package in.neuron.com;

public class pattern2 {

	public static void main(String[] args) {
		int n=15;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0 ||i==(n-1)||j==0 ||j==(n-1)||i+j==(n-1)/2||j-i==(n-1)/2||i+j<(n-1)/2||j-i>(n-1)/2) {
					System.out.print("*");	
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();		
		}
	}
}

Q4)Solution


package in.neuron.com;

public class pattern3 {

	public static void main(String[] args) {
		int n=15;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==(n-1)/2&&j==0&&j==(n-1)||j==(n-1)&&i>(n-1)/2||i-j>=(n-1)/2||i+j>(n-1)+(n-1)/2-1) {
					System.out.print("*");	
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();		
		}
	}	
	}


Q5)Solution

package in.neuron.com;

public class pattern5 {

	public static void main(String[] args) {
		int n=15;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0||j==0||i==(n-1)||i+j==(n-1)/2||i+j<(n-1)/2||i-j==(n-1)/2||i-j>(n-1)/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
			
			
		}
	}

}



															FROM:-
															SULABH DIXIT

