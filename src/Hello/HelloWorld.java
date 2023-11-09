package Hello;

import Verbo.Verbo;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		String rad, suf;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o raial: ");
		rad = sc.nextLine();
		System.out.println("Digite o sufixo ");
		suf = sc.nextLine();
		Verbo verbo = new Verbo(rad,suf);
		verbo.conjugar();
	}
}
