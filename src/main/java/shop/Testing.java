
package shop;

public class Testing {

    public static void main(String[] args) {

        System.out.println("3 for 2 Discount:");

        ShoppingCart shoppingCart1 = new ShoppingCart();

        shoppingCart1.addCartItem(new ShoppingCartItem(new Product("Milk"), 9.99, 2));
        shoppingCart1.addCartItem(new ShoppingCartItem(new Product("Bread"), 3.0, 3));
        shoppingCart1.addCartItem(new ShoppingCartItem(new Product("Butter"), 44.95, 1));
        shoppingCart1.addCartItem(new ShoppingCartItem(new Product("Eggs"), 2.95, 3));

        System.out.println("Total: " + shoppingCart1.calculatePrice());
        System.out.println("Discount: " + shoppingCart1.calculateDiscount());
        System.out.println("Total with Discount: " + shoppingCart1.calculatePriceWithDiscount());

  
        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("Ten Percent Discount:");

        ShoppingCart shoppingCart2 = new ShoppingCart();

        shoppingCart2.addCartItem(new ShoppingCartItem(new Product("Coffee Machine"), 99.99, 2));
        shoppingCart2.addCartItem(new ShoppingCartItem(new Product("Macbook"), 250.0, 2));

        System.out.println("Total: " + shoppingCart2.calculatePrice());
        System.out.println("Discount: " + shoppingCart2.calculateDiscount());
        System.out.println("Total with Discount: " + shoppingCart2.calculatePriceWithDiscount());

        System.out.println();
        System.out.println();
        System.out.println();


        System.out.println("Cheapest for free:");

        ShoppingCart shoppingCart3 = new ShoppingCart();

        shoppingCart3.addCartItem(new ShoppingCartItem(new Product("Milk"), 4.99, 2));
        shoppingCart3.addCartItem(new ShoppingCartItem(new Product("Bread"), 7.99, 1));
        shoppingCart3.addCartItem(new ShoppingCartItem(new Product("Soda"), 9.0, 1));
        shoppingCart3.addCartItem(new ShoppingCartItem(new Product("Keyboard"), 20.0, 1));
        shoppingCart3.addCartItem(new ShoppingCartItem(new Product("Sodastreamer"), 99.99, 1));
        shoppingCart3.addCartItem(new ShoppingCartItem(new Product("Guitar"), 223.99, 1));

       System.out.println("Total: " + shoppingCart3.calculatePrice());
        System.out.println("Discount: " + shoppingCart3.calculateDiscount());
        System.out.println("Total with Discount: " + shoppingCart3.calculatePriceWithDiscount());


        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("REDO/UNDO-TESTING:");

        ShoppingCart shoppingCart4 = new ShoppingCart();

        shoppingCart4.addCartItem(new ShoppingCartItem(new Product("Milk"), 3.99, 2));
        shoppingCart4.addCartItem(new ShoppingCartItem(new Product("Bread"), 4.99, 1));
        shoppingCart4.addCartItem(new ShoppingCartItem(new Product("Soda"), 7.5, 1));
        printCartState(shoppingCart4);
        shoppingCart4.undo();
        printCartState(shoppingCart4);
        shoppingCart4.redo();
        printCartState(shoppingCart4);
        shoppingCart4.undo();
        shoppingCart4.undo();
        shoppingCart4.undo();

        shoppingCart4.redo();
        shoppingCart4.redo();
        shoppingCart4.redo();


        System.out.println();
        System.out.println();
        System.out.println();


        System.out.println("REMOVE/CHANGE-TESTING:");

        ShoppingCart shoppingCart5 = new ShoppingCart();

        shoppingCart5.addCartItem(new ShoppingCartItem(new Product("Milk"), 9.99, 2));
        shoppingCart5.addCartItem(new ShoppingCartItem(new Product("Bread"), 3.0, 3));
        shoppingCart5.addCartItem(new ShoppingCartItem(new Product("Butter"), 44.95, 1));
        shoppingCart5.addCartItem(new ShoppingCartItem(new Product("Eggs"), 2.95, 3));

        System.out.println(shoppingCart5.receipt());
        shoppingCart5.removeCartItem("Bread");
        System.out.println(shoppingCart5.receipt());
        shoppingCart5.changeItemQuantity("Eggs", 1);
        System.out.println(shoppingCart5.receipt());
        shoppingCart5.undo();
        System.out.println(shoppingCart5.receipt());

    }

    public static void printCartState(ShoppingCart shoppingCart) {
        System.out.println("Cart:");
        System.out.println(shoppingCart.receipt());
    }

}