package Day_3_Strings;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class remove_dup_alphabets {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine());
		String str= String.valueOf(st.nextToken());
		str=str.concat(" ");
		System.out.println(remove_duplicate(str));
		

	}
	
	public static String remove_duplicate(String str)
	{
		int count=0;
		StringBuilder sb= new StringBuilder();
		
		for(int i=0;i<str.length()-1;i++)
		{	
			char ch=str.charAt(i);
			if(str.charAt(i)==str.charAt(i+1))
					count++;	
			else
				{
					sb.append(ch);
					count=0;
				}
		}
		
		return sb.toString();
	}
}//aaaaabbcddee
