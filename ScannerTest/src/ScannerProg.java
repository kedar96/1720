import java.util.Scanner;

public class ScannerProg {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in); 
 
        String name = sc.nextLine(); 
        char gender = sc.next().charAt(0);  
        int age = sc.nextInt(); 
        long mobileNo = sc.nextLong(); 
        double cgpa = sc.nextDouble(); 
  
        // Print the values to check if input was correctly obtained. 
        System.out.println("Name: "+name); 
        System.out.println("Gender: "+gender); 
        System.out.println("Age: "+age); 
        System.out.println("Mobile Number: "+mobileNo); 
        System.out.println("CGPA: "+cgpa); 
	}

}
