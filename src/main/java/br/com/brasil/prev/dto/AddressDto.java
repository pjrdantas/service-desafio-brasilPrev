package br.com.brasil.prev.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "public_place", "complement", "number", "district", "city", "zip_code", "type", "cpf" })

public class AddressDto {

	@JsonProperty("public_place")
	private String addressPublicPlaceDto;

	@JsonProperty("complement")
	private String addressComplementDto;

	@JsonProperty("number")
	private long addressNumberDto;

	@JsonProperty("district")
	private String addressDistrictDto;

	@JsonProperty("city")
	private String addressCityDto;

	@JsonProperty("state")
	private String addressStateDto;

	@JsonProperty("zip_code")
	private String addressZipCodeDto;

	@JsonProperty("addressTypeDto")
	private String addressTypeDto;

	@JsonProperty("addressCpfDto")
	private String addressCpfDto;
	
	/**
	 * No args constructor for use in serialization
	 *
	 */
	public AddressDto() {
	}

	/**
	 * 
	 * @param addressPublicPlaceDto
	 * @param addressComplementDto
	 * @param addressNumberDto
	 * @param addressDistrictDto
	 * @param addressCityDto
	 * @param addressStateDto
	 * @param addressZipCodeDto
	 * @param addressTypeDto
	 * @param addressCpfDto
	 */
	public AddressDto(String publicPlace, String complement, long number, String district, String city, String state, 
			String zipCode,	String type, String cpf) {
		super();
		this.addressPublicPlaceDto = publicPlace;
		this.addressComplementDto = complement;
		this.addressNumberDto = number;
		this.addressDistrictDto = district;
		this.addressCityDto = city;
		this.addressStateDto = state;
		this.addressZipCodeDto = zipCode;
		this.addressTypeDto = type;
		
	}

	public String getPublicPlace() {
		return getAddressPublicPlaceDto();
	}

	public String getPublicPlaceDto() {
		return getAddressPublicPlaceDto();
	}

	public String getAddresspublicPlaceDto() {
		return getAddressPublicPlaceDto();
	}

	public String getAddressPublicPlaceDto() {
		return addressPublicPlaceDto;
	}

	public void setPublicPlace(String publicPlace) {
		setAddressPublicPlaceDto(publicPlace);
	}

	public void setPublicPlaceDto(String publicPlace) {
		setAddressPublicPlaceDto(publicPlace);
	}

	public void setAddresspublicPlaceDto(String publicPlace) {
		setAddressPublicPlaceDto(publicPlace);
	}

	public void setAddressPublicPlaceDto(String publicPlace) {
		this.addressPublicPlaceDto = publicPlace;
	}

	public String getComplement() {
		return getAddressComplementDto();
	}

	public String getComplementDto() {
		return getAddressComplementDto();
	}

	public String getAddressComplementDto() {
		return addressComplementDto;
	}

	public void setComplement(String complement) {
		setAddressComplementDto(complement);
	}

	public void setComplementDto(String complement) {
		setAddressComplementDto(complement);
	}

	public void setAddressComplementDto(String complement) {
		this.addressComplementDto = complement;
	}

	public long getNumber() {
		return getAddressNumberDto();
	}

	public long getNumberDto() {
		return getAddressNumberDto();
	}

	public long getAddressNumberDto() {
		return addressNumberDto;
	}

	public void setNumber(long number) {
		setAddressNumberDto(number);
	}

	public void setNumberDto(long number) {
		setAddressNumberDto(number);
	}

	public void setAddressNumberDto(long number) {
		this.addressNumberDto = number;
	}

	public String getDistrictDto() {
		return getAddressDistrictDto();
	}

	public String getAddressDistrictDto() {
		return addressDistrictDto;
	}

	public void setDistrictDto(String district) {
		setAddressDistrictDto(district);
	}

	public void setAddressDistrictDto(String district) {
		this.addressDistrictDto = district;
	}

	public String getCity() {
		return getAddressCityDto();
	}

	public String getCityDto() {
		return getAddressCityDto();
	}

	public String getAddressCityDto() {
		return addressCityDto;
	}

	public void setCity(String city) {
		setAddressCityDto(city);
	}

	public void setCityDto(String city) {
		setAddressCityDto(city);
	}

	public void setAddressCityDto(String city) {
		this.addressCityDto = city;
	}

	public String getState() {
		return getAddressStateDto();
	}

	public String getStateDto() {
		return getAddressStateDto();
	}

	public String getAddressStateDto() {
		return addressStateDto;
	}

	public void setState(String state) {
		setAddressStateDto(state);
	}

	public void setStateDto(String state) {
		setAddressStateDto(state);
	}

	public void setAddressStateDto(String state) {
		this.addressStateDto = state;
	}

	public String getZipCode() {
		return getAddressZipCodeDto();
	}

	public String getZipCodeDto() {
		return getAddressZipCodeDto();
	}

	public String getAddressZipCodeDto() {
		return addressZipCodeDto;
	}

	public void setZipCode(String zipCode) {
		setAddressZipCodeDto(zipCode);
	}

	public void setZipCodeDto(String zipCode) {
		setAddressZipCodeDto(zipCode);
	}

	public void setAddressZipCodeDto(String zipCode) {
		this.addressZipCodeDto = zipCode;
	}

	public String getType() {
		return getAddressTypeDto();
	}

	public String getTypeDto() {
		return getAddressTypeDto();
	}

	public String getAddressTypeDto() {
		return addressTypeDto;
	}

	public void setType(String type) {
		setAddressTypeDto(type);
	}

	public void setTypeDto(String type) {
		setAddressTypeDto(type);
	}

	public void setAddressTypeDto(String type) {
		this.addressTypeDto = type;
	}

	public String getCpf() {
		return getAddressCpfDto();
	}

	public String getCpfDto() {
		return getAddressCpfDto();
	}

	public String getAddressCpfDto() {
		return addressCpfDto;
	}

	public void setCpf(String cpf) {
		setAddressCpfDto(cpf);
	}

	public void setCpfDto(String cpf) {
		setAddressCpfDto(cpf);
	}

	public void setAddressCpfDto(String cpf) {
		this.addressCpfDto = cpf;
	}

	
	
}