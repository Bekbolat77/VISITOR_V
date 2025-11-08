//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Product laptop = new Product("Laptop", 456789,3) ;
    Product mouse = new Product("mouse", 36789,2) ;
    Product keybord = new Product("Laptop", 86789,6) ;
    Product pacetAygen = new Product("Laptop", 999999,1) ;
    Cart cart = new Cart();
    cart.add(laptop);
    cart.add(mouse);
    cart.add(keybord);
    cart.add(pacetAygen);

    CartVisitor visitor = new CartVisitor();
    cart.accept(visitor);
    }
}