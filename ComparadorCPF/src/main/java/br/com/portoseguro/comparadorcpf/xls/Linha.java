package br.com.portoseguro.comparadorcpf.xls;

public class Linha {
	
	private long numero = 0;
	private long sucursal = 0;
	private long ramo = 0;	
	private long apolice = 0;
	private long cpf = 0;
	private long digito = 0;
	private String comparacao = "";
	
	public long getNumero() {
		return numero;
	}
	public void setNumero(long numero) {
		this.numero = numero;
	}
	public long getSucursal() {
		return sucursal;
	}
	public void setSucursal(long sucursal) {
		this.sucursal = sucursal;
	}
	public long getRamo() {
		return ramo;
	}
	public void setRamo(long ramo) {
		this.ramo = ramo;
	}
	public long getApolice() {
		return apolice;
	}
	public void setApolice(long apolice) {
		this.apolice = apolice;
	}
	public long getCpf() {
		return cpf;
	}
	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	public long getDigito() {
		return digito;
	}
	public void setDigito(long digito) {
		this.digito = digito;
	}
	public String getComparacao() {
		return comparacao;
	}
	public void setComparacao(String comparacao) {
		this.comparacao = comparacao;
	}
	
	
	
	
	
	
	
	
}
