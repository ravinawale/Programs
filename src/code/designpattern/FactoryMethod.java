package code.designpattern;

//Factory Method is a creational design pattern 
//That provides an interface for creating objects in a superclass, 
//But allows subclasses to alter the type of objects that will be created.

public class FactoryMethod {

    private BankAccountFactory bankAccountFactory;

    public FactoryMethod(BankAccountFactory bankAccountFactory){
        this.bankAccountFactory = bankAccountFactory;
    }

    public BankAccount openAccount(String type) {
    	
        BankAccount bankAccount = bankAccountFactory.createAccount(type);
        
        bankAccount.validateUserIdentity();
        bankAccount.calculateInterestRate();
        bankAccount.registerAccount();

        return bankAccount;
    }
}

class BankAccountFactory {

	public BankAccount createAccount(String type){
        BankAccount bankAccount = null;
        if (type.equals("P")){
            bankAccount = new PersonalAccount();
        } else if (type.equals("B")){
            bankAccount = new BusinessAccount();
        } else if (type.equals("C")){
            bankAccount = new CheckingAccount();
        } else {
            System.out.println("Invalid type");
        }
        return bankAccount;
    }
}

abstract class BankAccount {
	public abstract void validateUserIdentity();
	public abstract void calculateInterestRate();
	public abstract void registerAccount();
}

class BusinessAccount extends BankAccount {
	@Override
	public void validateUserIdentity() {
	}
	@Override
	public void calculateInterestRate() {
	}
	@Override
	public void registerAccount() {
	}
}

class CheckingAccount extends BankAccount {
	@Override
	public void validateUserIdentity() {
	}
	@Override
	public void calculateInterestRate() {
	}
	@Override
	public void registerAccount() {
	}
}

class PersonalAccount extends BankAccount {
	@Override
	public void validateUserIdentity() {
	}
	@Override
	public void calculateInterestRate() {
	}
	@Override
	public void registerAccount() {
	}
}

