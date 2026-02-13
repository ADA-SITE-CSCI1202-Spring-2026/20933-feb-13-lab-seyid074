package week03.invoice;

public class InvoiceTest {

    public static void main(String[] args) {

        Invoice inv = new Invoice("101", "Tool", 3, 20.0);

        System.out.println(inv.getPartNumber());
        System.out.println(inv.getPartDescription());
        System.out.println(inv.getQuantity());
        System.out.println(inv.getPricePerItem());
        System.out.println(inv.getInvoiceAmount());

    }

}
