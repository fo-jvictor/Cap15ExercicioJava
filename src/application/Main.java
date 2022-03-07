package application;

import java.util.Scanner;

import entities.Account;
import exceptions.PersonalException;

public class Main {

	public static void main(String[] args) {
		
		//Integer number, String holder, double balance, double withDrawLimit

		
			Scanner input = new Scanner(System.in);
			
			System.out.println("Dados da conta: ");
			System.out.print("Numero da conta: ");
			int number = input.nextInt();
			input.nextLine();
			System.out.print("Dono da conta: ");
			String holder = input.nextLine();
			System.out.print("Saldo inicial: ");
			double balance = input.nextDouble();
			System.out.print("Limite de saque: ");
			double withDrawLimit = input.nextDouble();
			
			Account account = new Account(number,holder,balance,withDrawLimit);
			
			try {
				System.out.print("Valor de saque desejado: ");
				double withDraw = input.nextDouble();
				account.withdraw(withDraw);				
				System.out.println(account.getBalance());
				}	
		 
		catch(PersonalException e){
			System.out.println(e.getMessage());
		}
		catch(RuntimeException e) {
			System.out.println("Unexpected error");
		}
			input.close();
		
	}

}
