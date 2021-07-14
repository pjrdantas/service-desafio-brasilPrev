package br.com.brasil.prev.repository;

import java.util.List;

import br.com.brasil.prev.dto.CustomerDto;
import br.com.brasil.prev.dto.SelectCustomerDto;
import br.com.brasil.prev.dto.UpdateAddressDto;

public interface Repository_brasilPrev {

	/**
	 * INCLUIR CLIENTE
	 * @param cliente
	 * @throws Exception
	 * @throws Throwable
	 */
	void addCustomer(SelectCustomerDto selectCustomerDto)  throws Exception, Throwable;
	
	/**
	 * INCLUIR ENDEREÇO
	 * @param saveAddress
	 * @throws Exception
	 * @throws Throwable
	 */
	void addAddress(SelectCustomerDto selectCustomerDto) throws Exception, Throwable;
	
	/**
	 * ATUALIZA CLIENTE
	 * @param customerDto
	 * @throws Exception
	 * @throws Throwable
	 */
	void updateCustomer(CustomerDto customerDto)  throws Exception, Throwable;
	
	/**
	 * ATUALIZA ENDEREÇO
	 * @param receiveCustomer
	 * @throws Exception
	 * @throws Throwable
	 */
	void updateAddressDto(UpdateAddressDto updateAddressDto)  throws Exception, Throwable;
	
	/**
	 * LISTA TODOS OS CLIENTES
	 * @return
	 * @throws Exception
	 * @throws Throwable
	 */
	List<SelectCustomerDto> getAllCustomer()  throws Exception, Throwable;
	
	/**
	 * CONSULTA CLIENTE POR CPF
	 * @param customerCpfDto
	 * @return
	 * @throws Exception
	 * @throws Throwable
	 */
	SelectCustomerDto getCustomerByCpf(String customerCpfDto)  throws Exception, Throwable;
	
	/**
	 * EXCLUSÃO DE CLIENTE POR CPF
	 * @param customerCpfDto
	 * @throws Exception
	 * @throws Throwable
	 */
	void deleteCustomer(String customerCpfDto) throws Exception, Throwable;

}