package br.com.brasil.prev.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"id",
"cpf",
"name",
"address"
})
public class Customer {
	
@JsonProperty("id")
private long id;
	
@JsonProperty("cpf")
private String cpf;

@JsonProperty("name")
private String name;

@JsonProperty("address")
private List<Address> address = null;

/**
* No args constructor for use in serialization
*
*/
public Customer() {
}

/**
*
* @param address
* @param cpf
* @param name
*/
public Customer(long id, String cpf, String name, List<Address> address) {
super();
this.id = id;
this.cpf = cpf;
this.name = name;
this.address = address;
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
return cpf;
}

@JsonProperty("cpf")
public void setCpf(String cpf) {
this.cpf = cpf;
}

@JsonProperty("name")
public String getName() {
return name;
}

@JsonProperty("name")
public void setName(String name) {
this.name = name;
}

@JsonProperty("address")
public List<Address> getAddress() {
return address;
}

@JsonProperty("Address")
public void setAddress(List<Address> address) {
this.address = address;
}

}