package br.com.brasil.prev.service;

import java.util.List;


import br.com.brasil.prev.dto.CustomerDto;
import br.com.brasil.prev.dto.SelectCustomerDto;

public interface Service_brasilPrev {
	
	/**
	 * METODO PARA INCLUIR UM REGISTRO
	 * @param cliente
	 * @throws Exception
	 * @throws Throwable
	 */
	void addACustomer(SelectCustomerDto selectCustomerDto)   throws Exception, Throwable;
	
	/**
	 * METODO PARA ATUALIZAÇÃO DO REGISTRO
	 * @param updateCustomer
	 * @throws Exception
	 * @throws Throwable
	 */
	void updateCustomer(CustomerDto customerDto)   throws Exception, Throwable;

	/**
	 * METODO PARA LISTAR TODOS OS REGISTROS
	 * @return
	 * @throws Exception
	 * @throws Throwable
	 */
	List<SelectCustomerDto> getAllCustomer()  throws Exception, Throwable;
	
	/**
	 * METODO PARA CONSULTAR REGISTRO POR ID
	 * @param id
	 * @return
	 * @throws Exception
	 * @throws Throwable
	 */
	SelectCustomerDto getCustomerByCpf(String customerCpfDto) throws Exception, Throwable;
	
	
	void deleteCustomer(String customerCpfDto) throws Exception, Throwable;
}
