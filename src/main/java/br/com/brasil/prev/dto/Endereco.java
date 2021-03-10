package br.com.brasil.prev.dto;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "id", "logradouro", "complemento", "numero", "bairro", "cidade", "uf", "cep", "tipo" })
public class Endereco {

	@JsonProperty("id")
	private Long id;
	@JsonProperty("logradouro")
	private String logradouro;
	@JsonProperty("complemento")
	private String complemento;
	@JsonProperty("numero")
	private Double numero;
	@JsonProperty("bairro")
	private String bairro;
	@JsonProperty("cidade")
	private String cidade;
	@JsonProperty("uf")
	private String uf;
	@JsonProperty("cep")
	private String cep;
	@JsonProperty("tipo")
	private String tipo;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("id")
	public Long getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(Long id) {
		this.id = id;
	}

	@JsonProperty("logradouro")
	public String getLogradouro() {
		return logradouro;
	}

	@JsonProperty("logradouro")
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	@JsonProperty("complemento")
	public String getComplemento() {
		return complemento;
	}

	@JsonProperty("complemento")
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	@JsonProperty("numero")
	public Double getNumero() {
		return numero;
	}

	@JsonProperty("numero")
	public void setNumero(Double numero) {
		this.numero = numero;
	}

	@JsonProperty("bairro")
	public String getBairro() {
		return bairro;
	}

	@JsonProperty("bairro")
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	@JsonProperty("cidade")
	public String getCidade() {
		return cidade;
	}

	@JsonProperty("cidade")
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	@JsonProperty("uf")
	public String getUf() {
		return uf;
	}

	@JsonProperty("uf")
	public void setUf(String uf) {
		this.uf = uf;
	}

	@JsonProperty("cep")
	public String getCep() {
		return cep;
	}

	@JsonProperty("cep")
	public void setCep(String cep) {
		this.cep = cep;
	}

	@JsonProperty("tipo")
	public String getTipo() {
		return tipo;
	}

	@JsonProperty("tipo")
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}
