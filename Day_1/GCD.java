package Day_1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GCD {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st2=new StringTokenizer(br.readLine());
		int no1=Integer.parseInt(st2.nextToken());
		int no2=Integer.parseInt(st2.nextToken());
		
		int gcd=GCD(no1,no2);
		System.out.println(gcd);
			
	}
	
	public static int GCD(int x, int y)
	{
		int start=1;
		int gcd=0;
		while(start<=x && start<=y)
		{
			if(x%start==0 && y%start==0)
				gcd=start;
		start++;
		}
		return gcd;
	}
}

//Working program using BufferedReader 
/*import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.StringTokenizer; 

public class GCD 
{ 
	public static void main(String[] args) throws IOException 
	{ 

		BufferedReader br = new BufferedReader( 
							new InputStreamReader(System.in)); 

		StringTokenizer st = new StringTokenizer(br.readLine()); 
		int n = Integer.parseInt(st.nextToken()); 
		int k = Integer.parseInt(st.nextToken()); 
		int count = 0; 
		while (n-- > 0) 
		{ 
			int x = Integer.parseInt(br.readLine()); 
			if (x%k == 0) 
			count++; 
		} 
		System.out.println(count); 
	} 
} */
