public class Teacher extends Person implements AcademicInterest, Worker
{
    private int rating;
    private int salary;
    private String interest;
    public Teacher( String name, String email, int age,  String interest)
    {
        super( name, email, age );
        this.rating = (int)(((Math.random() * 100 % 5)) + 5);
        this.salary = getSalary ();
        this.interest = interest;
    }
    
    public int getRating()
    {
        return rating;
    }
    
    @Override
    public String getInterest ()
    {
        return interest;
    }
    
    @Override
    public int getSalary()
    {
        int max = 90000;
        int min = 20000;
        int range = max - min + 1;
        
        return (int)(Math.random() * range) + min;
    }
    
    @Override
    public String identify()
    {
        return String.format(super.identify() + " Is Teacher");
    }
    
    @Override
    public String toString ()
    {
        
        return "Teacher{" +
                       "Name='" + Name + '\'' +
                       ", Email='" + Email + '\'' +
                       ", Age=" + Age +
                       ", rating=" + rating +
                       ", salary=" + getSalary () +
                       ", interest='" + interest + '\'' +
                       "} ";
    }
}
