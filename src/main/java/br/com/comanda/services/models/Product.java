package br.com.comanda.services.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Product
{

   private String name;

   /**
    * @deprecated frameworks only
    */
   public Product()
   {
   }

   public Product(String name)
   {
      this.name = name;
   }

   @Override
   public String toString()
   {
      return "Product [name=" + name + "]";
   }

}
