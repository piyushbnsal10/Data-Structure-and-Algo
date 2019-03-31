package Day_1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
public class SquareRoot_Integral {

	private static boolean True;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine());
		int no= Integer.parseInt(st.nextToken());
		System.out.print(Root_Integral(no));
	}
		
	public static int Root_Integral(int no)
	{
		int start=0;
		int end=no;
		int mid= (start+end)/2;
		int x=0;
		while(true)
		{
			x=mid;
			
			if(Math.pow(mid, 2)==no)
				return mid;
			if(Math.pow(mid, 2)> no)
				end=mid;
			else
				start=mid;
		mid=(start+end)/2;
		
		if(x==mid)
			return mid;
		}
	}
}
