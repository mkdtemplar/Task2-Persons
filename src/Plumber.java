public class Plumber extends Person implements Worker
{
    int salary;
    public Plumber ( String name, String email, int age)
    {
        super( name, email, age );
        this.salary = getSalary ();
    }
    
    @Override
    public int getAge ()
    {
        
        return super.getAge ();
    }
    
    @Override
    public String identify()
    {
        return String.format(super.identify() + " Is a Plumber");
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
    public String toString ()
    {
        
        return "Plumber{" +
                       "Name='" + Name + '\'' +
                       ", Email='" + Email + '\'' +
                       ", Age=" + getAge () +
                       "} " + " Salary: " + getSalary ();
    }
}
