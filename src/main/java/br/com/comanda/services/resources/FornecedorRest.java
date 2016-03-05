package br.com.comanda.services.resources;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.comanda.services.models.Fornecedor;
import br.com.comanda.services.models.Product;

@Path("/fornecedor")
public class FornecedorRest {
	
	   // just an example to simulate a database
	   private static List<Fornecedor> fornecedores;

	   @Path("/listar")
	   @GET
	   @Produces(value = { MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	   public List<Fornecedor> exampleGet()
	   {
		   fornecedores = new ArrayList<Fornecedor>();
		   Fornecedor for1 = new Fornecedor();
		   for1.setCnpj("12345");
		   for1.setDataCadastro(new Date());
		   for1.setFornecedor("Vitor Quaresma");
		   for1.setIdFornecedor(1);
		   fornecedores.add(for1);
		   
		   Fornecedor for2 = new Fornecedor();
		   for2.setCnpj("12346");
		   for2.setDataCadastro(new Date());
		   for2.setFornecedor("Bryan Souza");
		   for2.setIdFornecedor(2);
		   fornecedores.add(for2);
	      return fornecedores;
	   }

//	   @Path("/")
//	   @POST
//	   @Produces(value = { MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
//	   public Response create(Product product) throws URISyntaxException
//	   {
//	      products.add(product);
//	      return Response.created(new URI("products")).build();
//	   }

}
