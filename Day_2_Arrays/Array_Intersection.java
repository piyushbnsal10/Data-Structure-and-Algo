package Day_2_Arrays;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.StringTokenizer;
public class Array_Intersection {


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int[] ary_1= new int[7];
		int[] ary_2 =new int[7];
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st1=new StringTokenizer(br.readLine());
		for(int i=0;i<7;i++)
			ary_1[i]=Integer.parseInt(st1.nextToken());
		StringTokenizer st2=new StringTokenizer(br.readLine());
		for(int i=0;i<7;i++)
			ary_2[i]=Integer.parseInt(st2.nextToken());
		
		HashMap<Integer,Integer> array_1= new HashMap<>();
		for(int i=0;i<7;i++)
		{
			if(!array_1.containsKey(ary_1[i]))
				array_1.put(ary_1[i], 0);
			
				array_1.put(ary_1[i],array_1.get(ary_1[i])+1);
		}
		
		HashMap<Integer,Integer> array_2= new HashMap<>();
		for(int i=0;i<7;i++)
		{
			if(!array_2.containsKey(ary_2[i]))
				array_2.put(ary_2[i], 0);
			
				array_2.put(ary_2[i],array_2.get(ary_2[i])+1);
		}
		ArrayList<Integer> arrli = new ArrayList<Integer>();
		for (Entry<Integer, Integer> entry1 : array_1.entrySet()) {
				int key = entry1.getKey();
				int value1 = entry1.getValue();
				if(array_2.get(key)!=null)
			    {
					int value2 = array_2.get(key);
					if( value1>=2 && value2>=2 )
						for (int i=0;i<Math.min(value1,value2);i++)
							arrli.add(key);
			    }
			}
		System.out.println(arrli);
		
	}

}
