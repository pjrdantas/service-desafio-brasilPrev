package br.com.brasil.prev.dto;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "id", "cpf", "nome", "Endereco" })
public class Cliente {

	@JsonProperty("id")
	private Long id;
	@JsonProperty("cpf")
	private String cpf;
	@JsonProperty("nome")
	private String nome;
	@JsonProperty("Endereco")
	private List<Endereco> endereco = null;
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

	@JsonProperty("cpf")
	public String getCpf() {
		return cpf;
	}

	@JsonProperty("cpf")
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@JsonProperty("nome")
	public String getNome() {
		return nome;
	}

	@JsonProperty("nome")
	public void setNome(String nome) {
		this.nome = nome;
	}

	@JsonProperty("Endereco")
	public List<Endereco> getEndereco() {
		return endereco;
	}

	@JsonProperty("Endereco")
	public void setEndereco(List<Endereco> endereco) {
		this.endereco = endereco;
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