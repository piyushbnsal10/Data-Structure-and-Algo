package Day_4_Recursion;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Digits_Sum_String {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int count=0,itr=0;
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine());
		String str=String.valueOf(st.nextToken());
		System.out.println(sum(str,count,itr));

	}
		
	public static int sum(String str,int count,int idx)
	{
		if(idx==str.length())
			return count;
		count=count+(int)str.charAt(idx)-48;
		
		return sum(str,count,idx+1);
	}
}