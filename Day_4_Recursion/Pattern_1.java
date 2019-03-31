package Day_4_Recursion;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pattern_1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken());
		
		Pattern_print(n,1);
	}
	
	public static void Pattern_print(int n,int i)
	{
		if(n==0)
			return;
		
		if(i<=n)
		{
			System.out.print('*');
			Pattern_print(n,i+1);
		}
		
		else
		{
			System.out.println();
			Pattern_print(n-1,1);	
		}
	}
}
