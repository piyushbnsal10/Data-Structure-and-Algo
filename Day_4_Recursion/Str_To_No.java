package Day_4_Recursion;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Str_To_No {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int no=0;
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine());
		String str=String.valueOf(st.nextToken());
		int idx=str.length()-1,rem=0;
		System.out.println(No(str,no,idx,rem,str.length()));

	}
		
	public static int No(String str,int no,int idx,int rem,int len)
	{
		if(idx<0)
			return no;
		
		rem=((int)str.charAt(idx)-48)%10;
		no=(int) (no+rem*Math.pow(10,len-idx-1));
		
		return No(str,no,idx-1,rem,len);
	}
}
