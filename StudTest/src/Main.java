import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args)
	{
		serializaStudent();
		deserializaStudent();
	}
	
	private static void deserializaStudent() {
		FileInputStream fin=null;
		ObjectInputStream oin=null;
		try
		{
			fin = new FileInputStream(new File("Stud.txt"));
			oin = new ObjectInputStream(fin);
			Student s1=(Student) oin.readObject();
			System.out.println(" --> "+ s1.getName()+ " | Indian= "+s1.getIsIndian());
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
		finally {
			try {
				fin.close();
				oin.close();		
			} 
			catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	private static void serializaStudent() {
		FileOutputStream fout=null;
		ObjectOutputStream oout=null;
		
		try
		{
			fout=new FileOutputStream(new File("Stud.txt"));
			oout=new ObjectOutputStream(fout);
			Student s=new Student(1727,"Dig Solanki ", false);
			oout.writeObject(s);
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
		finally {
			try {
				fout.close();
				oout.close();
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
		

