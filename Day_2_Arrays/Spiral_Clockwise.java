package Day_2_Arrays;

import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

//1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
public class Spiral_Clockwise {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine());
		int [][] array= new int[4][4];
		for(int i=0;i<4;i++)
			for(int j=0;j<4;j++)
				array[i][j]=Integer.parseInt(st.nextToken());
		int [] spiral =spiral_array(array);
		for(int i=0;i<spiral.length;i++)
			System.out.print(spiral[i]+", ");
	}

	public static int[] spiral_array(int[][] array) {
		// TODO Auto-generated method stub
		int left=0;
		int right=array.length-1;
		int up=0;
		int down=array.length-1;
		int direction=1;
		int idx=0;
		int [] spiral=new int[16];
		while(left<=right && up<=down)
		{
			if(direction==1)
			{
				for(int i=left;i<=right;i++)
				{
					spiral[idx]=array[up][i];
					idx++;
					//System.out.println("D1");
				}
				up++;
				direction=4;
					
			}
			
			else if(direction==4)
			{
				for(int i=up;i<=down;i++)
				{
					spiral[idx]=array[i][right];
					idx++;
					//System.out.println("D4");
				}
				right--;
				direction=3;
			}
			
			else if(direction==3)
			{
				for(int i=right;i>=left;i--)
				{
					spiral[idx]=array[down][i];
					idx++;
					//System.out.println("D3");
				}
				down--;
				direction=2;
			}
			
			else if(direction==2)
			{
				for(int i=down;i>=up;i--)
				{
					spiral[idx]=array[i][left];
					idx++;
				//	System.out.println("D2");
				}
				left++;
				direction=1;
			}
		}
		return spiral;
	}

}
