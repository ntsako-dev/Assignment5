import org.junit.Test;

/**
 * Created by Kino on 2017-04-17.
 */
public class Adaptor
{

    public Adaptor()
    {
        ImplementAdaptor adapt = new ImplementAdaptor();
        adapt.testAdaptor();
    }
    public interface Pupil
    {

        public String getName();
        public String getSname();
        public int getAge();

        public void setName(String name);
        public void setSname(String surname);
        public void setAge(int age);
    }

    public class PersonImp implements Pupil
    {
        String name, surname;
        int age;

        @Test
        public void setName(String name)
        {
            this.name = name;
        }

        @Test
        public void setSname(String surname)
        {
         this.surname = surname;
        }

        @Test
        public void setAge(int age)
        {
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
            return surname;
        }

        @Test
        public int getAge()
        {
            return age;
        }

        public String toString()
        {
            return "Name : " + getName() + "\tSurname : " + getSname() +"\tAge : " + getAge();
        }

    }

    public interface User
    {

        public String getName();
        public String getSname();
        public int getAge();

        public void setName(String name);
        public void setSname(String surname);
        public void setAge(int age);
    }

    public class UserImp implements User
    {
        String name, surname;
        int age;

        private final Pupil pup;

        public UserImp(Pupil person)
        {
            this.pup = person;
        }



        @Test
        public void setName(String name)
        {
            this.name = name;
        }

        @Test
        public void setSname(String surname)
        {
            this.surname = surname;
        }

        @Test
        public void setAge(int age)
        {
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
            return surname;
        }

        @Test
        public int getAge()
        {
            return age;
        }

        public String toString()
        {
            return "Name : " + getName() + "\tSurname : " + getSname() +"\tAge : " + getAge();
        }

    }

    public class ImplementAdaptor
    {
        @Test
        public void testAdaptor()
        {
            PersonImp personImp = new PersonImp();
            personImp.setName("Ntsako");
            personImp.setSname("Mboweni");
            personImp.setAge(50);

            User userImp = new UserImp(personImp);

            System.out.println(userImp.toString());

        }


    }




}
