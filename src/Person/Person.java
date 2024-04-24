package Person;

/**
 * The Person class represents a person with basic attributes.
 * including the basic status like name, address, date of birth, and gender.
 *
 * @author Francis (iid3rp) Madanlo
 */
public class Person
{
    /**
     * The name of the Person
     */
    private String name;

    /**
     *  The address of where the person lives.
     *  <p>(for references only)</p>
     */
    private String address;

    /**
     *  The date of birth of when the person was born.
     *  <p>(for references only)</p>
     */
    private String dateOfBirth;

    /**
     *  The assigned gender of the person
     *  <p>(for references only)</p>
     */
    private String gender;

    /**
     *  The default constructor of the Person class
     *  the initializes the class itself and the values:
     *  name, address, date of birth, and gender
     *  of the person with no value.
     */
    public Person()
    {
        name = address = dateOfBirth = gender = "";
    }

    /**
     *  The constructor with parameters of the Person class
     *  the initializes the class itself, and the values name, address, date of birth, and gender
     *  of the person with their parameters.
     *
     * @param name the name of the person
     * @param address  the address of where the person lives.
     * @param dateOfBirth  The date of birth of when the person was born.
     * @param gender the assigned gender of the person
     */
    public Person(String name, String address, String dateOfBirth, String gender)
    {
        this.name = name;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
    }

    /**
     *  The deep-copy constructor with of the Person class
     *  the initializes the class itself, with the values: name, address,
     *  date of birth, and gender of the person based on another reference
     *  point of another Person class.
     *
     * @param person - The reference point of the person
     */
    public Person(Person person) // deep copying
    {
        name = person.name;
        address = person.address;
        dateOfBirth = person.dateOfBirth;
        gender = person.gender;
    }

    /**
     *  The constructor of the Person class with only one parameter being
     *  the name of the person only. that initializes the class itself and the name,
     *  but other values: address, date of birth, and gender of the person will have no value.
     *
     * @param name the name of the person
     */
    public Person(String name)
    {
        this.name = name;
        address = dateOfBirth = gender = "";
    }


    /**
     *  The setting method of the Person class that re-initializes the values: name, address, date of birth
     *  and gender of the person with the parameters.
     *
     * @param name the name of the person
     * @param address  the address of where the person lives.
     * @param dateOfBirth  The date of birth of when the person was born.
     * @param gender the assigned gender of the person
     */
    public void setPerson(String name, String address, String dateOfBirth, String gender)
    {
        this.name = name;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
    }

    /**
     *  The setting of the Person class with only one parameter being
     *  the Person class only. that re-initializes the values: name, address, date of birth
     *  and gender of the person.
     *
     * @param person the reference point of the Person class in which to be deep-copied.
     */
    public void setPerson(Person person)
    {
        name = person.getName();
        address = person.getAddress();
        dateOfBirth = person.getDateOfBirth();
        gender = person.getGender();
    }

    /**
     *  The setter of the Person class that re-initializes the name of the person only.
     * @param name the reference point of the Person class in which to be deep-copied.
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     *  The setter of the Person class that re-initializes the address of the person only.
     * @param address the reference point of the Person class in which to be deep-copied.
     */
    public void setAddress(String address)
    {
        this.address = address;
    }

    /**
     *  The setter of the Person class that re-initializes the date of birth of the person only.
     * @param dateOfBirth the reference point of the Person class in which to be deep-copied.
     */
    public void setDate(String dateOfBirth)
    {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     *  The setter of the Person class that re-initializes the gender of the person only.
     * @param gender the reference point of the Person class in which to be deep-copied.
     */
    public void setGender(String gender)
    {
        this.gender = gender;
    }

    /**
     *  The getter of the Person class that gets the Person class itself.
     * @return The Person object itself
     */
    public Person getPerson()
    {
        return this;
    }

    /**
     *  The getter of the Person class that gets the String value of the name of the person.
     * @return String of the  name of the person
     */
    public String getName()
    {
        return name;
    }

    /**
     *  The getter of the Person class that gets the String value of the address of the person.
     * @return String of the address of the person
     */
    public String getAddress()
    {
        return address;
    }

    /**
     *  The getter of the Person class that gets the String value of the date of birth of the person.
     * @return String of the date of birth of the person
     */
    public String getDateOfBirth()
    {
        return dateOfBirth;
    }

    /**
     *  The getter of the Person class that gets the String value of the gender of the person.
     * @return String of the gender of the person
     */
    public String getGender()
    {
        return gender;
    }

    /**
     *  Returns a string representation of the Person class that returns the data as a String constructed for
     *  readability and reference of what are the contents of the person.
     * @return String value of the person
     */
    @Override
    public String toString()
    {
        return "name: " + name + "\n" +
               "address: " + address + "\n" +
               "date of birth: " + dateOfBirth + "\n" +
               "gender: " + gender;
    }
    
}