import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
public class ObjectSerial {
	
	public static void main(String agrs[]) throws Exception{
		Save obj = new Save();
	    obj.i=10;

		
		Save obj1 =new Save();
		
		File f =new File("obj.Text");
		FileOutputStream fos =new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(obj);
		
		
		
		
		FileInputStream fis =new FileInputStream(f);
		ObjectInputStream ois= new ObjectInputStream(fis);
		Save Obj1 = (Save)ois.readObject();
		
		System.out.println("Object of values " +obj.i);

		
	}

}
class Save implements Serializable {
	
	int i;
}