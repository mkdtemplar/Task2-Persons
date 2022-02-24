public class TestClass
{
    public static void main( String[] args )
    {
        Person ppl[] = new Person[10];
        
        ppl[0] = new Person("Ivan", "mail@mail.com", 46);
        ppl[1] = new Student(  "Ivan", "mail@mail.com", 46, "Java");
        ppl[2] = new Plumber(  "Oliver", "oliver@mail.com", 34);
        
        ppl[3] = new Student("Nikolaj", "nikilaj@mail.com", 18, "Java");
        ppl[4] = new Student("Jasna", "jasna@mail.com", 46, "Management");
        ppl[5] = new Student("Katya", "katya@mail.com", 32, "Management");
        ppl[6] = new Teacher( "John", "john@mail.com", 45, "Finance" );
        ppl[7] = new Teacher( "Tuvok", "tuvok@mail.com", 56, "Finance"  );
        ppl[8] = new Teacher("Zimermann", "zimermann@mail.com", 65, "Java");
        ppl[9] = new Teacher("Bjorn", "bjorn@mail.com", 76, "Java");
        
        
        System.out.println (ppl[2].identify ());
        System.out.println (ppl[6].identify ());
        System.out.println (ppl[1].identify ());
    }
}
