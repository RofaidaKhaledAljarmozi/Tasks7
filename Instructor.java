    public class Instructor extends Person
    {
        private double salary;

        public Instructor(String n, int byear, double s)
        {
            super(n, byear);
            salary = s;
        }

        public String toString()
        {
            return "Employee[super=" + super.toString() + ",salary=" + salary + "]";
        }}

