
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[]= {12,5,6,8,1,45,3};
		 BubbleSort bSort=new BubbleSort();
		 bSort.setData(arr);
		 System.out.println("Before sorting");
		 bSort.printArray(arr);
		 bSort.sort(arr);
		 System.out.println("After sorting in ascending order");
		 bSort.printArray(arr);
		 BubbleSort.sort();
	}

}
