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
			if(ascii >= 65 && ascii <=90) {
				ascii += 32;
			}else if(ascii >= 96 && ascii <=122){
				ascii = ascii - 32;
			}
			ch = (char)ascii;
			sb.setCharAt(i, ch);
		}
		System.out.println(sb);
	}
}
