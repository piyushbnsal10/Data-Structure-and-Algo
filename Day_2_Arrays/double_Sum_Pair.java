package Day_2_Arrays;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class double_Sum_Pair {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st1=new StringTokenizer(br.readLine());
		int n= Integer.parseInt(st1.nextToken());
		int sum=Integer.parseInt(st1.nextToken());
		int[] array= new int[n];
		StringTokenizer st2=new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++)
			array[i]=Integer.parseInt(st2.nextToken());
		
		HashMap<Integer,Integer> map= new HashMap<>();
		for(int i=0;i<n;i++)
		{
			if(!map.containsKey(array[i]))
				map.put(array[i], 0);
			
				map.put(array[i],map.get(array[i])+1);
		}
		
		int twice_count=0;
		for(int i=0;i<n;i++)
		{
			if(map.get(sum-array[i])!=null)
				{
					twice_count+=map.get(sum-array[i]);
					System.out.println(sum-array[i]+", "+array[i]);
				}
			
			if(sum-array[i]==array[i])
				twice_count--;
		
		}
		System.out.println("Count : "+twice_count/2);
		
	}

}
