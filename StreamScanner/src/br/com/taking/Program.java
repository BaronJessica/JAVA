package br.com.taking;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		FileInputStream stream = new FileInputStream("C:\\Users\\Lucas\\eclipse-workspace\\StreamScanner\\resources\\file.txt");
		float calcularMedia() throws FileNotFoundException;
		Scanner scanner = new Scanner(stream);
		
		String var = scanner.nextLine();
		float calcularMedia= var+scanner.nextLine();
		System.out.println(var);
		
	}

}
