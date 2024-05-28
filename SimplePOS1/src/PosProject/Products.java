package PosProject;

public class Products {
    String product_name;
    int quantity;
    
    public Products() {
        
    } 
    
    public void addProducts(String product_name, int quantity) {
        this.product_name = product_name;
        this.quantity = quantity;
    }
}
