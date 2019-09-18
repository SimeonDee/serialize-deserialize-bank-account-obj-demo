
package SerializeDeserializeUtility;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MyMainClass {
    public static void main(String[] args){ 
        try{
            System.out.println("ADEYEMI ADEDOYIN SIMEON -- 209188\n");
            List<BankAccount> accountList = new ArrayList<>();
            String filename = 
                    "C:\\Users\\SIMEON_DEE\\Documents\\SerializedTextFile.ser";

            BankAccount doyinAccount = new BankAccount(100,"Adedoyin Simeon",
                    "Current",25000);
            BankAccount waleAccount = new BankAccount(101,"Badejo Olawale",
                    "Savings",12000);
            BankAccount seunAccount = new BankAccount(102,"Oluwadele Seun",
                    "Savings",22000);

            accountList.add(doyinAccount);
            accountList.add(waleAccount);
            accountList.add(seunAccount);


            SerializeDeserializeUtility.accountSerialize(accountList, filename);
            System.out.println("SERIALIZATION");
            System.out.println("Object Serialized into "+filename+
                    " succefully..\n");

            List<BankAccount> deserAccountList  = 
                    SerializeDeserializeUtility.accountDeserialize(filename);

            System.out.println("DESERIALIZATION");
            System.out.println("Deserialized Contents...\n");
            for(BankAccount account : deserAccountList){
                System.out.println(account);
            }

        } catch(IOException ioex){
            System.out.println("IO Exception Occured "+ ioex.getMessage());
//       } catch(ClassNotFoundException cnfex){
//            System.out.println("CNF Exception Occured "+ cnfex.getMessage());
        } catch(Exception ex){
            System.out.println("Normal Exception Occured "+ ex.getMessage());
        }
        
        
    }
    
}
