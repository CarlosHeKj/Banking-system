package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Bank;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Bank bank = new Bank();
		Scanner sc = new Scanner(System.in);
		
		bank.startBank();
		
		sc.close();

	}

}
