/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.*;
import org.junit.Test;

/**
 *
 * @author Kino
 */
public class Prototype
{

    public class PersonDetails implements Cloneable
    {

	private List<Person> PersonList;


	public PersonDetails()
        {
            PersonList = new ArrayList<Person>();
	}
	
	public PersonDetails(List<Person> list)
	{
            this.PersonList=list;
	}


	@Test
	public void loadData()
        {
		
                
		PersonList.add(new Person("Ntsako", "Mboweni", 35));
		PersonList.add(new Person("Sabastian", "Loerow", 56));
		PersonList.add(new Person("Steve", "Mongur", 34));
		PersonList.add(new Person("Tien", "Oscar", 42));
	}

	@Test
	public List<Person> getPersonList() 
        {
		return PersonList;
	}

	@Override
	@Test
	public Object clone() throws CloneNotSupportedException
        {
			List<Person> temp = new ArrayList<Person>();
			for(Person s : this.getPersonList())
                        {
				temp.add(s);
			}
			return new PersonDetails(temp);
	}
	
}

	@Test
    public void testClone() throws CloneNotSupportedException
    {
    	
		PersonDetails per = new PersonDetails();
		per.loadData();
                
                
                PersonDetails person1 = (PersonDetails) per.clone();
		PersonDetails person2 = (PersonDetails) per.clone();
		List<Person> list = person1.getPersonList();
		list.add(new Person("Tharlo", "Litch", 28));
		List<Person> list1 = person2.getPersonList();
		
                System.out.println("Person List");
                for(int i = 0; i <list.size(); i++)
                {
                  System.out.println(list.get(i).toString());
             
                }
                
                System.out.println("\nPerson List1");
                for(int i = 0; i <list1.size(); i++)
                {
                  System.out.println(list1.get(i).toString());
             
                }
		
		
                
    }
}
