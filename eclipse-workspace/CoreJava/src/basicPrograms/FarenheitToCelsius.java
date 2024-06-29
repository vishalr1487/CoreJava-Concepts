package basicPrograms;

import java.util.Scanner;

public class FarenheitToCelsius {

	public static void main(String[] args) {

		System.out.println("Enter temperatur in farenhiet :");
		Scanner sc = new Scanner(System.in);
		int temperature = sc.nextInt();

		temperature = ((temperature - 32) * 5) / 9;

		System.out.println("Temperature in celsius : " + temperature);

	}

}
