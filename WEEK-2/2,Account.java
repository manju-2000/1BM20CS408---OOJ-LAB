/*Develop a Java program to create a class Bank that maintains two kinds of account for its
customers, one called savings account and the other current account. The savings account
provides compound interest and withdrawal facilities but no cheque book facility. The current
account provides cheque book facility but no interest. Current account holders should also
maintain a minimum balance and if the balance falls below this level, a service charge is
imposed. Create a class Account that stores customer name, account number and type of
account. From this derive the classes Curr-acct and Sav-acct to make them more specific to
their requirements. Include the necessary methods in order to achieve the following tasks: •
Accept deposit from customer and update the balance. • Display the balance. • Compute and
deposit interest • Permit withdrawal and update the balance • Check for the minimum balance,
impose penalty if necessary and update the balance*/

import java.util.Scanner;

abstract class Account {
    String cName, accType;
    long accNo;
    double bal;
    final double minBal = 1000.0;

    Account(String cName, long accNo, double bal, String accType) {
        this.accNo = accNo;
        this.cName = cName;
        this.bal = bal;
        this.accType = accType;
    }

    abstract void addBal(double amt);

    abstract void dispBal();

    abstract void withBal(double amt);
}

class Curr_acct extends Account {
    Curr_acct(String cName, long accNo, double bal) {
        super(cName, accNo, bal, "Current");
        System.out.println("Name: "+cName+"\taccno: "+accNo+"\tbal: "+bal+"\ttype: "+accType);
    }

    void addBal(double amt){
        this.bal  += amt;
        
    }

    void dispBal(){
        System.out.println("Your balance is: " + this.bal);
    }
	void checkBal() {
        if (this.bal < minBal) {
			System.out.println("Insufficient balance, penalty imposed");
            this.bal -= this.bal * 0.02;
        }
}

    void withBal(double amt){
        this.bal -= amt;
        checkBal();
    }

}

class Sav_acct extends Account {
    Sav_acct(String cName, long accNo, double bal) {
        super(cName, accNo, bal, "Savings");
        System.out.println("name: " + cName + "\taccno: " + accNo + "\tbal: " + bal + "\ttype: " + accType);
    }

    void addBal(double amt){
        this.bal  += amt;
        addIntr();
    }
    
    void addIntr() {
        this.bal += this.bal * 0.07;
    }

    void dispBal(){
        System.out.println("Your balance is: " + this.bal);
    }
	

    void withBal(double amt){
        this.bal -= amt;
        
    }
    
    
   
    }


class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double amt;
		System.out.println("Enter your details:");
		System.out.println("Name:");
		String x=sc.next();
		System.out.println("Account Number:");
		long y=sc.nextLong();
		for(;;)
		{
		System.out.println("Type of account:\n1.Current account\n2.Savings account\n3.Exit");
		int t=sc.nextInt();
	
			
        if(t==1){
			System.out.println("The current account provides cheque book facility but no interest.");
		Curr_acct c = new Curr_acct(x, y, 50000);
        for(;;)
			{
            System.out.println("1:Deposit\n2:Display Balance\n3:Withdraw\n4:Exit");
            int ch = sc.nextInt();
		
            switch (ch) {
                case 1:
                    System.out.println("Enter the amount to be added:");
                    amt = sc.nextDouble();
                    c.addBal(amt);
                    break;

                case 2:
                    c.dispBal();
                    break;

                case 3:
                    System.out.println("Enter the amount to be withdrawn:");
                    amt = sc.nextDouble();
                    c.withBal(amt);
                    break;
				case 4:System.exit(0);
		        default:System.out.println("Invalid choice! Try again");
            }
			}
        
		}
		
        else if(t==2){
			System.out.println("The savings account provides compound interest and withdrawal facilities but no cheque book facility.");
		Sav_acct s = new Sav_acct(x, y, 5000);
        for(;;) {
            System.out.println("1:Deposit\n2:Display Balance\n3:Withdraw\n4:Exit");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter the amount to be added:");
                    amt = sc.nextDouble();
                    s.addBal(amt);
                    break;

                case 2:
                    s.dispBal();
                    break;

                case 3:
                    System.out.println("Enter the amount to be withdrawn:");
                    amt = sc.nextDouble();
                    s.withBal(amt);
                    break;
                case 4:System.exit(0);
		        default:System.out.println("Invalid choice! Try again");
            }
        }
		}
		else if(t==3)
			System.exit(0);
		else
			System.out.println("Invalid choice! Try again");
		
		
		}
		}
    }
