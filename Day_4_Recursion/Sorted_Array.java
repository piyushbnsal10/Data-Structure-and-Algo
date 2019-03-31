package Day_4_Recursion;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sorted_Array {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int[] arr =new int[6];
		StringTokenizer st= new StringTokenizer(br.readLine());
		for(int i=0;i<6;i++)
		{
			arr[i]=Integer.parseInt(st.nextToken());
		}
		
		System.out.println(IsSorted(arr,arr.length));
	}
	
	public static boolean IsSorted(int[] arr,int n)
	{
		if(n==0 || n==1)
			return true;
		
		if(arr[n-1]<arr[n-2])
			return false;
		
		return IsSorted(arr,n-1);
			
		
	}
}
