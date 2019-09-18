
package java201_7;
//Serializer and Deserializer methods
import java.io.*;

public class StudentSerializerDeserializer {
    public static void accountSerialize(Object object, String filename)
            throws IOException
    {
            FileOutputStream FOS = new FileOutputStream(filename);
            BufferedOutputStream BOS = new BufferedOutputStream(FOS);
            ObjectOutputStream OOS = new ObjectOutputStream(BOS);
            OOS.writeObject(object);
            OOS.close();      
    }
    
    public static Student accountDeserialize(String filename)
            throws IOException, ClassNotFoundException
    {                     
            FileInputStream FOS = new FileInputStream(filename);
            BufferedInputStream BOS = new BufferedInputStream(FOS);
            ObjectInputStream OIS = new ObjectInputStream(BOS);
            Student student = (Student) OIS.readObject();
            OIS.close();
            
            return student;

    }
    
}
