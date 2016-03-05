package br.com.comanda.services.models;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Produto {
	private int idProduto, quantidade, quantidadeSelecionada, idEstoque,
	incremento, codigo;
	private String produto, imagem, descricao;
	public int getIdProduto() {
		return idProduto;
	}
	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public int getQuantidadeSelecionada() {
		return quantidadeSelecionada;
	}
	public void setQuantidadeSelecionada(int quantidadeSelecionada) {
		this.quantidadeSelecionada = quantidadeSelecionada;
	}
	public int getIdEstoque() {
		return idEstoque;
	}
	public void setIdEstoque(int idEstoque) {
		this.idEstoque = idEstoque;
	}
	public int getIncremento() {
		return incremento;
	}
	public void setIncremento(int incremento) {
		this.incremento = incremento;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public String getImagem() {
		return imagem;
	}
	public void setImagem(String imagem) {
		this.imagem = imagem;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public byte[] getImagemProduto() {
		return imagemProduto;
	}
	public void setImagemProduto(byte[] imagemProduto) {
		this.imagemProduto = imagemProduto;
	}
	public Date getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	private double preco;
	private byte[] imagemProduto;
	private Date dataCadastro;	
}
