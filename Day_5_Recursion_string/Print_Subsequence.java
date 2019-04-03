package Day_5_Recursion_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Print_Subsequence {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine());
		String str=String.valueOf(st.nextToken());
		printSS(str,"",1,1);
	}

	
	public static void printSS(String str, String result,int count1,int count2) {
		if (str.length() == 0) {
			System.out.println(result+" "+count1);
			return;
		}

		char cc = str.charAt(0);
		String ros = str.substring(1);
		printSS(ros, result,count1,count2);
		printSS(ros, result + cc,count1+count2,count2);
	}

}
