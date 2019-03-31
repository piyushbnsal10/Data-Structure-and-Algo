package Day_1;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Uppercase_Lowercase {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine());
		char c= String.valueOf(st.nextToken()).charAt(0);
		System.out.println(Character.isUpperCase(c));
		
		
	}

}
