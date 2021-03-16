package br.com.brasil.prev.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * The persistent class for the tb_customer database table.
 * 
 */
@Entity
@Table(name="tb_customer")

public class TbCustomer {

	@Id
	@Column(unique=true, nullable=false)
	private long id;

	@Column(name="tb_customer_cpf", nullable=false, length=45)
	private String tbCustomerCpf;

	@Column(name="tb_customer_name", nullable=false, length=45)
	private String tbCustomerName;

	public TbCustomer() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTbCustomerCpf() {
		return this.tbCustomerCpf;
	}

	public void setTbCustomerCpf(String tbCustomerCpf) {
		this.tbCustomerCpf = tbCustomerCpf;
	}

	public String getTbCustomerName() {
		return this.tbCustomerName;
	}

	public void setTbCustomerName(String tbCustomerName) {
		this.tbCustomerName = tbCustomerName;
	}

}