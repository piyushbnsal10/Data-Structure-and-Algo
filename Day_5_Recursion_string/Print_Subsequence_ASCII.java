package Day_5_Recursion_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Print_Subsequence_ASCII {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine());
		String str=String.valueOf(st.nextToken());
		printSS(str,"");
	}

	
	public static void printSS(String str, String result) {
		if (str.length() == 0) {
			System.out.println(result);
			return;
		}

		char cc = str.charAt(0);
		String ros = str.substring(1);
		printSS(ros, result);
		printSS(ros, result + cc);
		printSS(ros, result + (int)cc);
	}

}
