package Banck.test.banck;

public class Month {
	private Long id;  
	private double income;
	private double spending;
	private double balance;
	public Month(Long id, double income, double spending, double balance) {
		super();
		this.id = id;
		this.income = income;
		this.spending = spending;
		this.balance=balance;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public double getIncome() {
		return income;
	}
	public void setIncome(double income) {
		this.income = income;
	}
	public double getSpending() {
		return spending;
	}
	public void setSpending(double spending) {
		this.spending = spending;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	
}
