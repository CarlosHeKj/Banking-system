package entities;

import java.util.Scanner;

public  class Bank {
	User user = new User();
	Scanner sc = null;
	public Bank() {
		
	}
	public void startBank() {
		sc = new Scanner(System.in);
		System.out.println("Welcome to the bank XYZ!");
		System.out.println();
		System.out.print("Enter your firstName: ");
		String firstName = sc.nextLine();
		System.out.print("Enter your lastName: ");
		String lastName = sc.nextLine();
		System.out.print("Enter your cpf: ");
		String cpf = sc.nextLine();
		
		startUser(new User(firstName,lastName,cpf));
		displayMenu();
		
		System.out.println("Would you like to see your data? (y/n) ?");
		sc.nextLine();
		char res = sc.nextLine().charAt(0);
		if(res == 'y' || res == 'Y') {
		
		System.out.println("\nUser started with \n firstName: " + user.getFirstName() + "\n lastName: " + user.getLastName() + "\n cpf: " + user.getCpf() + "\n final balance: " + user.getBalance());
		}
		System.out.println("\nThank you for using our service");
		sc.close();
	}
	public  void startUser(User obj) {
		user.setFirstName(obj.getFirstName());
		user.setLastName(obj.getLastName());
		user.setCpf(obj.getCpf());
	}
	
	public void deposit(double value) {
		user.setBalance(user.getBalance() + value);
		System.out.println("Deposit of R$ "+ value+" completed successfully!");
	}
	public void withdraw(double value) {
		if(user.getBalance() >=value) {
			user.setBalance(user.getBalance() - value);
		System.out.println("withdram de R$" + value + " completed successfully!");
		}else {
			System.out.println("insufficient balance");
		}
	}

	
	public void displayMenu() {
		int option;
		do {
			System.out.println("\n------------Menu------------");
			System.out.println("1.check balance");
			System.out.println("2.make deposit");
			System.out.println("3.make withdrawal");
			System.out.println("4.Close");
			System.out.println("\n which option do you want to run? ");
			option = sc.nextInt();
			
			switch(option) {
			case 1: 
				System.out.println("balance R$ " + user.getBalance());
			break;
			case 2: 
				System.out.println("enter the deposit amount " );
				double valueDeposit = sc.nextDouble();
				deposit(valueDeposit);
				break;
			case 3: 
				System.out.println("enter the withdraw amount " );
				double valueWithdraw = sc.nextDouble();
				withdraw(valueWithdraw);
				break;
			case 4:
				System.out.println("closing...");
				break;
			default:
				System.out.println("optin invalid");
			
			}
		}while(option !=4);
		
		
	}
	
}
