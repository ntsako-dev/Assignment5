/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import org.junit.Test;

/**
 *
 * @author ntsmbo
 */
public class Singleton 
{
    private static Singleton instance = null;
    
    private Singleton()
    {
       
    }

    @Test
    public static Singleton getInstance()
    {
        if(instance == null) 
        {
         instance = new Singleton();
        }
         return instance;
         
    }

     @Test
     public void showMessage(){
      System.out.println("The instance of the singleton class has been created.");
     }
     
     
   
     
     
     
    
    
}
