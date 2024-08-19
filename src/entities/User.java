package entities;

import java.util.Objects;

public class User {
	private String firstName;
	private String lastName;
	private String cpf;
	private double balance;
	
	public User() {
		
	}
	public User(String firstName, String lastName, String cpf) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.cpf = cpf;
		this.balance = 0.0;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	@Override
	public int hashCode() {
		return Objects.hash(cpf);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(cpf, other.cpf);
	}

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", cpf=" + cpf + ", balance=" + balance
				+ "]";
	}
	
	
	
	

}
