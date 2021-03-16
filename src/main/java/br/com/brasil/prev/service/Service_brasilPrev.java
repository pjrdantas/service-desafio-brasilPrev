package br.com.brasil.prev.service;

import java.util.List;


import br.com.brasil.prev.dto.Customer;
import br.com.brasil.prev.dto.SelectCustomer;

public interface Service_brasilPrev {
	
	/**
	 * METODO PARA INCLUIR UM REGISTRO
	 * @param cliente
	 * @throws Exception
	 * @throws Throwable
	 */
	void addACustomer(Customer customer)   throws Exception, Throwable;
	
	/**
	 * METODO PARA ATUALIZAÇÃO DO REGISTRO
	 * @param updateCustomer
	 * @throws Exception
	 * @throws Throwable
	 */
	void updateCustomer(Customer customer)   throws Exception, Throwable;

	/**
	 * METODO PARA LISTAR TODOS OS REGISTROS
	 * @return
	 * @throws Exception
	 * @throws Throwable
	 */
	List<SelectCustomer> getAllCustomer()  throws Exception, Throwable;
	
	/**
	 * METODO PARA CONSULTAR REGISTRO POR ID
	 * @param id
	 * @return
	 * @throws Exception
	 * @throws Throwable
	 */
	SelectCustomer getCustomerById(int id) throws Exception, Throwable;
	
	
	void deleteCustomer(String cpf) throws Exception, Throwable;
}
