package br.com.fiap.beans;


import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PsicologoTO {
	
	private int codigo;
	
	private String nome;
	
	private String dataNasc;
	
	private long numeroCRM;

	private String emailContato;
	
	private String telefoneContato;

	public PsicologoTO(int codigo, String nome, String dataNasc, long numeroCRM, String emailContato,
			String telefoneContato) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.dataNasc = dataNasc;
		this.numeroCRM = numeroCRM;
		this.emailContato = emailContato;
		this.telefoneContato = telefoneContato;
	}
	
	

	public PsicologoTO(String nome, String dataNasc, long numeroCRM, String emailContato, String telefoneContato) {
		super();
		this.nome = nome;
		this.dataNasc = dataNasc;
		this.numeroCRM = numeroCRM;
		this.emailContato = emailContato;
		this.telefoneContato = telefoneContato;
	}



	public PsicologoTO() {
		super();
	}



	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}

	public long getNumeroCRM() {
		return numeroCRM;
	}

	public void setNumeroCRM(long numeroCRM) {
		this.numeroCRM = numeroCRM;
	}

	public String getEmailContato() {
		return emailContato;
	}

	public void setEmailContato(String emailContato) {
		this.emailContato = emailContato;
	}

	public String getTelefoneContato() {
		return telefoneContato;
	}

	public void setTelefoneContato(String telefoneContato) {
		this.telefoneContato = telefoneContato;
	}
	
	
	
	
	
}
