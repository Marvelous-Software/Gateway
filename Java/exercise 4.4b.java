/*
	John Maher
	Gateway - Java
	Dr Carrie Horvath
	Exercise 4-4
	10/11/2020
*/

public class Patient {

    private String id;
    private int age;
    private BloodData bd;

    public Patient() {

        id = "0";
        age = 0;
        bd = new BloodData();
        
    }
    public Patient(String idIn, int ageIn, String typeIn, String rhIn) {

        id = idIn;
        age = ageIn;
        bd = new BloodData(typeIn, rhIn);
        
    }


    public void setId(String idIn) {

        id = idIn;

    }

    public String getId() {

        return id;

    }

    public void setAge(int ageIn) {

        age = ageIn;
        
    }

    public int getAge() {

        return age;
        
    }

    public void setBloodData(BloodData bdIn) {

        bd = bdIn;
        
    }

    public BloodData getBloodData() {

        return bd;
        
    }
}
