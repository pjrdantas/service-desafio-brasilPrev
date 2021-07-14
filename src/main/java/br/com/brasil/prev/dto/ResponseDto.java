package br.com.brasil.prev.dto;

public class ResponseDto {

	private int response_code;
	private String response_message;
 
	public ResponseDto() {}
 
	public ResponseDto(int codigo, String mensagem) {
		this.response_code   = codigo;
		this.response_message =  mensagem;
	}
 
	public int getResponse_code() {
		return response_code;
	}
	public void setResponse_code(int codigo) {
		this.response_code = codigo;
	}
	public String getMensagem() {
		return getResponse_message();
	}

	public String getResponse_message() {
		return response_message;
	}
 
	public void setMensagem(String mensagem) {
		setResponse_message(mensagem);
	}

	public void setResponse_message(String mensagem) {
		this.response_message = mensagem;
	}
}
