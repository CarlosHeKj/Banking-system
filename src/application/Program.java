package application;

import java.util.Locale;

import entities.User;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		User user1 = new User("Carlos", "Henrique", "111.222.333-65", 2000.0);
		System.out.println(user1);
	}

}
