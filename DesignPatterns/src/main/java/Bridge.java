import org.junit.Test;

/**
 * Created by Kino on 2017-04-18.
 */
public class Bridge
{


    private interface Pupil
    {
        public String getName();
        public String getSname();
        public int getAge();
        public String toString();
    }

    private class Student implements Pupil
    {

        private String name, sname;
        private int age;
        @Test
        public String getName()
        {
            return name;
        }

        @Test
        public String getSname()
        {
            return sname;
        }

        @Test
        public int getAge()
        {
            return age;
        }

        public String toString()
        {
            return "Student\n"+"Name : " + getName() + "\tSurname : " + getSname() +"\tAge : " + getAge();
        }

    }

    private class SoccerPlayer implements Pupil
    {

        private String name, sname;
        private int age;
        @Test
        public String getName()
        {
            return name;
        }

        @Test
        public String getSname()
        {
            return sname;
        }

        @Test
        public int getAge()
        {
            return age;
        }

        public String toString()
        {
            return "SoccerPlayer \n"+"Name : " + getName() + "\tSurname : " + getSname() +"\tAge : " + getAge();
        }

    }

    public class Person extends PersonType
    {
        private String name, sname;
        private int age;

        public Person()
        {}


        public Person(String name, String Sname, int age, Pupil pupil)
        {
            super(pupil);
            this.name = name;
            this.sname = Sname;
            this.age = age;
        }

        @Test
        public String getName()
        {
            return name;
        }

        @Test
        public String getSname()
        {
            return sname;
        }

        @Test
        public int getAge()
        {
            return age;
        }

        public void PersonDetails()
        {

            System.out.println(pupil.toString());

        }

    }


    private abstract class PersonType
    {
        protected Pupil pupil;

        public PersonType()
        {}

        protected PersonType(Pupil pupil)
        {
            this.pupil = pupil;
        }

        public abstract void PersonDetails();


    }

    public void main()
    {
        PersonType student = new Person("Ntsako", "Mboweni", 50, new Student());
        PersonType player = new Person("Tharlo", "Scoum", 31, new SoccerPlayer());

        student.PersonDetails();
        player.PersonDetails();
    }



}
