package empresa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		ArrayList<String> nomes = new ArrayList<String>();
		Object scanner;
		Scanner teclado = new Scanner(System.in);
		String msg;
		System.out.println("Digite quantos nomes será inserido");
		int total = teclado.nextInt();
		
		System.out.println(" Digite os Nomes:");
		for (int i=0; i<total; i++) {
			msg = teclado.next();
			nomes.add(msg);
			
		}
for (String nome : nomes) {
	System.out.println(nomes);
}
System.out.println("Ordem Reversa");
Collections.reverse(nomes);
	System.out.println(nomes);
	}

}
