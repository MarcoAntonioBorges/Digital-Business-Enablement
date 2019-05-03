package br.com.fiap.bo;

import java.util.ArrayList;
import java.util.List;


import br.com.fiap.beans.PsicologoTO;

public class PsicologoBO {
	private static final ArrayList<PsicologoTO> PSICOLOGOS = new ArrayList<PsicologoTO>();

	static{
		PSICOLOGOS.add(new PsicologoTO(401, "Doutor Eugenio", "02/06/1999", 2132134, "eugeniomesmo@gmail.com", "92341-3456"));
		PSICOLOGOS.add(new PsicologoTO(402, "Lucas divino", "20/03/2000", 9956751, "mendeirosParada@gmail.com", "97720-1212"));
		PSICOLOGOS.add(new PsicologoTO(403, "Tadeu mancau", "11/12/1930",   4113110, "tadeuDoutorMestre@gmail.com", "93211-6473"));
		PSICOLOGOS.add(new PsicologoTO(-1, "Psicologo nao encontrado", null, 0, null, null));
	}


	public PsicologoTO consultarPsicologo(int codigo) throws Exception {
		for (PsicologoTO PsicologoTO : PSICOLOGOS) {
			if(codigo == PsicologoTO.getCodigo()) {
				return PsicologoTO;
			}
		}
		return this.consultarPsicologo(-1);
	}
	
	public void deletarPsicologo(int codigo) {
		for (int i = 0; i < PSICOLOGOS.size(); i++) {
			if (codigo == PSICOLOGOS.get(i).getCodigo()) {
				PSICOLOGOS.remove(i);
			}
		}
	}
	
	public void atualizarPsicologo(PsicologoTO psicologo) {
		for (PsicologoTO psicologoTO : PSICOLOGOS) {
			if(psicologo.getCodigo() == psicologoTO.getCodigo()) {
				psicologoTO.setCodigo(psicologo.getCodigo());
				psicologoTO.setNome(psicologo.getNome());
				psicologoTO.setDataNasc(psicologo.getDataNasc());
				psicologoTO.setNumeroCRM(psicologo.getNumeroCRM());
				psicologoTO.setEmailContato(psicologo.getEmailContato());
				psicologoTO.setTelefoneContato(psicologo.getTelefoneContato());
			}
		}
	}

	public void cadastrarPsicologo(PsicologoTO psicologo) {
		PSICOLOGOS.add(psicologo);
	}
	
	public List<PsicologoTO> listar() {
		return PSICOLOGOS;
	}
}
