package Day_4_Recursion;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_in_array {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int[] arr =new int[6];
		StringTokenizer st= new StringTokenizer(br.readLine());
		for(int i=0;i<6;i++)
		{
			arr[i]=Integer.parseInt(st.nextToken());
		}
		int n0=Integer.parseInt(st.nextToken());
		System.out.println(N0_check(arr,arr.length-1,n0));
	}
	
	public static boolean N0_check(int[] arr,int n,int n0)
	{
		if(n<0)
			return false;
		
		if(arr[n]==n0)
			{
				System.out.println(n);
				return true;
			}
		
		return N0_check(arr,n-1,n0);
			
		
	}
}
