package br.univel;

public class ArvoreBinaria {
	
	private No raiz;
	
//subclasse No
	public class No{
		private int valor;
//construtor...		
		public No(int valor){
			this.setValor(valor);
		}
//getters and setters		
		public int getValor() {
			return valor;
		}

		public void setValor(int valor) {
			this.valor = valor;
		}		
	}
//metodo e instancia da subclasse No
	public void insereNo(int valor){
		No no = new No(valor);
		this.inserir(no);
	}
//metodo recursivo que ser� chamado n vezes at� que seja satisfeita a condi��o.
private void inserir(No no) {
	
	
	
}

}
