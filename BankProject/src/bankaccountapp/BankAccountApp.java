package bankaccountapp;

public class BankAccountApp {
    
    public static void main(String[] args) {

        Checking chkacc1 = new Checking("Tom Wilson", "321456879", 1500);

        Savings savacc1 = new Savings("Rich Low", "456657897", 2500 );

        savacc1.showInfo();

        System.out.println("***********");
        
        chkacc1.showInfo();

        // Read a CSV File then create new accounts based on that data

    }
}
