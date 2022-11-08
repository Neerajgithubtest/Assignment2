import java.util.Scanner;

public class BabbleSort {

	public static void main(String[] args) {
		int[] ar= {7,5,2,3,8,9};
		
		for(int i=0;i<ar.length-1;i++)
		{
			for(int j=0;j<ar.length-i-1;j++)
			{
				if(ar[j]>ar[j+1])
				{
					int temp=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
				}
			}
		}
		for(int elem:ar)
		{
			System.out.print(elem+" ");
		}	
		
	}

}
