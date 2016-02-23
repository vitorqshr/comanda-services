package br.com.comanda.services.resources;

import java.net.MalformedURLException;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.comanda.services.models.Product;

public class ProductCreationClientTest
{

   public static void main(String[] args) throws MalformedURLException
   {
      Client client = ClientBuilder.newClient();
      Builder request = client.target("http://localhost:8080/services/products")
            .request().accept(MediaType.APPLICATION_JSON);

      Entity<Product> entity = Entity.entity(new Product("new product"), MediaType.APPLICATION_JSON);
      Response response = request.buildPost(entity).invoke();

      System.out.println("Following location " + response.getLocation());

      ProductListClientTest.list(response.getLocation().toURL().toExternalForm());

   }
}
