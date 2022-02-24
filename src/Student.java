public class Student extends Person implements AcademicInterest
{
    int avgrade;
    String interest;
    public Student( String name, String email, int age, String interest)
    {
        super( name, email, age );
        this.avgrade = (int)(((Math.random() * 100 % 5)) + 5);
        this.interest = interest;
    }
    
    public int getAvgrade()
    {
        return avgrade;
    }
    
    @Override
    public String getInterest ()
    {
        
        return interest;
    }
    
    @Override
    public String toString ()
    {
        
        return "Student{" +
                       "Name='" + Name + '\'' +
                       ", Email='" + Email + '\'' +
                       ", Age=" + Age +
                       ", avgrade=" + avgrade +
                       ", interest='" + interest + '\'' +
                       "} ";
    }
}
