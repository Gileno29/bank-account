import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        String name;
        int agency;
        double balance;
        int number;

        Scanner s= new Scanner(System.in);
        
        System.out.println("Please, type the client name!");
        name=s.nextLine();
        
        System.out.println("Please, type the agency number!");
        agency= Integer.parseInt( s.nextLine());

        System.out.println("Please, type the account number!");
        number= Integer.parseInt(s.nextLine());

        System.out.println("Please, type the Balance!");
        balance= Double.parseDouble(s.nextLine());

        ContaTerminal account = new ContaTerminal();

        System.out.println(account.createAccount(name,number,agency,balance));

    }
}
