package Q5;
import java.io.FileInputStream;
import java.io.FileNotFoundException; 
// Original code
/*
public class Demo1
	{ 
	
	public static FileInputStream M1(String fileName)
	{
		FileInputStream fis2 = new FileInputStream(fileName);
		System.out.println("M1: File input stream created");
		return fis2;
	} 
	public static void main(String args[])
	{
		FileInputStream fis1 = null;
		String fileName = "foo.bar";
		
		System.out.println("main: Starting " + Demo1.class.getName()
				+ "with file name = "  + fileName); 
		fis1 = M1(fileName);
		System.out.println("main:" + Demo1.class.getName() + "ended");
	}
}
*/
// Solution way 1
/*
public class Demo1{ 
	public static FileInputStream M1(String fileName) 
	{
		try {
			FileInputStream fis2 = new FileInputStream(fileName);
			System.out.println("M1: File input stream created");
		return fis2;
		}
		catch(FileNotFoundException fe){
			System.out.println("M1: File input stream isn't created");
		}
		return null;
	}
	public static void main(String args[])
	{

			FileInputStream fis1 = null;
			String fileName = "foo.bar";

			System.out.println("main: Starting " + Demo1.class.getName()
				+ "with file name = "  + fileName); 
			fis1 = M1(fileName);
			System.out.println("main:" + Demo1.class.getName() + "ended");
		
	} 
}
*/
//Solution way 2
public class Demo1{
	public static FileInputStream M1(String fileName) throws FileNotFoundException 
	{
		FileInputStream fis2 = new FileInputStream(fileName);
		System.out.println("M1: File input stream created");
		return fis2;
	}
	public static void main(String args[])
	{
		try {
			FileInputStream fis1 = null;
			String fileName = "foo.bar";

			System.out.println("main: Starting " + Demo1.class.getName()
				+ "with file name = "  + fileName); 
			fis1 = M1(fileName);
		}
		catch(FileNotFoundException fe) {
			System.out.println("M1: File input stream isn't created");
		}
		finally {
			System.out.println("main:" + Demo1.class.getName() + "ended");
		}
	} 
}
