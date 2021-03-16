package br.com.brasil.prev.dto;


public class SaveAddress {

	private long id;
	private String publicPlace;
	private String complement;
	private long number;
	private String district;
	private String city;
	private String state;
	private String zipCode;
	private String type;
	private String cpf;


	public SaveAddress() {
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getPublicPlace() {
		return publicPlace;
	}


	public void setPublicPlace(String publicPlace) {
		this.publicPlace = publicPlace;
	}


	public String getComplement() {
		return complement;
	}


	public void setComplement(String complement) {
		this.complement = complement;
	}


	public long getNumber() {
		return number;
	}


	public void setNumber(long number) {
		this.number = number;
	}


	public String getDistrict() {
		return district;
	}


	public void setDistrict(String district) {
		this.district = district;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getZipCode() {
		return zipCode;
	}


	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


}