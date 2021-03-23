package pilhaPalindromo;

import pilhaPalindromo.Pilha;

public class Principal{

	public static void main(String[] args){
	
		String palavra1 = "";
		String palavra2 = "";
		
		Pilha p = new Pilha();
		Pilha p2 = new Pilha();
		
		p.push("o");
		p.push("p");
		p.push("e");
		p.push("r");
		p.push("a");
		
		p.mostrar();
		
		palavra1 = p.palavras();
		
		while(p.estaVazia() == false){
			p2.push(p.pop());
		}
		
		p2.mostrar();

		palavra2 = p2.palavras();
		
		if(palavra1.equals(palavra2)){
			System.out.println("É palindromo");
		}else{
			System.out.println("Não é palindromo");
		}
	
	}
}
