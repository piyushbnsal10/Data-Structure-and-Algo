package CodeJam_2018;

import java.util.Scanner;
import java.io.*;

public class Qualification_Round1_ques_2
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        
        for(int i=0;i<t;i++)
        {
            int n=scan.nextInt();
            String l_path=scan.next();
            
            StringBuilder sb=new StringBuilder();
            for(int j=0;j<l_path.length();j++)
            {
                if(l_path.charAt(j)=='E')
                    sb.append('S');
                else
                    sb.append('E');
            }
            System.out.println(sb);
        }
    }
}