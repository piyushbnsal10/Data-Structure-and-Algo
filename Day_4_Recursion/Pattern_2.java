package Day_4_Recursion;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pattern_2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken());
		
		Pattern_print(0,1,n);
	}
	
	public static void Pattern_print(int n,int i,int end)
	{
		if(n==end+1)
			return;
		
		if(i<=n)
		{
			System.out.print('*');
			Pattern_print(n,i+1,end);
			
		}
		
		else
		{
			System.out.println();
			Pattern_print(n+1,1,end);	
		}
	}
}
