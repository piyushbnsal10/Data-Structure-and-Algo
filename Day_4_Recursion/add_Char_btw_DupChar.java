package Day_4_Recursion;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class add_Char_btw_DupChar {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine());
		String str=String.valueOf(st.nextToken());
		int idx=1;
		StringBuilder sb= new StringBuilder();
		sb.append(str.charAt(0));
		System.out.println(string(str,idx,sb));

	}
		
	public static String string(String str,int idx,StringBuilder sb)
	{
		if(idx==str.length())
			return sb.toString();
		
		
		if(str.charAt(idx)==str.charAt(idx-1))
			sb.append('*');
		
		sb.append(str.charAt(idx));
		
		return string(str,idx+1,sb);
	}
}
