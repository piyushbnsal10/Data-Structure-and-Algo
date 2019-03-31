package Day_2_Arrays;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.*;

public class triple_sum_pair {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine());
		int[] array=new int[9];
		for(int i=0;i<9;i++)
			array[i]=Integer.parseInt(st.nextToken());
		
		int sum=Integer.parseInt(st.nextToken());
		Arrays.sort(array);
		
		for(int i=0;i<array.length-2;i++)
		{
			int l=i+1;
			int r=array.length-1;
			
			while(l<r)
			{
				if(array[i]+array[l]+array[r]==sum)
					{
						System.out.println(array[i]+", "+array[l]+", "+array[r]);
						l++;
					}
				else if(array[i]+array[l]+array[r]<sum)
					l++;
				else
					r--;
			}
		}
		

	}

}
//1 2 3 4 5 6 7 8 9 6