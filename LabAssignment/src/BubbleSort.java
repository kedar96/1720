
public class BubbleSort {
	private int data[];
	
	public int[] getData() {
		return data;
	}


	public void sort(int[] arr )
	{
		 int n=arr.length;
		 int i,j,temp;
		 for(i=0;i<n-1;i++)
		 {
			 for(j=0;j<n-i-1;j++)
			 {
				 if(arr[j]>arr[j+1])
				 {
					 	temp = arr[j];
	                    arr[j] = arr[j+1];
	                    arr[j+1] = temp;
				 }
			 }
		 }
	}


	public void setData(int[] arr) {
		// TODO Auto-generated method stub
		
	}




	public static void printArray(int[] arr) {
		// TODO Auto-generated method stub
		int i; 
		for (i=0; i<arr.length; ++i)
	     {
			 System.out.println(arr[i] + " ");
	     }
	}


	public static void sort() {
		// TODO Auto-generated method stub
		
	}

	
}
