package Day_4_Recursion;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Nth_Traingle_Sum {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken());
		
		Sum(n,0);
	}
	
	public static void Sum(int n,int i)
	{
		if(n==0)
		{
			System.out.println(" = "+i);
			return;
		}
		System.out.print(i+"+");
		Sum(n-1,i+n);
		
	}
}
