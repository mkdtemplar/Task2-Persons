public class Student extends Person implements AcademicInterest
{
    int avgrade;
    
    public Student( String name, String email, int age)
    {
        super( name, email, age );
        this.avgrade = (int)(((Math.random() * 100 % 5)) + 5);
    }
    
    public int getAvgrade()
    {
        return avgrade;
    }
    
    
    @Override
    public String[] getInterest( String... subject )
    {
        subject[0] = "Java";
        subject[1] = "Management";
        subject[2] = "Finance";
        return subject;
    }
}
