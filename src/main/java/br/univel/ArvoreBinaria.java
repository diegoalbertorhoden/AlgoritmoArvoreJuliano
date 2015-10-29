package br.univel;

public class ArvoreBinaria {

	private No raiz;
	private ArvoreBinaria arvoreEsquerda;
	private ArvoreBinaria arvoreDireita;

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
	//metodo recursivo que será chamado n vezes até que seja satisfeita a condição.
	private void inserir(No no) {
		//primeira verificação se a raiz é nula, se for, joga o nó dentro... 
		//TODA A INSERÇÃO SERÁ FEITA AQUI... POIS A RECURSÃO INSTANCIA UM OBJETO DE ARVORE BINARIA JOGANDO PRA CÁ.
		if( this.raiz == null){
			this.raiz = no;
		}else{
			if(no.getValor()< this.raiz.getValor()){
				if( this.arvoreEsquerda == null)
					this.arvoreEsquerda = new ArvoreBinaria();
				//recursão... muito loco...
				this.arvoreEsquerda.inserir(no);				

			}else if(no.getValor()> this.raiz.getValor()){
				if( this.arvoreDireita == null)
					this.arvoreDireita = new ArvoreBinaria();
				
				this.arvoreDireita.inserir(no);
			}
		}
	}
	public void percorrerPreOrdem(){
		if(this.raiz == null){
			System.out.println("Erro: Arvore Vazia");
			return;
		}
		System.out.println("Valor: "+ this.raiz.getValor());
		
		if(this.arvoreEsquerda != null){
			this.arvoreEsquerda.percorrerPreOrdem();
		}
		
	}
}