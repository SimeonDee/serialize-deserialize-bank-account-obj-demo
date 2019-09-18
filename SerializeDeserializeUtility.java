
package SerializeDeserializeUtility;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializeDeserializeUtility {
     public static void accountSerialize(Object object, String filename)
            throws IOException
    {
            FileOutputStream FOS = new FileOutputStream(filename);
            BufferedOutputStream BOS = new BufferedOutputStream(FOS);
            ObjectOutputStream OOS = new ObjectOutputStream(BOS);
            OOS.writeObject(object);
            OOS.close();      
    }
    
    public static List<BankAccount> accountDeserialize(String filename)
            throws IOException, ClassNotFoundException
    {       
            List<BankAccount> reply = new ArrayList<BankAccount>();
        
            FileInputStream FOS = new FileInputStream(filename);
            BufferedInputStream BOS = new BufferedInputStream(FOS);
            ObjectInputStream OIS = new ObjectInputStream(BOS);
            reply = (List<BankAccount>) OIS.readObject();
            OIS.close();
            
            return reply;

    }

    
}
