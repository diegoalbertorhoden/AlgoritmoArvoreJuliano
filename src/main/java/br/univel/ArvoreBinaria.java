package br.univel;

public class ArvoreBinaria {

	private No raiz;
	private ArvoreBinaria arvoreEsquerda;
	private ArvoreBinaria arvoreDireita;

	//subclasse No
	public class No{
		private Pessoa pessoa;
		//construtor...		
		public No(Pessoa p){
			this.setPessoa(p);
		}
		//getters and setters		
		public Pessoa getPessoa() {
			return pessoa;
		}
		public void setPessoa(Pessoa pessoa) {
			this.pessoa = pessoa;
		}		
	}
	
	public class Pessoa{
		int cpf;
		String nome;
		
		public Pessoa(int cpf, String nome){
			
		}

		public int getCpf() {
			return cpf;
		}

		public void setCpf(int cpf) {
			this.cpf = cpf;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}
	}
	
	//metodo e instancia da subclasse No
	public void insereNo(int cpf, String nome){
		Pessoa p = new Pessoa(cpf, nome);
		No no = new No(p);
		this.inserir(no);
	}
	//metodo recursivo que será chamado n vezes até que seja satisfeita a condição.
	private void inserir(No no) {
		//primeira verificação se a raiz é nula, se for, joga o nó dentro... 
		//TODA A INSERÇÃO SERÁ FEITA AQUI... POIS A RECURSÃO INSTANCIA UM OBJETO DE ARVORE BINARIA JOGANDO PRA CÁ.
		if( this.raiz == null){
			this.raiz = no;
		}else{
			if(no.getPessoa()< this.raiz.getPessoa()){
				if( this.arvoreEsquerda == null)
					this.arvoreEsquerda = new ArvoreBinaria();
				//recursão... muito loco...
				this.arvoreEsquerda.inserir(no);				

			}else if(no.getPessoa()> this.raiz.getPessoa()){
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
		System.out.println("Valor: "+ this.raiz.getPessoa());
		
		if(this.arvoreEsquerda != null){
			this.arvoreEsquerda.percorrerPreOrdem();
		}
		if(this.arvoreDireita != null){
			this.arvoreDireita.percorrerPreOrdem();
		}
		
	}
}