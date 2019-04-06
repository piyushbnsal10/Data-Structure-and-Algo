package CodeJam_2018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.String;

class Practice {

	public static void main(String[] args) throws IOException {
    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st= new StringTokenizer(br.readLine());
    int t= Integer.parseInt(st.nextToken());
    for(int i=0;i<t;i++)
    {
        st= new StringTokenizer(br.readLine());
        int a=Integer.parseInt(st.nextToken());
        int b=Integer.parseInt(st.nextToken());
        
        st= new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        
        int j=0;
        while(j<n)
        {
            int guess=(a+b+1)/2;
            System.out.print(guess);
            //st= new StringTokenizer(br.readLine());
            String output=br.readLine();
            if(output.equals("correct"))
                break;
            else if(output.equals("TOO_BIG"))
                b=guess-1;
            else if(output.equals("TOO_SMALL"))
                a=guess+1;
            j++;
        }
    }
   }
}