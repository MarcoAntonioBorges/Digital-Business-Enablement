package br.com.fiap.springdata.config.validacao;

public class ErroDeFormularioDTO {
	
	private String campo;
	private String erro;
	
	
	public ErroDeFormularioDTO(String campo, String erro) {
		super();
		this.campo = campo;
		this.erro = erro;
	}


	public ErroDeFormularioDTO() {
		// TODO Auto-generated constructor stub
	}


	public String getCampo() {
		return campo;
	}


	public String getErro() {
		return erro;
	}
	
	
	
}