package model;

public class CadastroDeLivros {
	
	public static void main(String[] args) {
		
		
		Autor autor = new Autor("Rodrigo", "rodrigo.turini@caelum.com.br", "123.456.789.10");


		Livro livro = new Livro(autor);
		livro.setNome("Java 8 Prático");
		livro.setDescricao("Novos recursos da linguagem");
		livro.setValor(59.90);
		livro.setIsbn("978-85-66250-46-6");
		
		livro.mostrarDetalhes();
		
	}
}
