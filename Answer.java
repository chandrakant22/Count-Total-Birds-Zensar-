package zenser;

import java.util.Scanner;

public class Code1 {

	
	public static int countTotalBirds(int rowNumber)
	{
		int N = rowNumber * (rowNumber + 1) / 2;
        int f[] = new int[N + 1];
        f[1] = 1;
        f[2] = 1;
 
        for (int i = 3; i <= N; i++)
            f[i] = f[i - 1] + f[i - 2];
 
        int fiboNum = 1,sum=0,x=0;

        for (int i = 1; i < rowNumber; i++) {
            for (int j = 1; j <= i; j++)	
            {
            	 x++;
            	int a=f[++fiboNum];
                sum+=a;
                if(x==rowNumber)
                {
                return sum;
                }
               
            }
        }
		return sum;
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows");
		int row=sc.nextInt();
		System.out.println(countTotalBirds(row));

	}

}
