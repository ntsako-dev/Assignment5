/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import org.junit.Test;

/**
 *
 * @author Kino
 */
public class AbstractFactory 
{
    public abstract class Person
    {
     
        public abstract String getName();
        public abstract String getSurname();
        public abstract String getID();

        @Test
        public String toString()
        {
            return "Name : "+this.getName()+", Surname : "+this.getSurname()+", ID Number : "+this.getID().toString();
        }
    }
    
    public class Student extends Person 
    {
 
            private String name;
            private String surname;
            private String id;

            public Student(String name, String surname, String id){
                this.name = name;
                this.surname = surname;
                this.id = id;
            }

            @Test
            public String getName() {
                return this.name;
            }

            @Test
            public String getSurname() {
                return this.surname;
            }

            @Test
            public String getID() {
                return this.id;
            }
    }
    
    
    
    public class Teacher extends Person 
    {
 
            private String name;
            private String surname;
            private String id;

            public Teacher(String name, String surname, String id){
                this.name = name;
                this.surname = surname;
                this.id = id;
            }

            @Test
            public String getName() {
                return this.name;
            }


            @Test
            public String getSurname() {
                return this.surname;
            }

            @Test
            public String getID() {
                return this.id;
            }
    
            
    }
    
    
    public static interface SchoolPerson 
    {

    public Person createPerson();

    }
        
    public class StudentType implements SchoolPerson 
    {

	private String name;
	private String surname;
	private String id;
	
	public StudentType(String name, String surname, String id){
		this.name = name;
		this.surname = surname;
		this.id = id;
	}


	@Test
	public Person createPerson() {
		return new Student(name,surname,id);
	}

    }


    public class TeacherType implements SchoolPerson
    {

	private String name;
	private String surname;
	private String id;
	
	public TeacherType(String name, String surname, String id){
		this.name = name;
		this.surname = surname;
		this.id = id;
	}

	@Test
	public Person createPerson() {
		return new Teacher(name,surname,id);
	}

    }    
    
     
     public class PersonFactory 
     {

	public Person getPerson(SchoolPerson factory)
        {
		return factory.createPerson();
	}
     }

     @Test
     public void testFactory()
     {
     TeacherType tp = new TeacherType("Ntsako", "Mboweni", "211230235");
     System.out.println(tp.createPerson());
     
     StudentType st = new StudentType("Thato", "Mervyn", "254874");
     System.out.println(st.createPerson());

     }
   
     
}
