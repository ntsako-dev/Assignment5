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
public class Person
{
    private String name, sname;
    private int age;
    
    public Person()
    {}

    
    public Person(String name, String Sname, int age)
    {
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
}
