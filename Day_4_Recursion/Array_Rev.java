package Day_4_Recursion;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Array_Rev {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int[] arr =new int[6];
		StringTokenizer st= new StringTokenizer(br.readLine());
		for(int i=0;i<6;i++)
		{
			arr[i]=Integer.parseInt(st.nextToken());
		}
		int[] rev_arr=new int[6];
		rev_arr=Arr_Rev(arr,rev_arr,arr.length-1,0);
		
		for(int i=0;i<6;i++)
			System.out.print(rev_arr[i]+" ");
	}
	
	public static int[] Arr_Rev(int[] arr,int[] rev_arr,int end, int start)
	{
		if(end<0)
			return rev_arr;
		
		rev_arr[start]=arr[end];
		
		return Arr_Rev(arr,rev_arr,end-1,start+1);
			
		
	}
}
