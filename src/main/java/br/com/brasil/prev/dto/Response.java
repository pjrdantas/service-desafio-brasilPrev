package br.com.brasil.prev.dto;

public class Response {

	private int codigo;
	private String mensagem;
 
	public Response() {}
 
	public Response(int codigo, String mensagem) {
		this.codigo   = codigo;
		this.mensagem =  mensagem;
	}
 
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getMensagem() {
		return mensagem;
	}
 
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
}
