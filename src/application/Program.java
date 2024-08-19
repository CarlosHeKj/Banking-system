package application;

import java.util.Scanner;

import entities.Bank;

public class Program {

	public static void main(String[] args) {
		Bank bank = new Bank();
		Scanner sc = new Scanner(System.in);
		
		bank.startBank();
		
		sc.close();

	}

}
