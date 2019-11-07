
public class Person {
    private String name;
    private String lastname;
    private String address;
    private String gender;
    private int age;
    public Person()
    {
        this.name = "";
        this.lastname = "";
        this.address = "";
        this.gender = "";
        this.age = 1;
    }
    public Person(String name, String lastname, String address, String gender, int age)
    {
        setName(name);
        setLastname(lastname);
        setGender(gender);
        setAddress(address);
        setAge(age);
    }
    final void setName(String name)
    {
        this.name = name;
    }
    final String getName()
    {
        return this.name;
    }
    final void setLastname(String lastname)
    {
        this.lastname = lastname;
    }
    final String getLastname()
    {
        return this.lastname;
    }
    final void setAddress(String address)
    {
        this.address = address;
    }
    final String getAddress()
    {
        return this.address;
    }
    final void setGender(String gender)
    {
        this.gender = gender;
    }
    final String getGender()
    {
        return this.gender;
    }
    final void setAge(int age)
    {
        this.age = age;
    }
    final int getAge()
    {
        return this.age;
    }

    @Override
    public String toString()
    {
        return name + " " + lastname + " " + address + " " + gender + " " + age + "years" + " ";
    }
}
