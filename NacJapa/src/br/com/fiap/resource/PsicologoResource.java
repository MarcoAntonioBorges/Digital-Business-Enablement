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

import br.com.fiap.beans.PsicologoTO;
import br.com.fiap.bo.PsicologoBO;

@Path("/psicologo")
public class PsicologoResource {

	private PsicologoBO psicologoBO = new PsicologoBO();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<PsicologoTO> buscarLista(){
		return psicologoBO.listar();
	}

	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public PsicologoTO buscar(@PathParam("id") int codigo) throws Exception{
		return psicologoBO.consultarPsicologo(codigo);
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response cadastrar(PsicologoTO psicologo, @Context UriInfo uriInfo){
		psicologoBO.cadastrarPsicologo(psicologo);
		UriBuilder builder = uriInfo.getAbsolutePathBuilder();
		builder.path(Integer.toString(psicologo.getCodigo()));
		return Response.created(builder.build()).build();
	}

	@PUT
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response atualizar(PsicologoTO psicologo, @PathParam("id") int codigo){
		psicologo.setCodigo(codigo);
		psicologoBO.atualizarPsicologo(psicologo);
		return Response.ok().build();
	}

	@DELETE
	@Path("/{id}")
	public void remover(@PathParam("id") int codigo){
		psicologoBO.deletarPsicologo(codigo);
	}

}
