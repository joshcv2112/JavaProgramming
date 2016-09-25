import java.util.*;

public class Dog
{
    // Data Members
    String name;
    int age;

    // Methods
    public Dog()
    {
        name = "Fido";
        age = 1;
    }

    public void Dog(String n, int a)
    {
        name = n;
        age = a;
    }

    public void setInfo(String xName, int xAge)
    {
        name = xName;
        age = dogAgeInPersonYears(xAge);
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public int dogAgeInPersonYears(int personYears)
    {
        return personYears * 7;
    }

    public String toString()
    {
        return "This dog is named " + name + ", he/she is " + age + " years old!\n";
    }

    public static void main(String[] args)
    {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        System.out.println(dog1.toString());
        dog2.setInfo("Lokey", 13);
        System.out.println(dog2.toString());
    }
}