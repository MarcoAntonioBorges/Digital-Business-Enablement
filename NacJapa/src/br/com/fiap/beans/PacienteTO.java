package br.com.fiap.beans;


import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PacienteTO {

	private int codigo;
	
	private String nome;
	
	private String descricao;
	
	private String dataNasc;
	
	private Sexo sexo;

	
	
	
	public PacienteTO() {
		super();
	}

	public PacienteTO(String nome, String descricao, String dataNasc, Sexo sexo) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.dataNasc = dataNasc;
		this.sexo = sexo;
	}

	public PacienteTO(int codigo, String nome, String descricao, String dataNasc, Sexo sexo) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.descricao = descricao;
		this.dataNasc = dataNasc;
		this.sexo = sexo;
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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	
	
	
}
