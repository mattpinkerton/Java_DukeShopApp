
package duke.choice;

import java.util.Arrays;

/**
 *
 * @author mattpinkerton
 */
public class ShopApp {

    public static void main(String[] args) {

        //welcome message
        System.out.println("Welcome to Duke Choice Shop");

        //minimum price as static class variable
        System.out.println("Min Price " + Clothing.MIN_PRICE);

        //set customer parameters using constructor args
        Customer c1 = new Customer("Max", 4);

        //set customer parameters using no args constructor and setter methods
        //Customer c1 = new Customer();
        //c1.setName("Max");
        //c1.setSize("M");

        //create an array of clothing items
        Clothing item1 = new Clothing("Blue Jacket", 20.9, "M");
        Clothing item2 = new Clothing("Orange T-Shirt", 10.5, "S");
        Clothing[] items = {item1, item2, new Clothing("Green Scarf", 5.0, "S"), new Clothing("Blue T-Shirt", 10.5, "S")};

        //associate items with customer
        c1.addItems(items);

        //summarize customer info & items purchased
        System.out.println("Customer is " + c1.getName() + "," + c1.getSize() + "," + c1.getTotalClothingCost());

        Arrays.sort(c1.getItems());
        for (Clothing item : c1.getItems()) {
            System.out.println("Item output: " + item);
        }

//some example code testing error catching
//        int average = 0;
//        int count = 0;
//
//        for (Clothing item : c1.getItems()) {
//            if (item.getSize().equals("L")) {
//                count++;
//                average += item.getPrice();
//            }
//        }
//
//        try {
//            //average = (count == 0) ? 0 : average / count;
//            average = average / count;
//            System.out.println("Average price " + average + ", Count " + count);
//        } catch (ArithmeticException e) {
//            System.out.println("Don't divide by zero");
//        }

    }

}
