package Day_4_Recursion;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Str_Comp {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int no=0;
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine());
		String str1=String.valueOf(st.nextToken());
		st= new StringTokenizer(br.readLine());
		String str2=String.valueOf(st.nextToken());
		int idx=0;
		System.out.println(Comp(str1,str2,idx));

	}
		
	public static boolean Comp(String str1,String str2,int idx)
	{
		if(str1.length()!=str2.length())
			return false;
		
		if(str1.charAt(idx)!=str2.charAt(idx))
			return false;
		
		if(idx==str1.length()-1)
			return true;
		return Comp(str1,str2,idx+1);
	}
}
