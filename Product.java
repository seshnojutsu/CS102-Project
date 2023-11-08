
public class Product{
    //Creating attributes for Class Product.
    //Create methods and update the constructor for productId.
    private String name;
    private double price;
    private int inventoryCount;
    private String productId;

    //Creating Constructors for Product.
    public Product(String name, double price, int inventoryCount) {    
        setName(name);
        setPrice(price);
        setInventoryCount(inventoryCount);
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

    public int getInventoryCount() {
        return inventoryCount;
    }
    
    
    public void setInventoryCount(int inventoryCount) {
        //Data validation, Cannot have a negative amount of items.
        if(inventoryCount > -1){
            this.inventoryCount = inventoryCount;
        }
        else throw new IllegalArgumentException("Cannot have negative Inventory Count");
    }
    

    @Override
    public String toString() {
        return "Product{" + "name=" + name + ", price=" + price + ", inventory count=" + inventoryCount + '}';
    }
     
    
}
       
