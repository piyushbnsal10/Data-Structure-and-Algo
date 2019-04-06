package CodeJam_2018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.String;
import java.util.Scanner;

class Practice_2{

	public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);
    int t= input.nextInt();
    for(int i=0;i<t;i++)
    {
        int a= input.nextInt();
        int b= input.nextInt();
        int n= input.nextInt();
        
        int j=0;
        while(j<n)
        {
            int guess=(a+b+1)/2;
            System.out.print(guess);
            
            String output=input.next();
            if(output.equals("correct"))
                break;
            else if(output.equals("TOO_BIG"))
                b=guess-1;
            else
                a=guess+1;
            j++;
        }
    }
   }
}