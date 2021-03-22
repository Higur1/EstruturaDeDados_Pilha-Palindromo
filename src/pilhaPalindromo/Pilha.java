package pilhaPalindromo;

import javax.swing.JOptionPane;

public class Pilha {
	public Object[] pilha;
	public int elementos;
	public int aux;
	
	public Pilha() {
		this.elementos = -1;
		this.pilha = new Object[5];
	}
	
	public boolean estaVazia() {
		if(elementos == -1) {
			return true;
		}
		return false;
	}
	
	public Object pop() {
		if (estaVazia()) {
			return null;
		}
		return pilha[elementos--];
	}
	public void push(Object objeto) {
		if(elementos < pilha.length -1) {
			pilha[++elementos] = objeto;
		}
	}
	public void mostrar() {
        String printar = "";
        for (int c = elementos; c >= 0; c--) {
            printar += pilha[c] + "  ";
        }
        JOptionPane.showMessageDialog(null,printar);
	}
}
