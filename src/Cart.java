import java.util.ArrayList;
import java.util.List;

public class Cart {
     List<Product> products = new ArrayList<>();
     public void add(Product p) {
         products.add(p);
     }
     public void accept(Visitor visitor){
         visitor.visit(this);
     }
}