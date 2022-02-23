public class TestClass
{
    public static void main( String[] args )
    {
        Person ppl[] = new Person[10];
        
        ppl[0] = new Person("Ivan", "mail@mail.com", 46);
        ppl[1] = new Student(  "Ivan", "mail@mail.com", 46);
        ppl[2] = new Plumber(  );
        ppl[3] = new Student();
        ppl[4] = new Student();
        ppl[5] = new Student();
        ppl[6] = new Teacher(  );
        ppl[7] = new Teacher(  );
        ppl[8] = new Teacher();
        ppl[9] = new Teacher();
        
    }
}
