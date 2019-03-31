package Day_3_Strings;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Max_Freq {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine());
		String str= String.valueOf(st.nextToken());
		str=str.concat(" ");
		System.out.println(remove_duplicate(str));
		

	}
	
	public static Character remove_duplicate(String str)
	{
		int count=0;
		StringBuilder sb= new StringBuilder();
		int max=Integer.MIN_VALUE;
		char ch = 0;
		for(int i=0;i<str.length()-1;i++)
		{	
			
			if(str.charAt(i)==str.charAt(i+1))
					count++;	
			else
				{
					if(max<count)
						{
							max=count;
							ch=str.charAt(i);
						}
					count=0;
				}
		}
		
		return ch;
	}
}//aaaaabbcddee
