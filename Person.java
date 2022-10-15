public class Person {
    private String name;
    private int birthYear;

    public Person(String n, int byear)
    {
        name = n;
        birthYear = byear;
    }

    public String toString()
    {
        return "Person[name=" + name + ",birthYear=" + birthYear + "]";
    }
}
