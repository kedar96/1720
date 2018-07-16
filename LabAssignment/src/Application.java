public class Application {
	
	public static void main(String args[]) {
		int []arr = {12,39,34,56,2, 15, 1,22};
	
		BubbleSort bSort = new BubbleSort();
		bSort.setArr(arr);
		System.out.println("Array Before sorting: ");
		bSort.display();
		bSort.sort();
		System.out.println("\nArray after sorting: ");
		bSort.display();
	
	}
	
}
