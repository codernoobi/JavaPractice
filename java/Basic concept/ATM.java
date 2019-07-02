/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Akash
 */
import java.util.Scanner;

public class ATM {
	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);

		int pass = 1234, p;
		int userChoice;
		boolean quit = false;
		float balance = 0;

		System.out.println("Enter the Password");
		p = in.nextInt();
		if (p == pass) {
			do {
				System.out.println("1:Deposite\n2:With draw\n3:Check balance\n");
				System.out.println("Your choice 0 to quit");
				try {
					userChoice = in.nextInt();

					switch (userChoice) {
					case 1:
						float amount;
						System.out.println("Amount to Deposite:");
						try {
							amount = in.nextFloat();
							if (amount <= 0)
								System.out.println("***Cant deposite amount***");
							else {
								balance += amount;
								System.out.println("***Rs." + amount + " has been deposited***");
							}
						} catch (Exception e) {
							System.out.println("Invalid input\n TRY AGAIN!\n");
							quit = true;
						}
						break;

					case 2:
						System.out.println("\n\nAmount to With draw:");
						try {
							amount = in.nextFloat();
							if (amount <= 0 || amount > balance)
								System.out.println("***Withdrawl not possible***\n\n");
							else {
								balance -= amount;
								System.out.println("***Rs." + amount + " has been withdrawed***\n\n");
							}
						} catch (Exception e) {
							System.out.println("Invalid input\n TRY AGAIN!\n");
							quit = true;
						}
						break;

					case 3:
						System.out.println("***Balance is: " + balance + "***");
						break;

					case 0:
						quit = true;
						break;

					default:
						System.out.println("\n\n!Wrong choice!");
						break;
					}
				} catch (Exception e) {
					System.out.println("Wrong Choice\n TRY AGAIN!\n");
					quit = true;
				}
				System.out.println();
			} while (!quit);
			System.out.println("***Thank you***");
		} else
			System.out.println("!Wrong password!");

		in.close();
	}
}