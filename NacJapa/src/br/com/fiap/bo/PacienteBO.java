package br.com.fiap.bo;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.beans.PacienteTO;
import br.com.fiap.beans.Sexo;

public class PacienteBO {

	private static final ArrayList<PacienteTO> PACIENTES = new ArrayList<PacienteTO>();

	static{
		PACIENTES.add(new PacienteTO(401, "Marco Antonio", "Paciente meio descontrolado", "30/02/1997", Sexo.MASCULINO));
		PACIENTES.add(new PacienteTO(402, "Henry Van", "Paciente raivoso", "30/02/1997", Sexo.FEMININO));
		PACIENTES.add(new PacienteTO(403, "Matheus M.", "Paciente precisando de ajuda com urgencia", "30/02/1997", Sexo.OUTROS));
		PACIENTES.add(new PacienteTO(-1, "Usuario nao encontrado", "Sem descricao", null, null));
	}


	public PacienteTO consultarPaciente(int codigo) {
		for (PacienteTO pacienteTO : PACIENTES) {
			if(codigo == pacienteTO.getCodigo()) {
				return pacienteTO;
			}
		}
		return this.consultarPaciente(-1);
	}
	
	public void deletarPaciente(int codigo) {
		for (int i = 0; i < PACIENTES.size(); i++) {
			if (codigo == PACIENTES.get(i).getCodigo()) {
				PACIENTES.remove(i);
			}
		}
	}
	
	public void atualizarPaciente(PacienteTO paciente) {
		for (PacienteTO pacienteTO : PACIENTES) {
			if(paciente.getCodigo() == pacienteTO.getCodigo()) {
				pacienteTO.setCodigo(paciente.getCodigo());
				pacienteTO.setNome(paciente.getNome());
				pacienteTO.setDescricao(paciente.getDescricao());
				pacienteTO.setSexo(paciente.getSexo());
				pacienteTO.setDataNasc(paciente.getDataNasc());
			}
		}
	}

	public void cadastrarPaciente(PacienteTO paciente) {
		PACIENTES.add(paciente);
	}
	
	public List<PacienteTO> listar() {
		return PACIENTES;
	}


}
