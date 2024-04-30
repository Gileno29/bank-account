public class BankAccount {

   private String clientName;
   private int number;
   private int agency;
   private double balance=0;


public String createAccount(String client, int number, int agency, double balance){
    setAgency(agency);
    setClientName(client);
    setNumber(number);
    if (this.number==number){
        return "Olá" +getClientName()+", obrigado por criar uma conta em nosso banco, sua agência é" + getAgency() + ", conta "+ getNumber() +"e seu saldo" + getBalance()+"já está disponível para saque";
    }
    return "Is not possible create an account";
}


    public double getBalance(){     

        return this.balance;
    }

    public void setBalance(double balance){
        this.balance=balance;
    }
    public void showBalance(){
        System.out.println("Current Balance: " + this.balance);
    } 

    public void setClientName(String name){
        this.clientName=name;

    }
    
    public String getClientName(){

        return this.clientName;
    }

    public void setNumber(int number){

        this.number=number;
    }

    public int getNumber(){
        return this.number;
    }

    public void setAgency(int agency){
        this.agency=agency;
    }

    public int getAgency(){
        return this.agency;
    }



    

}
