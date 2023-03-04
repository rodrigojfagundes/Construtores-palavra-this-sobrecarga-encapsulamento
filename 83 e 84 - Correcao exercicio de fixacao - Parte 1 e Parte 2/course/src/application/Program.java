package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;
		
		
		System.out.print("enter account number: ");
		int number = sc.nextInt();
		System.out.print("enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("is there an initial deposit (y/n): ");
		char response = sc.next().charAt(0);
		if (response == 'y') {
			System.out.print("enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account (number, holder, initialDeposit);
		} else {
			account = new Account (number, holder);
		}
		System.out.println();
		System.out.println("account data: ");
		System.out.println(account);
		
		//pedindo para entrar com valor de deposito
		System.out.println();
		System.out.println("enter a deposit value: ");
		double depositValue = sc.nextDouble();
		//chamando a variavel ACCOUNT e depois chamando o metodo/funcao DEPOSIT
		//e passando o valor q ta na VARIAVEL DEPOSITVALUE
		account.deposit(depositValue);
		System.out.println("update account data: ");
		System.out.print(account);
		
		
				System.out.println();
				System.out.println("enter a withdraw value: ");
				double withdrawValue = sc.nextDouble();
				account.withdraw(withdrawValue);
				System.out.println("update account data: ");
				System.out.print(account);
		sc.close();

	}

}
