public class BubbleSort
{
	private int []arr;
	public int[] getArr()
	{
		return arr;
	}
	
	public void setArr(int[] arr)
	{
		this.arr = arr;
	}
	
	public void sort()
	{
		if(this.arr == null)
		{
			return;
		}
		for (int i = 0; i < this.arr.length - 1; i++) 
		{
			for (int j = 0; j < this.arr.length - 1; j++) 
			{
				if(this.arr[j] > this.arr[j+1])
				{
					int temp = this.arr[j];
					this.arr[j] = this.arr[j+1];
					this.arr[j+1] = temp;
				}
			}
		}
	}
	 public void display()
	 {
		 for(int i = 0; i < this.arr.length; i++)
		 {
			 System.out.println(this.arr[i] + " ");
		 }
	 }
}
