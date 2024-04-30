# Bank Account!

A little system developed in Java to simulate a bank account create, this project was developed to remember begginer conceps about Java.


## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies


## Methods

For this example was just implemented the setters and getters and another method to create a account.


    public  String  createAccount(String  client, int  number, int  agency, double  balance){
    
    	setAgency(agency);
    
    	setClientName(client);
    
    	setNumber(number);
    
    	setBalance(balance);
    
    	if (this.number==number){
    
    		return  "Olá "  +getClientName()+" , obrigado por criar uma conta em nosso banco, sua agência é "  +  getAgency() +  ", conta "+  getNumber() +" e seu saldo "  +  getBalance()+" já está disponível para saque";
    
    }
    
	    return  "Is not possible create an account";
    
    }
    
    public  double  getBalance(){
    
      
    
	    return  this.balance;
    
    }
   
    
    public  void  setBalance(double  balance){
    
	    this.balance=balance;
    
    }
    
    public  void  showBalance(){
    
	    System.out.println("Current Balance: "  +  this.balance);
    
    }
    
    public  void  setClientName(String  name){
    
	    this.clientName=name;
    
      
    
    }
    
    public  String  getClientName(){
    
    
	    return  this.clientName;
    
    }
    
    public  void  setNumber(int  number){
    
      
    
	    this.number=number;
    
    }
      
    
    public  int  getNumber(){
    
	    return  this.number;
    
    }
    
      
    public  void  setAgency(int  agency){
    
	    this.agency=agency;
    
    }
    
      
    
    public  int  getAgency(){
    
	    return  this.agency;
    
    } 




## Execute
To execute the program you can go to  in your IDE and run it, but, i show how you can execute this in your own terminal: 
  - open your terminal in the folder that have the `bin/` file after this type:
		``` java app```
	  
