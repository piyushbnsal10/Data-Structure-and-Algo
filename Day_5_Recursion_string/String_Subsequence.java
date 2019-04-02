package Day_5_Recursion_string;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class String_Subsequence {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine());
		String str=String.valueOf(st.nextToken());
		ArrayList<String> list=subsequence(str);
		System.out.println(list);
		
	}
		
	public static ArrayList<String> subsequence(String str)
	{
		if(str.length()==0)
		{
			ArrayList<String> BaseResult=new ArrayList<>();
			BaseResult.add("");
			return BaseResult;
	    }
		
		char cc=str.charAt(0);
		String ros=str.substring(1);
		
		ArrayList<String> myresult= new ArrayList<>();
		ArrayList<String> SubResult= subsequence(ros);
		
		for(int i=0;i<SubResult.size();i++)
		{
			String sub=SubResult.get(i);
			String sub_add=cc+sub;
			myresult.add(sub);
			myresult.add(sub_add);
		}
		
		return myresult;
	}

}