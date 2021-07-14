package br.com.brasil.prev.dto;


public class SaveAddressDto {

	private long id;
	private String saveAddresPublicPlaceDto;
	private String saveAddresComplementDto;
	private long saveAddresNumberDto;
	private String saveAddresDistrictDto;
	private String saveAddresCityDto;
	private String saveAddresStateDto;
	private String saveAddresZipCodeDto;
	private String saveAddresTypeDto;
	private String saveAddresCpfDto;


	public SaveAddressDto() {
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getPublicPlace() {
		return getSaveAddresPublicPlaceDto();
	}


	public String getSaveAddresPublicPlace() {
		return getSaveAddresPublicPlaceDto();
	}


	public String getSaveAddresPublicPlaceDto() {
		return saveAddresPublicPlaceDto;
	}


	public void setPublicPlace(String publicPlace) {
		setSaveAddresPublicPlaceDto(publicPlace);
	}


	public void setSaveAddresPublicPlace(String publicPlace) {
		setSaveAddresPublicPlaceDto(publicPlace);
	}


	public void setSaveAddresPublicPlaceDto(String publicPlace) {
		this.saveAddresPublicPlaceDto = publicPlace;
	}


	public String getComplement() {
		return getSaveAddresComplementDto();
	}


	public String getSaveAddresComplementDto() {
		return saveAddresComplementDto;
	}


	public void setComplement(String complement) {
		setSaveAddresComplementDto(complement);
	}


	public void setSaveAddresComplementDto(String complement) {
		this.saveAddresComplementDto = complement;
	}


	public long getNumber() {
		return getSaveAddresNumberDto();
	}


	public long getSaveAddresNumberDto() {
		return saveAddresNumberDto;
	}


	public void setNumber(long number) {
		setSaveAddresNumberDto(number);
	}


	public void setSaveAddresNumberDto(long number) {
		this.saveAddresNumberDto = number;
	}


	public String getDistrict() {
		return getSaveAddresDistrictDto();
	}


	public String getSaveAddresDistrictDto() {
		return saveAddresDistrictDto;
	}


	public void setDistrict(String district) {
		setSaveAddresDistrictDto(district);
	}


	public void setSaveAddresDistrictDto(String district) {
		this.saveAddresDistrictDto = district;
	}


	public String getCity() {
		return getSaveAddresCityDto();
	}


	public String getSaveAddresCityDto() {
		return saveAddresCityDto;
	}


	public void setCity(String city) {
		setSaveAddresCityDto(city);
	}


	public void setSaveAddresCityDto(String city) {
		this.saveAddresCityDto = city;
	}


	public String getState() {
		return getSaveAddresStateDto();
	}


	public String getSaveAddresStateDto() {
		return saveAddresStateDto;
	}


	public void setState(String state) {
		setSaveAddresStateDto(state);
	}


	public void setSaveAddresStateDto(String state) {
		this.saveAddresStateDto = state;
	}


	public String getZipCode() {
		return getSaveAddresZipCodeDto();
	}


	public String getSaveAddresZipCodeDto() {
		return saveAddresZipCodeDto;
	}


	public void setZipCode(String zipCode) {
		setSaveAddresZipCodeDto(zipCode);
	}


	public void setSaveAddresZipCodeDto(String zipCode) {
		this.saveAddresZipCodeDto = zipCode;
	}


	public String getType() {
		return getSaveAddresTypeDto();
	}


	public String getSaveAddresTypeDto() {
		return saveAddresTypeDto;
	}


	public void setType(String type) {
		setSaveAddresTypeDto(type);
	}


	public void setSaveAddresTypeDto(String type) {
		this.saveAddresTypeDto = type;
	}


	public String getCpf() {
		return getSaveAddresCpfDto();
	}


	public String getSaveAddresCpfDto() {
		return saveAddresCpfDto;
	}


	public void setCpf(String cpf) {
		setSaveAddresCpfDto(cpf);
	}


	public void setSaveAddresCpfDto(String cpf) {
		this.saveAddresCpfDto = cpf;
	}


}