package br.com.brasil.prev.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * The persistent class for the tb_cliente database table.
 * 
 */
@Entity
@Table(name="tb_cliente")
public class TbCliente  {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private long id;

	@Column(name="tb_cliente_cpf", nullable=false, length=45)
	private String tbClienteCpf;

	@Column(name="tb_cliente_nome", nullable=false, length=45)
	private String tbClienteNome;

	//bi-directional many-to-one association to TbEndereco
	@OneToMany(mappedBy="tbCliente")
	private List<TbEndereco> tbEnderecos;

	public TbCliente() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTbClienteCpf() {
		return this.tbClienteCpf;
	}

	public void setTbClienteCpf(String tbClienteCpf) {
		this.tbClienteCpf = tbClienteCpf;
	}

	public String getTbClienteNome() {
		return this.tbClienteNome;
	}

	public void setTbClienteNome(String tbClienteNome) {
		this.tbClienteNome = tbClienteNome;
	}

	public List<TbEndereco> getTbEnderecos() {
		return this.tbEnderecos;
	}

	public void setTbEnderecos(List<TbEndereco> tbEnderecos) {
		this.tbEnderecos = tbEnderecos;
	}

	public TbEndereco addTbEndereco(TbEndereco tbEndereco) {
		getTbEnderecos().add(tbEndereco);
		tbEndereco.setTbCliente(this);

		return tbEndereco;
	}

	public TbEndereco removeTbEndereco(TbEndereco tbEndereco) {
		getTbEnderecos().remove(tbEndereco);
		tbEndereco.setTbCliente(null);

		return tbEndereco;
	}

}