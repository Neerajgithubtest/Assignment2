
public class SelectionSort1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {8,4,7,9,1,6};
		for(int i=0;i<arr.length-1;i++)
		{
			int  low=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[low]>arr[j])
				{
					low=j;
				}
			}
			
			int temp =arr[low];
			arr[low]=arr[i];
			arr[i]=temp;
		}
		
		for(int elem:arr)
		{
			System.out.print(elem+" ");
		}
	}

}
