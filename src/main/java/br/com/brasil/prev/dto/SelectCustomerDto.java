package br.com.brasil.prev.dto;

public class SelectCustomerDto {
	

private long id;
private String selectCustomerCpfDto;
private String selectCustomerNameDto;
private String selectCustomerPublicPlaceDto;
private String selectCustomerComplementDto;
private int    selectCustomerNumberDto;
private String selectCustomerDistrictDto;
private String selectCustomerCityDto;
private String selectCustomerStateDto;
private String selectCustomerZipDto;
private String selectCustomerTypeDto;


public SelectCustomerDto() {
}


public long getId() {
	return id;
}


public void setId(long id) {
	this.id = id;
}


public String getCpf() {
	return getSelectCustomerCpfDto();
}


public String getSelectCustomerCpfDto() {
	return selectCustomerCpfDto;
}


public void setCpf(String cpf) {
	setSelectCustomerCpfDto(cpf);
}


public void setSelectCustomerCpfDto(String cpf) {
	this.selectCustomerCpfDto = cpf;
}


public String getName() {
	return getSelectCustomerNameDto();
}


public String getSelectCustomerNameDto() {
	return selectCustomerNameDto;
}


public void setName(String name) {
	setSelectCustomerNameDto(name);
}


public void setSelectCustomerNameDto(String name) {
	this.selectCustomerNameDto = name;
}


public String getAddressPublicPlace() {
	return getSelectCustomerPublicPlaceDto();
}


public String getSelectCustomerPublicPlaceDto() {
	return selectCustomerPublicPlaceDto;
}


public void setAddressPublicPlace(String addressPublicPlace) {
	setSelectCustomerPublicPlaceDto(addressPublicPlace);
}


public void setSelectCustomerPublicPlaceDto(String addressPublicPlace) {
	this.selectCustomerPublicPlaceDto = addressPublicPlace;
}


public String getAddressComplement() {
	return getSelectCustomerComplementDto();
}


public String getSelectCustomerComplementDto() {
	return selectCustomerComplementDto;
}


public void setAddressComplement(String addressComplement) {
	setSelectCustomerComplementDto(addressComplement);
}


public void setSelectCustomerComplementDto(String addressComplement) {
	this.selectCustomerComplementDto = addressComplement;
}


public int getAddressNumber() {
	return getSelectCustomerNumberDto();
}


public int getSelectCustomerNumberDto() {
	return selectCustomerNumberDto;
}


public void setAddressNumber(int addressNumber) {
	setSelectCustomerNumberDto(addressNumber);
}


public void setSelectCustomerNumberDto(int addressNumber) {
	this.selectCustomerNumberDto = addressNumber;
}


public String getAddressDistrict() {
	return getSelectCustomerDistrictDto();
}


public String getSelectCustomerDistrictDto() {
	return selectCustomerDistrictDto;
}


public void setAddressDistrict(String addressDistrict) {
	setSelectCustomerDistrictDto(addressDistrict);
}


public void setSelectCustomerDistrictDto(String addressDistrict) {
	this.selectCustomerDistrictDto = addressDistrict;
}


public String getAddressCity() {
	return getSelectCustomerCityDto();
}


public String getSelectCustomerCityDto() {
	return selectCustomerCityDto;
}


public void setAddressCity(String addressCity) {
	setSelectCustomerCityDto(addressCity);
}


public void setSelectCustomerCityDto(String addressCity) {
	this.selectCustomerCityDto = addressCity;
}


public String getAddressState() {
	return getSelectCustomerStateDto();
}


public String getSelectCustomerStateDto() {
	return selectCustomerStateDto;
}


public void setAddressState(String addressState) {
	setSelectCustomerStateDto(addressState);
}


public void setSelectCustomerStateDto(String addressState) {
	this.selectCustomerStateDto = addressState;
}


public String getAddressZip() {
	return getSelectCustomerZipDto();
}


public String getSelectCustomerZipDto() {
	return selectCustomerZipDto;
}


public void setAddressZip(String addressZip) {
	setSelectCustomerZipDto(addressZip);
}


public void setSelectCustomerZipDto(String addressZip) {
	this.selectCustomerZipDto = addressZip;
}


public String getAddressType() {
	return getSelectCustomerTypeDto();
}


public String getSelectCustomerTypeDto() {
	return selectCustomerTypeDto;
}


public void setAddressType(String addressType) {
	setSelectCustomerTypeDto(addressType);
}


public void setSelectCustomerTypeDto(String addressType) {
	this.selectCustomerTypeDto = addressType;
}

}