package CodeJam_2018;


import java.util.Scanner;
import java.lang.Math;

class Qualification_Round1 {

	public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int q= input.nextInt();
    for(int i=0;i<q;i++)
    {
        int n= input.nextInt();
        int t=n;
        
        int length=len(n);
        int[] arr=new int[length];
        int j=0;
        double pair1=0;
        while(t>0)
        {
            int digit_4=t%10;
            arr[j]=digit_4;
            t/=10;
            if(digit_4==4)
                pair1=pair1+Math.pow(10,j);
            j++;
        }
        
        System.out.println("Case #"+(i+1)+": "+(int)pair1+" "+(int)(n-pair1));
        
        
    
    }
}

public static int len(int num) {

        int count = 0;

        while(num != 0)
        {
            // num = num/10
            num /= 10;
            ++count;
        }

        return count;
    }
}