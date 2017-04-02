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
public class Visitor 
{

    Visitor()
    {
        ShoppingCartClient shop = new ShoppingCartClient();
        shop.testVisitor();
    }

    public interface ItemElement
    {

        public int accept(ShoppingCartVisitor visitor);

    }




    public interface ShoppingCartVisitor
    {
        @Test
        int visit(Shorts shorts);

        @Test
        int visit(TShirt tshirt);

    }

    public class Shorts implements ItemElement
    {
        private int price;
        private String style;


        public Shorts(int price, String style)
        {
            this.price = price;
            this.style = style;
        }

        @Test
        public int getPrice()
        {
            return price;
        }

        @Test
        public String getStyle()
        {
            return style;
        }



        @Test
        public int accept(ShoppingCartVisitor visitor) {

            return visitor.visit(this);

        }

    }






    public class TShirt implements ItemElement
    {

        private String name;

        private int price;

        private String size;

        public TShirt(String name, String size, int price)
        {

            this.name = name;
            this.size = size;
            this.price = price;

        }

        @Test
        public String getName()
        {
            return name;
        }

        @Test
        public String getSize()
        {
            return size;
        }

        @Test
        public int price()
        {
            return this.price;
        }


        @Test
        public int accept(ShoppingCartVisitor visitor) {

            return visitor.visit(this);

        }

    }







    public class ShoppingCartVisitorImpl implements ShoppingCartVisitor
    {

        @Test
        public int visit(TShirt tshirt) {

            int cost=0;

            //apply 5$ discount if book price is greater than 50

            if(tshirt.price() > 150)
            {
                cost = tshirt.price()-30;

            }else cost = tshirt.price();

            System.out.println("Item name : "+tshirt.getName() + "\nSost = " + cost);

            return cost;

        }


        @Test
        public int visit(Shorts shorts) {

            int cost = shorts.getPrice();

            System.out.println(shorts.getStyle() + " cost = "+cost);

            return cost;

        }

    }





    public class ShoppingCartClient
    {

        @Test
        public void testVisitor()
        {

            ItemElement[] items = new ItemElement[]{new Shorts(180, "Chino short"),new Shorts(200, "Swimming shorts"),

                    new TShirt("Golfer shirt", "Meduim", 500), new TShirt("Boyz Casual shirts", "Large", 350)};

            int total = calculatePrice(items);

            System.out.println("Total Cost = "+total);

        }

        @Test
        private int calculatePrice(ItemElement[] items)
        {

            ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();

            int sum = 0;

            for(ItemElement item : items){

                sum = sum + item.accept(visitor);

            }

            return sum;
        }

    }






}
