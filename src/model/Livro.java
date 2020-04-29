package model;

public class Livro {

	private String nome;
	private String descricao;
	private double valor;
	private String isbn;
	private Autor autor;
	
	public Livro (Autor autor) {
		this();
		this.autor = autor;
	}
	
	public Livro () {
		this.isbn = "000-00-00000-00-0";
	}
	
	public void mostrarDetalhes() {
		System.out.println("Mostrando detalhes do livro");
		System.out.println("Nome: " + nome);
		System.out.println("Descrição: " + descricao);
		System.out.println("Valor: " + valor);
		System.out.println("ISBN: " + isbn);
		
		if (hasAutor()) {
			autor.mostrarDetalhes();
		}
		
		System.out.println("--");
	}

	public void aplicarDesconto(double porcentagem) {
		if (porcentagem > 0.3) {
			System.out.println("Desconto não pode ser mairo que 30%");;
		}
		valor -= valor * porcentagem;
	}
	
	public boolean hasAutor() {
		return autor != null;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Autor getAutor() {
		return autor;
	}

	// construtor já recebe autor     
//	public void setAutor(Autor autor) {
//		this.autor = autor;
//	}	
	
	
}
