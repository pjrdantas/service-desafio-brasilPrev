package br.com.brasil.prev.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * The persistent class for the tb_address database table.
 * 
 */
@Entity
@Table(name="tb_address")
public class TbAddress {


	@Id
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="tb_address_city", nullable=false, length=45)
	private String tbAddressCity;

	@Column(name="tb_address_complement", length=100)
	private String tbAddressComplement;

	@Column(name="tb_address_cpf", nullable=false, length=45)
	private String tbAddressCpf;

	@Column(name="tb_address_district", nullable=false, length=100)
	private String tbAddressDistrict;

	@Column(name="tb_address_number", nullable=false, precision=10)
	private BigDecimal tbAddressNumber;

	@Column(name="tb_address_public_place", nullable=false, length=100)
	private String tbAddressPublicPlace;

	@Column(name="tb_address_state", nullable=false, length=45)
	private String tbAddressState;

	@Column(name="tb_address_zip", nullable=false, length=45)
	private String tbAddressZip;
	
	@Column(name="tb_address_type", nullable=false, length=45)
	private String tbAddressSType;

	public TbAddress() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTbAddressCity() {
		return tbAddressCity;
	}

	public void setTbAddressCity(String tbAddressCity) {
		this.tbAddressCity = tbAddressCity;
	}

	public String getTbAddressComplement() {
		return tbAddressComplement;
	}

	public void setTbAddressComplement(String tbAddressComplement) {
		this.tbAddressComplement = tbAddressComplement;
	}

	public String getTbAddressCpf() {
		return tbAddressCpf;
	}

	public void setTbAddressCpf(String tbAddressCpf) {
		this.tbAddressCpf = tbAddressCpf;
	}

	public String getTbAddressDistrict() {
		return tbAddressDistrict;
	}

	public void setTbAddressDistrict(String tbAddressDistrict) {
		this.tbAddressDistrict = tbAddressDistrict;
	}

	public BigDecimal getTbAddressNumber() {
		return tbAddressNumber;
	}

	public void setTbAddressNumber(BigDecimal tbAddressNumber) {
		this.tbAddressNumber = tbAddressNumber;
	}

	public String getTbAddressPublicPlace() {
		return tbAddressPublicPlace;
	}

	public void setTbAddressPublicPlace(String tbAddressPublicPlace) {
		this.tbAddressPublicPlace = tbAddressPublicPlace;
	}

	public String getTbAddressState() {
		return tbAddressState;
	}

	public void setTbAddressState(String tbAddressState) {
		this.tbAddressState = tbAddressState;
	}

	public String getTbAddressSType() {
		return tbAddressSType;
	}

	public void setTbAddressSType(String tbAddressSType) {
		this.tbAddressSType = tbAddressSType;
	}

	public String getTbAddressZip() {
		return tbAddressZip;
	}

	public void setTbAddressZip(String tbAddressZip) {
		this.tbAddressZip = tbAddressZip;
	}

}