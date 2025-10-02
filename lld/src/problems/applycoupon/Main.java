package problems.applycoupon;

public class Main {
    public static void main(String[] args) {
        Product item1 = new IPhone("IPhone 11", 80000, ProductType.PHONE);
        Product item2 = new ToothPaste("Colgate", 150, ProductType.GROCERY);
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addToCart(item1);
        shoppingCart.addToCart(item2);
        System.out.println("Total Price after applying coupons is : " + shoppingCart.getPrice());
    }
}
