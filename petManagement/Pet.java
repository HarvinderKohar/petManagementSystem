package petManagement;

public class Pet 
{
    String name;
    String type;
    int age;

    public Pet(String name, String type,int age)
    {
        this.name = name;
        this.type = type;
        this.age = age;
    }

    public String getName()
    {
        return this.name;
    }

    public String getType()
    {
        return this.type;
    }

    public int getAge()
    {
        return this.age;
    }

    public String toString()
    {
        return("Name: " + name + " Type: " + type + " Age: ");
    }
    
}
