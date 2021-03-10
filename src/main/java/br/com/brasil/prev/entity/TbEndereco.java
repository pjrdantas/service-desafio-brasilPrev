package br.com.brasil.prev.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * The persistent class for the tb_endereco database table.
 * 
 */
@Entity
@Table(name="tb_endereco")
public class TbEndereco {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private long id;

	@Column(name="tb_endereco_bairro", nullable=false, length=100)
	private String tbEnderecoBairro;

	@Column(name="tb_endereco_cep", nullable=false, length=45)
	private String tbEnderecoCep;

	@Column(name="tb_endereco_cidade", nullable=false, length=45)
	private String tbEnderecoCidade;

	@Column(name="tb_endereco_complemento", length=100)
	private String tbEnderecoComplemento;

	@Column(name="tb_endereco_logradouro", nullable=false, length=100)
	private String tbEnderecoLogradouro;

	@Column(name="tb_endereco_numero", nullable=false, precision=10)
	private BigDecimal tbEnderecoNumero;

	@Column(name="tb_endereco_tipo", nullable=false, length=45)
	private String tbEnderecoTipo;

	@Column(name="tb_endereco_uf", nullable=false, length=45)
	private String tbEnderecoUf;

	//bi-directional many-to-one association to TbCliente
	@ManyToOne
	@JoinColumn(name="tb_cliente_id", nullable=false)
	private TbCliente tbCliente;

	public TbEndereco() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTbEnderecoBairro() {
		return this.tbEnderecoBairro;
	}

	public void setTbEnderecoBairro(String tbEnderecoBairro) {
		this.tbEnderecoBairro = tbEnderecoBairro;
	}

	public String getTbEnderecoCep() {
		return this.tbEnderecoCep;
	}

	public void setTbEnderecoCep(String tbEnderecoCep) {
		this.tbEnderecoCep = tbEnderecoCep;
	}

	public String getTbEnderecoCidade() {
		return this.tbEnderecoCidade;
	}

	public void setTbEnderecoCidade(String tbEnderecoCidade) {
		this.tbEnderecoCidade = tbEnderecoCidade;
	}

	public String getTbEnderecoComplemento() {
		return this.tbEnderecoComplemento;
	}

	public void setTbEnderecoComplemento(String tbEnderecoComplemento) {
		this.tbEnderecoComplemento = tbEnderecoComplemento;
	}

	public String getTbEnderecoLogradouro() {
		return this.tbEnderecoLogradouro;
	}

	public void setTbEnderecoLogradouro(String tbEnderecoLogradouro) {
		this.tbEnderecoLogradouro = tbEnderecoLogradouro;
	}

	public BigDecimal getTbEnderecoNumero() {
		return this.tbEnderecoNumero;
	}

	public void setTbEnderecoNumero(BigDecimal tbEnderecoNumero) {
		this.tbEnderecoNumero = tbEnderecoNumero;
	}

	public String getTbEnderecoTipo() {
		return this.tbEnderecoTipo;
	}

	public void setTbEnderecoTipo(String tbEnderecoTipo) {
		this.tbEnderecoTipo = tbEnderecoTipo;
	}

	public String getTbEnderecoUf() {
		return this.tbEnderecoUf;
	}

	public void setTbEnderecoUf(String tbEnderecoUf) {
		this.tbEnderecoUf = tbEnderecoUf;
	}

	public TbCliente getTbCliente() {
		return this.tbCliente;
	}

	public void setTbCliente(TbCliente tbCliente) {
		this.tbCliente = tbCliente;
	}

}