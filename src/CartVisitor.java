public class CartVisitor implements Visitor{
 @Override
 public void visit(Cart cart){
     double total =0;
     int count=0;

        for (Product p : cart.products) {
            double subtotal = p.price * p.quantiyy;
            total += subtotal;
            count += p.quantiyy;
            System.out.println(p.name + "*" + p.quantiyy + "=" + subtotal + "twnge");
        }
        System.out.println("Total:" + count + "pieces"+ total + "twnge");

        }
}

