//Serializable Interface Example
package java201_7;

import java.io.Serializable;
public class Student implements Serializable
{

    private String Name;
    private String MatricNo;
    private double Gpa;

    public double getGpa() {
        return Gpa;
    }

    public void setGpa(double Gpa) {
        this.Gpa = Gpa;
    }
    
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getMatricNo() {
        return MatricNo;
    }

    public void setMatricNo(String MatricNo) {
        this.MatricNo = MatricNo;
    }
        
}
