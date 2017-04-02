import org.junit.Test;

/**
 * Created by Kino on 2017-04-02.
 */
public class RunMain
{

    @Test
    public static void main(String[]args) throws CloneNotSupportedException
    {
        //singleton instance.
         Singleton sin1 = Singleton.getInstance();
         sin1.showMessage();

       // Abstact factory implement
         AbstractFactory ab = new AbstractFactory();
         ab.testFactory();

         //ProtoType
        Prototype pt = new Prototype();
        pt.testClone();

        //Visitor
        Visitor visitor = new Visitor();

    }

}
