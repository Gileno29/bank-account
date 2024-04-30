public class ContaBanco {

    String clientName;
    int number;
    int agency;
    double balance=0;





    public double getBalance(){
        

        return this.balance;
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
