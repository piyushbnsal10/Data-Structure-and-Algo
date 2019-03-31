package Day_3_Strings;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class String_Compression {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine());
		String str= String.valueOf(st.nextToken());
		str=str.concat(" ");
		System.out.println(string_compression(str));
		

	}
	
	public static String string_compression(String str)
	{
		int count=0,new_count;
		StringBuilder sb= new StringBuilder();
		
		for(int i=0;i<str.length()-1;i++)
		{	
			char ch=str.charAt(i);
			if(str.charAt(i)==str.charAt(i+1))
					count++;	
			else
				{
					sb.append(ch);
					if(count!=0)
					sb.append(count+1);
					count=0;
				}
		}
		
		return sb.toString();
	}
}//aaaaabbcddee
