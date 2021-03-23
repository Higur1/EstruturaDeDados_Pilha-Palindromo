package pilhaPalindromo;

import pilhaPalindromo.Pilha;

public class Principal {

	public static void main(String[] args) {
		
		String palavra1 = "";
		String palavra2 = "";
		
		Pilha p = new Pilha();
		Pilha p2 = new Pilha();
		
		p.push("A");
		p.push(1);
		p.push(2);
		p.push(1);
		p.push("A");
		
		p.mostrar();
		
		palavra1 = p.palavras();
		
		while(p.estaVazia() == false) {
			p2.push(p.pop());
		}
		
		palavra2 = p2.palavras();
		
		if(palavra1.equals(palavra2)){
			System.out.println("É palindromo");
		}else {
			System.out.println("Não é palindromo");
		}
		p2.mostrar();

		
		
	}

}
