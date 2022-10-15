public class Student extends Person
{
    private String major;

    public Student(String n, int byear, String m)
    {
        super(n, byear);
        major = m;
    }

    public String toString()
    {
        return "Student[super=" + super.toString() + ",major=" + major + "]";
    }}
