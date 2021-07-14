package br.com.brasil.prev.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"id",
"customerCpf",
"customerName",
"addressDto"
})
public class CustomerDto {
	
@JsonProperty("id")
private long id;
	
@JsonProperty("customerCpf")
private String customerCpfDto;

@JsonProperty("customerName")
private String customerNameDto;

@JsonProperty("addressDto")
private List<AddressDto> addressDto = null;

/**
* No args constructor for use in serialization
*
*/
public CustomerDto() {
}

/**
*
* @param addressDto
* @param customerCpfDto
* @param customerNameDto
*/
public CustomerDto(long id, String cpf, String name, List<AddressDto> addressDto) {
super();
this.id = id;
this.customerCpfDto = cpf;
this.customerNameDto = name;
this.addressDto = addressDto;
}

@JsonProperty("id")
public long getId() {
return id;
}

@JsonProperty("id")
public void setId(Long id) {
this.id = id;
}

@JsonProperty("cpf")
public String getCpf() {
	return getCustomerCpfDto();
}

@JsonProperty("customerCpfDto")
public String getCustomerCpfDto() {
return customerCpfDto;
}

@JsonProperty("cpf")
public void setCpf(String cpf) {
	setCustomerCpfDto(cpf);
}

@JsonProperty("customerCpfDto")
public void setCustomerCpfDto(String cpf) {
this.customerCpfDto = cpf;
}

@JsonProperty("name")
public String getName() {
	return getCustomerNameDto();
}

@JsonProperty("customerNameDto")
public String getCustomerNameDto() {
return customerNameDto;
}

@JsonProperty("name")
public void setName(String name) {
	setCustomerNameDto(name);
}

@JsonProperty("customerNameDto")
public void setCustomerNameDto(String name) {
this.customerNameDto = name;
}

@JsonProperty("addressDto")
public List<AddressDto> getAddress() {
return addressDto;
}

@JsonProperty("AddressDto")
public void setAddress(List<AddressDto> addressDto) {
this.addressDto = addressDto;
}

}