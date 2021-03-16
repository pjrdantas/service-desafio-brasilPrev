package br.com.brasil.prev.dto;

public class SelectCustomer {
	

private long id;
private String cpf;
private String name;
private String addressPublicPlace;
private String addressComplement;
private int    addressNumber;
private String addressDistrict;
private String addressCity;
private String addressState;
private String addressZip;
private String addressType;


public SelectCustomer() {
}


public long getId() {
	return id;
}


public void setId(long id) {
	this.id = id;
}


public String getCpf() {
	return cpf;
}


public void setCpf(String cpf) {
	this.cpf = cpf;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public String getAddressPublicPlace() {
	return addressPublicPlace;
}


public void setAddressPublicPlace(String addressPublicPlace) {
	this.addressPublicPlace = addressPublicPlace;
}


public String getAddressComplement() {
	return addressComplement;
}


public void setAddressComplement(String addressComplement) {
	this.addressComplement = addressComplement;
}


public int getAddressNumber() {
	return addressNumber;
}


public void setAddressNumber(int addressNumber) {
	this.addressNumber = addressNumber;
}


public String getAddressDistrict() {
	return addressDistrict;
}


public void setAddressDistrict(String addressDistrict) {
	this.addressDistrict = addressDistrict;
}


public String getAddressCity() {
	return addressCity;
}


public void setAddressCity(String addressCity) {
	this.addressCity = addressCity;
}


public String getAddressState() {
	return addressState;
}


public void setAddressState(String addressState) {
	this.addressState = addressState;
}


public String getAddressZip() {
	return addressZip;
}


public void setAddressZip(String addressZip) {
	this.addressZip = addressZip;
}


public String getAddressType() {
	return addressType;
}


public void setAddressType(String addressType) {
	this.addressType = addressType;
}

}