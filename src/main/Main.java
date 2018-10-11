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
		for(int i=entrada.length()-1; i>=0; i--) {
			letraCorrente=entrada.charAt(i);
			saida=saida+letraCorrente;
		}
		System.out.println(saida);
		System.out.println("De novo? s ou n");
		String sOuN=sc.nextLine();
		if(sOuN=="s") inverte();
		else System.out.println("E quem disse que vou te largar? Não aprendi a finalizar o programa, então você vai jogar de novo.");
	}

public static void main (String[] args) {
	inverte();
	}
}
