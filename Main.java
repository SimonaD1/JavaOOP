public class Main {

    public static void main(String[] args) {
        Invoice myInvoice = new Invoice("firstInvoice","BAMBOODOOL",234.3);
        Invoice myInvoice1 = new Invoice("secondInvoice","LOODOOL",23.3);
        Invoice myInvoice2 = new Invoice("thirdInvoice","33DOOL",443.4);

        System.out.printf("id: %s , %s , %s \n", myInvoice.getID(), myInvoice.getName(), myInvoice.getCompany());
        System.out.printf("id: %s, %s , %s \n", myInvoice1.getID(), myInvoice1.getName(), myInvoice1.getCompany());
        System.out.printf("id: %s , %s, %s ", myInvoice2.getID(), myInvoice2.getName(), myInvoice2.getCompany());

    }
}
