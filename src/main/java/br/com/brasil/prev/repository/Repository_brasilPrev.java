package br.com.brasil.prev.repository;

import java.util.List;


import br.com.brasil.prev.dto.Customer;
import br.com.brasil.prev.dto.SaveAddress;
import br.com.brasil.prev.dto.SelectCustomer;
import br.com.brasil.prev.dto.UpdateAddress;

public interface Repository_brasilPrev {

	/**
	 * INCLUIR CLIENTE
	 * @param cliente
	 * @throws Exception
	 * @throws Throwable
	 */
	void addCustomer(Customer customer)  throws Exception, Throwable;
	
	/**
	 * INCLUIR ENDEREÇO
	 * @param saveAddress
	 * @throws Exception
	 * @throws Throwable
	 */
	void addAddress(SaveAddress saveAddress) throws Exception, Throwable;
	
	/**
	 * ATUALIZA CLIENTE
	 * @param customer
	 * @throws Exception
	 * @throws Throwable
	 */
	void updateCustomer(Customer customer)  throws Exception, Throwable;
	
	/**
	 * ATUALIZA ENDEREÇO
	 * @param receiveCustomer
	 * @throws Exception
	 * @throws Throwable
	 */
	void updateAddress(UpdateAddress updateAddress)  throws Exception, Throwable;
	
	List<SelectCustomer> getAllCustomer()  throws Exception, Throwable;
	
	SelectCustomer getCustomerById(int id)  throws Exception, Throwable;
	
	void deleteCustomer(String cpf) throws Exception, Throwable;

}