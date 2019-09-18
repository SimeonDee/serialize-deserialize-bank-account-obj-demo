
//Serialization
package java201_7;

import java.io.IOException;
//*******************************************
//ASSIGNEMENT
//Write a program that will Serialize/Deserialize a 
//list of entities of your own choice
//Note: Students can search for an item by name or by id 
//*******************************************

//SERIALIZER TEST
public class Java201_7 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
       Student MyStudent = new Student();
       MyStudent.setMatricNo("209188");
       MyStudent.setName("Kolade");
       MyStudent.setGpa(4.97);
       
       StudentSerializerDeserializer.
               accountSerialize(MyStudent, 
                       "C:\\Users\\SIMEON_DEE\\Documents\\myfile.ser");
       Student deserializedStudent = 
               StudentSerializerDeserializer.
                       accountDeserialize(
                               "C:\\Users\\SIMEON_DEE\\Documents\\myfile.ser");
       
       
       System.out.println("Output: \n" + deserializedStudent.getMatricNo() + 
               "\t" + deserializedStudent.getName() + "\t" + 
               deserializedStudent.getGpa());
        
       
    }
    
}
