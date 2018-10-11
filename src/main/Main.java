package main;

import java.util.Scanner;

public class Main {
	static void inverte() {
		System.out.println("Me diga algo interessante.");
		Scanner sc=new Scanner(System.in);
		String entrada=sc.nextLine();
		char letraCorrente='a';
		String saida="";
		
		//Se liga nesse for
		for(int i=entrada.length(); i==0; i--) {
			System.out.println(i);
			letraCorrente=entrada.charAt(i);
			System.out.println(letraCorrente);
			saida=saida+letraCorrente;
		}
		System.out.println(saida);
		System.out.println("De novo? s ou n");
		String sOuN=sc.nextLine();
		System.out.println(sOuN);
	}

public static void main (String[] args) {
	inverte();
	}
}
