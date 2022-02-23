public class Plumber extends Person implements Worker
{
    int salary;
    public Plumber( String name, String email, int age, int salary )
    {
        super( name, email, age );
        this.salary = salary;
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
}
