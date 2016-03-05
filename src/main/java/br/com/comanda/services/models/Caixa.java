package br.com.comanda.services.models;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Caixa {
	public Date getInicio() {
		return inicio;
	}
	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}
	public Date getFim() {
		return fim;
	}
	public void setFim(Date fim) {
		this.fim = fim;
	}
	public Date getInicioCaixa() {
		return inicioCaixa;
	}
	public void setInicioCaixa(Date inicioCaixa) {
		this.inicioCaixa = inicioCaixa;
	}
	public Date getFimCaixa() {
		return fimCaixa;
	}
	public void setFimCaixa(Date fimCaixa) {
		this.fimCaixa = fimCaixa;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getIdCaixa() {
		return idCaixa;
	}
	public void setIdCaixa(int idCaixa) {
		this.idCaixa = idCaixa;
	}
	private Date inicio, fim, inicioCaixa, fimCaixa;
	private int status, idCaixa;

}
