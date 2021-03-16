package br.com.brasil.prev.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "public_place", "complement", "number", "district", "city", "zip_code", "type", "cpf" })

public class Address {

	@JsonProperty("public_place")
	private String publicPlace;

	@JsonProperty("complement")
	private String complement;

	@JsonProperty("number")
	private long number;

	@JsonProperty("district")
	private String district;

	@JsonProperty("city")
	private String city;

	@JsonProperty("state")
	private String state;

	@JsonProperty("zip_code")
	private String zipCode;

	@JsonProperty("type")
	private String type;

	@JsonProperty("cpf")
	private String cpf;
	
	/**
	 * No args constructor for use in serialization
	 *
	 */
	public Address() {
	}

	/**
	 * 
	 * @param publicPlace
	 * @param complement
	 * @param number
	 * @param district
	 * @param city
	 * @param state
	 * @param zipCode
	 * @param type
	 * @param cpf
	 */
	public Address(String publicPlace, String complement, long number, String district, String city, String state, 
			String zipCode,	String type, String cpf) {
		super();
		this.publicPlace = publicPlace;
		this.complement = complement;
		this.number = number;
		this.district = district;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.type = type;
		
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