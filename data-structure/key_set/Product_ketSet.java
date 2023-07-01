import java.util.HashMap;
import java.util.Set;

class Product {
    
    // properties of a product
    int product_id;
    String product_name;
    String product_user;
    String product_country;

    // constructor method
    Product(int product_id, String product_name, String product_user, String product_country) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_user = product_user;
        this.product_country = product_country;
    }
    
    // method to print all the details of the product
    static void generate_description(Product p) {
        System.out.println("Product ID: " + p.product_id +
                "\nName: " + p.product_name +
                "\nUsers of the Product: " + p.product_user +
                "\nCountry of Origin: " + p.product_country);
    }
}
 class hashmap {

    public static void main(String args[]){
        // hashmap to store product and its id
        HashMap<Integer, Product> hm_products = new HashMap<>();
        
        // objects of the Product class
        Product product1 = new Product(300090105,"Laptop","Students","Germany");
        Product product2 = new Product(300090155,"TV","Families","Japan");
        Product product3 = new Product(300090142,"Customized Computers","Professionals","US");
        
        // pairing product object and its id to the hashmap
        hm_products.put(product1.product_id,product1);
        hm_products.put(product2.product_id,product2);
        hm_products.put(product3.product_id,product3);
	System.out.println(hm_products);
        
        // creating a set of ids of all the products in the hashmap using the keySet method
        Set<Integer> product_ids = hm_products.keySet();
	System.out.println(product_ids);
        System.out.println("Product Catalog:-\n");
        
        // printing all the products' description as catalog
        for(Integer i: product_ids){
            Product.generate_description(hm_products.get(i));
            System.out.println();
        }
    }
}

