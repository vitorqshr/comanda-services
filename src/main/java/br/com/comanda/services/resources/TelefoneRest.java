package br.com.comanda.services.resources;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.comanda.services.models.Produto;
import br.com.comanda.services.models.Telefone;

@Path("/telefone")
public class TelefoneRest {
	
	private static List<Telefone> telefones;
	

	@Path("/listar")
	@GET
	@Produces(value = { MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public List<Telefone> exampleGet() {
		telefones = new ArrayList<Telefone>();
		Telefone telefone = new Telefone();
		telefone.setIdTelefone(1);
		telefone.setTelefone("12345678");
		telefones.add(telefone);
		return telefones;
	}
	
	

}
