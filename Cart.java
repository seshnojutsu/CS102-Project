import java.util.*;
public class Cart implements Discountable{
    private ArrayList<Product> items;

    public Cart() {
        items = new ArrayList<>();
    }
    
    //Method to add an item to the cart.
    public void addItem(Product p){
        items.add(p);
    }
    //Method to remove an item from the cart.
    public void removeItem(Product p){
        items.remove(p);
    }

    @Override
    public double discountCalc() {
        double total = 0;
        for(int i = 0; i < items.size(); i++){
            total = total + items.get(i).getPrice();
        }
        return total;
    }
    
}
