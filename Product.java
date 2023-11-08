
public class Product{
    //Add Product ID.
    //Creating attributes for Class Product.
    private String name;
    private double price;
    private int inventory_count;
    private String productID;

    //Creating Constructors for Product.
    public Product(String name, double price, int inventory_count) {    
        setName(name);
        setPrice(price);
        setInventory_count(inventory_count);
    }

    //Getters and setters for attributes.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        //Data validation to make sure the price is not negative or 0.
        if(price > 0){
            this.price = price;
        }
        else throw new IllegalArgumentException("Price cannot be negative or 0");
    }

    public int getInventory_count() {
        return inventory_count;
    }
    
    
    public void setInventory_count(int inventory_count) {
        //Data validation, Cannot have a negative amount of items.
        if(inventory_count > -1){
            this.inventory_count = inventory_count;
        }
        else throw new IllegalArgumentException("Cannot have negative Inventory Count");
    }
    
    
    
    
}
