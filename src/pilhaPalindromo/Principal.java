package pilhaPalindromo;

import pilhaPalindromo.Pilha;

public class Principal {

	public static void main(String[] args) {
		Pilha p = new Pilha();
		Pilha p2 = new Pilha();
		
		p.push("A");
		p.push(1);
		p.push(2);
		p.push(4);
		p.push("B");
		
		p.mostrar();
		
		while(p.estaVazia() == false) {
			p2.push(p.pop());
		}

		p2.mostrar(); 
	}

}
