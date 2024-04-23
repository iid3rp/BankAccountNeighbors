package Person;


public class Person
{
    public String name, address, dateOfBirth, gender;
    public Person()
    {
        name = address = dateOfBirth = gender = "";
    }
    
    public Person(String n, String a, String dob, String g)
    {
        name = n;
        address = a;
        dateOfBirth = dob;
        gender = g;
    }
    
    public Person(Person p) // deep copying
    {
        name = p.name;
        address = p.address;
        dateOfBirth = p.dateOfBirth;
        gender = p.gender;
    }

    public Person(String name)
    {
        this.name = name;
        address = dateOfBirth = gender = "";
    }

    public void setPerson(String n, String a, String dob, String g)
    {
        name = n;
        address = a;
        dateOfBirth = dob;
        gender = g;
    }
    
    public void setName(String n)
    {
        name = n;
    }
    
    public void setAddress(String a)
    {
        address = a;
    }
    
    public void setDate(String d)
    {
        dateOfBirth = d;
    }
    
    public void setGender(String g)
    {
        gender = g;
    }
    
    public Person getPerson()
    {
        return this;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getAddress()
    {
        return address;
    }
    
    public String getDateOfBirth()
    {
        return dateOfBirth;
    }
    
    public String getGender()
    {
        return gender;
    }
    
    public String toString()
    {
        return
        "name: " + name + "\n" +
        "address: " + address + "\n" +
        "date of birth: " + dateOfBirth + "\n" +
        "gender: " + gender;
    }
    
}