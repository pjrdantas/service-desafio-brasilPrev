package br.com.brasil.prev.dto;


public class UpdateAddressDto {

	private long id;
	private String updateAddressPublicPlaceDto;
	private String updateAddressComplementDto;
	private long updateAddressNumberDto;
	private String updateAddressDistrictDto;
	private String updateAddressCityDto;
	private String updateAddressStateDto;
	private String updateAddressZipCodeDto;
	private String updateAddressTypeDto;
	private String updateAddressCpfDto;


	public UpdateAddressDto() {
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getPublicPlace() {
		return getUpdateAddressPublicPlaceDto();
	}


	public String getUpdateAddressPublicPlaceDto() {
		return updateAddressPublicPlaceDto;
	}


	public void setPublicPlace(String publicPlace) {
		setUpdateAddressPublicPlaceDto(publicPlace);
	}


	public void setUpdateAddressPublicPlaceDto(String publicPlace) {
		this.updateAddressPublicPlaceDto = publicPlace;
	}


	public String getComplement() {
		return getUpdateAddressComplementDto();
	}


	public String getUpdateAddressComplementDto() {
		return updateAddressComplementDto;
	}


	public void setComplement(String complement) {
		setUpdateAddressComplementDto(complement);
	}


	public void setUpdateAddressComplementDto(String complement) {
		this.updateAddressComplementDto = complement;
	}


	public long getNumber() {
		return getUpdateAddressNumberDto();
	}


	public long getUpdateAddressNumberDto() {
		return updateAddressNumberDto;
	}


	public void setNumber(long number) {
		setUpdateAddressNumberDto(number);
	}


	public void setUpdateAddressNumberDto(long number) {
		this.updateAddressNumberDto = number;
	}


	public String getDistrict() {
		return getUpdateAddressDistrictDto();
	}


	public String getUpdateAddressDistrictDto() {
		return updateAddressDistrictDto;
	}


	public void setDistrict(String district) {
		setUpdateAddressDistrictDto(district);
	}


	public void setUpdateAddressDistrictDto(String district) {
		this.updateAddressDistrictDto = district;
	}


	public String getCity() {
		return getUpdateAddressCityDto();
	}


	public String getUpdateAddressCityDto() {
		return updateAddressCityDto;
	}


	public void setCity(String city) {
		setUpdateAddressCityDto(city);
	}


	public void setUpdateAddressCityDto(String city) {
		this.updateAddressCityDto = city;
	}


	public String getState() {
		return getUpdateAddressStateDto();
	}


	public String getUpdateAddressStateDto() {
		return updateAddressStateDto;
	}


	public void setState(String state) {
		setUpdateAddressStateDto(state);
	}


	public void setUpdateAddressStateDto(String state) {
		this.updateAddressStateDto = state;
	}


	public String getZipCode() {
		return getUpdateAddressZipCodeDto();
	}


	public String getUpdateAddressZipCodeDto() {
		return updateAddressZipCodeDto;
	}


	public void setZipCode(String zipCode) {
		setUpdateAddressZipCodeDto(zipCode);
	}


	public void setUpdateAddressZipCodeDto(String zipCode) {
		this.updateAddressZipCodeDto = zipCode;
	}


	public String getType() {
		return getUpdateAddressTypeDto();
	}


	public String getUpdateAddressTypeDto() {
		return updateAddressTypeDto;
	}


	public void setType(String type) {
		setUpdateAddressTypeDto(type);
	}


	public void setUpdateAddressTypeDto(String type) {
		this.updateAddressTypeDto = type;
	}


	public String getCpf() {
		return getUpdateAddressCpfDto();
	}


	public String getUpdateAddressCpfDto() {
		return updateAddressCpfDto;
	}


	public void setCpf(String cpf) {
		setUpdateAddressCpfDto(cpf);
	}


	public void setUpdateAddressCpfDto(String cpf) {
		this.updateAddressCpfDto = cpf;
	}


}