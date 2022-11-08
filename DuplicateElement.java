
public class DuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,3,5,7,3,2,6,2,9,4,9};
		
		boolean flag=false;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("Found Duplicate Element"+" "+arr[i]);
					flag=true;
					break;
				}
			}
		}
		if(flag==false)
		{
			System.out.println("Duplicate Element Not Found");
		}

	}

}
