package model;

public class Autor {

	private String nome;
	private String email;
	private String cpf;
	
	public Autor(String nome, String email, String cpf) {
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
	}
	
	public void mostrarDetalhes() {
		System.out.println("Detalhes do Autor");
		System.out.println("Nome: " + nome);
		System.out.println("Email: " + email);
		System.out.println("Cpf: " + cpf);
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	
}
