package pwString;
import java.util.*;


public class stringbuilderquestion {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s = sc.nextLine();
		StringBuilder sb = new StringBuilder(s);
		System.out.println(sb);
		int n = sb.length();
		for(int i =0; i< n; i++) {
			char ch = sb.charAt(i);
			int ascii = (int)ch;
			System.out.println(ch + " --> " + ascii );
		}
		
	}
}
