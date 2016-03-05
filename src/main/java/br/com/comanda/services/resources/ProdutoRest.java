package br.com.comanda.services.resources;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.comanda.services.models.Fornecedor;
import br.com.comanda.services.models.Produto;

@Path("/produto")
public class ProdutoRest {

	private static List<Produto> produtos;

	@Path("/listar")
	@GET
	@Produces(value = { MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public List<Produto> exampleGet() {
		produtos = new ArrayList<Produto>();
		Produto produto1 = new Produto();
		produto1.setCodigo(1);
		produto1.setDataCadastro(new Date());
		produto1.setDescricao("Cerveja");
		produtos.add(produto1);
		return produtos;
	}

}
