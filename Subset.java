
public class Subset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,4,6,9,8,7};
		int[] arr1= {1,8,7,4};
		
		boolean flag=true;
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr1[i]==arr[j])
				{
					flag=true;
					break;
				}
				else
				{
					flag=false;
				}
			}
		}
		
		if(flag==true)
		{
			System.out.println("arr1 subset of arr");
		}
		else
		{
			System.out.println("arr1 is not subset of arr");
		}

	}

}
