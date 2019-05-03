package br.com.fiap.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;

import br.com.fiap.beans.PacienteTO;
import br.com.fiap.bo.PacienteBO;

@Path("/paciente")
public class PacienteResource {
	
	private PacienteBO pacienteBO = new PacienteBO();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<PacienteTO> buscarLista(){
		return pacienteBO.listar();
	}

	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public PacienteTO buscar(@PathParam("id") int codigo) throws Exception{
		return pacienteBO.consultarPaciente(codigo);
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response cadastrar(PacienteTO paciente, @Context UriInfo uriInfo){
		pacienteBO.cadastrarPaciente(paciente);
		UriBuilder builder = uriInfo.getAbsolutePathBuilder();
		builder.path(Integer.toString(paciente.getCodigo()));
		return Response.created(builder.build()).build();
	}

	@PUT
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response atualizar(PacienteTO paciente, @PathParam("id") int codigo){
		paciente.setCodigo(codigo);
		pacienteBO.atualizarPaciente(paciente);
		return Response.ok().build();
	}

	@DELETE
	@Path("/{id}")
	public void remover(@PathParam("id") int codigo){
		pacienteBO.deletarPaciente(codigo);
	}
	
}
