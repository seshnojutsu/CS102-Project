/*
Create a third class called "Sale" that represents a single transaction at the grocery store. 
Each sale should have fields to store the customer's name, the items in their cart, the total price of the sale, 
and any discounts applied.

 */
import java.util.*;
public class Sale {
    
    private String name;
    private ArrayList<Product> itemsInCart;
    private double totalPrice;
    private double discountApplied;

    public Sale(String name, List<Product> itemsInCart, double totalPrice, double discountApplied) {
       setName(name);
       itemsInCart = new ArrayList<>();
       setTotalPrice(totalPrice);
       setDiscountApplied(discountApplied);
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        //Data validation, name shouldn't be null or have a number;
        for(int i =0; i < name.length(); i++){
        if(name.length() == 0 || Character.isDigit(name.charAt(i)))
            throw new IllegalArgumentException("Invalid name");
        else this.name = name;
        }   
        throw new IllegalArgumentException("Invalid name");
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double getDiscountApplied() {
        return discountApplied;
    }

    public void setDiscountApplied(double discountApplied) {
        this.discountApplied = discountApplied;
    }

}
