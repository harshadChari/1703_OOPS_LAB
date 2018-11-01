package pojo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MainApp {
	
	public static void main(String args[])
	{
		Student s1 = new Student("Mario","M",65);
		Serialize(s1,"serialData.txt");
		
		Student s2 = Deserialize("serialdata.txt");
		s2.displayStudent();
	}
	
	public static void Serialize(Student s,String filename)
	{
		FileOutputStream fout = null;
		ObjectOutputStream oout = null;
		
		try
		{
			fout = new FileOutputStream(new File(filename));
			oout = new ObjectOutputStream(fout);
			oout.writeObject(s);
			
		}
		catch(Exception ex1)
		{
			ex1.printStackTrace();
		}
		finally
		{
			try
			{
				fout.close();
				oout.close();
			}
			catch(Exception ex2)
			{
				ex2.printStackTrace();
			}
		}
		
	}
	
	public static Student Deserialize(String filename)
	{
		FileInputStream fin = null;
		ObjectInputStream oin = null;
		
		try
		{
			fin = new FileInputStream(new File(filename));
			oin = new ObjectInputStream(fin);
			Student s = (Student) oin.readObject();
			
			return s;
		}
		catch(Exception ex1)
		{
			ex1.printStackTrace();
		}
		finally
		{
			try
			{
				fin.close();
				oin.close();
			}
			catch(Exception ex2)
			{
				ex2.printStackTrace();
			}
		}
		return null;
	}

}
