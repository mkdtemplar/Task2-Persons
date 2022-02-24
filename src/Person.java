public  class Person
{
    String Name;
    String Email;
    int Age;
    
    public Person( String name, String email, int age )
    {
        Name = name;
        Email = email;
        Age = age;
    }
    
    public String getName()
    {
        return Name;
    }
    
    public void setName( String name )
    {
        Name = name;
    }
    
    public String getEmail()
    {
        return Email;
    }
    
    public void setEmail( String email )
    {
        Email = email;
    }
    
    public int getAge()
    {
        return Age;
    }
    
    public void setAge( int age )
    {
        Age = age;
    }
    
    public String identify()
    {
        return String.format("Name: %s%nEmail: %s%nAge: %d%n", getName(),getEmail(),getAge());
    }
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
        
        return "Person{" +
                       "Name='" + Name + '\'' +
                       ", Email='" + Email + '\'' +
                       ", Age=" + Age +
                       '}';
    }
}
