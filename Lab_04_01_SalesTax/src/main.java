public class main {

    public static void main(String[] args)
    {
        double itemPrice = 15.50;
        final double SALES_TAX = 0.05;
        double salesTax;

        salesTax = itemPrice * SALES_TAX;
        System.out.println("A 5% sales tax of an item that costs " + itemPrice + " is " + salesTax);
    }
}
