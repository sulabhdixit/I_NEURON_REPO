//Q1)Solution

package in.neuron.com.Assignment4;
//WAP to remove Duplicates from a String.(Take any String ex with duplicates character)
import java.util.*;

public class Q1 {

	public static void main(String[] args) {
		System.out.println("E N T E R   T H E   S T R I N G");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char[] s = str.toCharArray();
		int count=0;
		for (int i = 0; i < s.length; i++) {
			for (int j = i + 1; j < s.length; j++) {
				if (s[i]==s[j]) {
					s[j]=' ';
					count++;
				}
			}
		}
		if (count==0)
			System.out.println("N O  D U P L I C A T E S   F O U N D ");
		else {
			System.out.println("S T R I N G   W I T H O U T   D U P L I C A T E S   I S :- ");
			for(int i=0;i<s.length;i++) {
				if(s[i]!=' ')
				System.out.print(s[i]);
			}
		}
		sc.close();

	}

}


//Q2)Solution

package in.neuron.com.Assignment4;
//WAP to print Duplicates characters from the String.
import java.util.*;
public class Q2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("E N T E R  T H E   S T R I N G");
		String str=sc.nextLine();
		char[] copy=str.toCharArray();
		String str1=" ";
		Arrays.sort(copy);
		for(int i=1;i<copy.length;i++) {
			if(copy[i]==copy[i-1]) {
				str1+=copy[i];
			}
		}
		sc.close();
		if(str1==" ") {
			System.out.println("N O   D U P L I C A T E S   F O U N D   I N   T H E   S T R I N G");
		}
		else {
			System.out.println("D U P L I C A T E S  I N  T H E  S T R I N G :- "+str1);
		}
	
	}

}

//Q3)Solution

package in.neuron.com.Assignment4;
//WAP to check if “2552” is palindrome or not.
public class Q3 {

	public static void main(String[] args) {
		String str="2552";
        String str1="";
        for(int i =str.length()-1;i>=0;i--) {
        	str1+=str.charAt(i);
        }
        if(str.equals(str1)) {
        	System.out.println("YES IT IS A PALLINDROME ");
        }
        else {
        	System.out.println("NO IT IS NOT A PALLINROME");
        }
	}

}


//Q4)Solution

package in.neuron.com.Assignment4;

//WAP to count the number of consonants, vowels, special characters in a String.
import java.util.*;

public class Q4 {

	public static void main(String[] args) {
		System.out.println("Enter a string :-");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int special = 0;
		int consonant = 0;
		int vowel = 0;
		for (int i = 0; i < str.length(); i++) {
			int temp = (int) str.charAt(i);
			if ((str.charAt(i) >= 'a' && str.charAt(i) <= 'z') || (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')) {
				if (str.charAt(i) == 'a' || str.charAt(i) == 'A' || str.charAt(i) == 'e' || str.charAt(i) == 'E'
						|| str.charAt(i) == 'i' || str.charAt(i) == 'I' || str.charAt(i) == 'o'
						|| str.charAt(i) == 'O' | str.charAt(i) == 'u' || str.charAt(i) == 'U') {
					vowel += 1;
				} else {
					consonant += 1;
				}
			} else if (temp < 48 || temp > 57) {
				special += 1;
			}
		}
		System.out.println("Vowels Count is: " + vowel);
		System.out.println("Consonants Count is: " + consonant);
		System.out.println("Special Characters Count is: " + special);

		sc.close();
	}
}

//Q5)Solution

package in.neuron.com.Assignment4;

//WAP to implement Anagram Checking least inbuilt methods being used.
import java.util.*;

public class Q5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First String");
		String dup1 = sc.nextLine();
		String str=dup1.toLowerCase();
		System.out.println("Enter the Second String");
		String dup2 = sc.nextLine();
		String str1=dup2.toLowerCase();
		sc.close();
		if (str.length()!=str1.length()) {
			System.out.println("Entered Strings are not Anagrams");
		}
		if (str.length() == str1.length()) {
			int count = 0;
			int n = 0;
			for (int i = 0; i < str.length(); i++) {
				for (int j = 0; j < str1.length(); j++) {
					if (str.charAt(i)==str1.charAt(j)) {
						count++;
					}
					if (str.charAt(i) != str1.charAt(j)) {
						n++;
					}
				}
				if (n == str1.length()) {
					break;
				}
			}
			if (count < str1.length()) {
				System.out.println(dup1 + " and " + dup2 + " are not Anagrams");
			}
			if (count >= str1.length()) {
				System.out.println(dup1 + " and " + dup2 + " are Anagrams");
			}
		}

	}
}


//Q6)Solution

package in.neuron.com.Assignment4;
//WAP to implement Pangram Checking with least inbuilt methods being used.
import java.util.*;
public class Q6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str1=sc.nextLine();
		String str=str1.toLowerCase();
		sc.close();
		
			int count=0;
			for(char i='a';i<='z';i++) {
				for(int j=0;j<str.length();j++) {
					if(str.charAt(j)==i) {
						count++;
					}
					
					
					}
				}
			if(count>=26) {
				System.out.println(str+" is pangram");
			}
			if(count<26) {
				System.out.println(str+" is not pangram");
			}
		}
		
		

	}


//Q7)Solution

package in.neuron.com.Assignment4;

//WAP to find if String contains all unique characters.
import java.util.*;

public class Q7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String st = sc.nextLine();
		String str=st.replace(" ","");
		sc.close();
		boolean flag = true;
		for (int i = 0; i < str.length(); i++) {

			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					flag = false;
				}
			}
		}
		if (flag == false) {
			System.out.println(st + " String does not have unqiue characters");
		} else {
			System.out.println(st + " String contains unique characters");
		}

	}
}


//Q8)Solution

package in.neuron.com.Assignment4;

//WAP to find the maximum occurring character in a String.
import java.util.*;

public class Q8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine().replace(" ","");
		sc.close();
		int[] count = new int[str.length()];
		int index = 0;
		int temp = 0;
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					count[i] += 1;
				}
			}
		}
		for (int i = 1; i < count.length; i++) {
			if (count[i - 1] > count[i]) {
				index = (i - 1);
			}
		}
		for (int i = 0; i < count.length; i++) {
			if (i == index) {
				continue;
			}

			if (count[i] == count[index]) {
				temp = 1;
			}
		}

		if (temp == 0)
			System.out.println("Maximum occuring character in " + str + " is " + str.charAt(index) + " ");
		if (temp == 1) {
			System.out.println("There are more than one maximum occuring characters in " + str);
		}
	}

}
