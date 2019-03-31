package Day_3_Strings;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class max_palindrome_substring_DP {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine());
		String str=st.nextToken();
		
		System.out.println(Count(str.toCharArray(),str.length()));
	}
	
	public static int Count(char str[], int n)
	{
		boolean[][] dp = new boolean[n][n];
		int length=0;
		int max=0;
		for(int i=0;i<n;i++)
			{
				dp[i][i]=true;
				max=1;
			}
		
		for(int i=0;i<n-1;i++)
			if(str[i]==str[i+1])
				{
					dp[i][i+1]=true;
					max=2;
				}
		
		for(int j=2;j<n;j++)
		{
			for(int i=0;i<n-2;i++)
			{
				if(str[i]==str[j] && dp[i+1][j-1])
					{
						dp[i][j]=true;
						length=j-i+1;
						if(max<length)
							max=length;
					}
			}
		}
		
		return max;
	}
}
