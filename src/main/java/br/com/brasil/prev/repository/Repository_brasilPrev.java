package br.com.brasil.prev.repository;

import java.util.List;

import br.com.brasil.prev.dto.Customer;
import br.com.brasil.prev.dto.SelectCustomer;
import br.com.brasil.prev.dto.UpdateAddress;

public interface Repository_brasilPrev {

	/**
	 * INCLUIR CLIENTE
	 * @param cliente
	 * @throws Exception
	 * @throws Throwable
	 */
	void addCustomer(SelectCustomer customer)  throws Exception, Throwable;
	
	/**
	 * INCLUIR ENDEREÇO
	 * @param saveAddress
	 * @throws Exception
	 * @throws Throwable
	 */
	void addAddress(SelectCustomer customer) throws Exception, Throwable;
	
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
	
	/**
	 * LISTA TODOS OS CLIENTES
	 * @return
	 * @throws Exception
	 * @throws Throwable
	 */
	List<SelectCustomer> getAllCustomer()  throws Exception, Throwable;
	
	/**
	 * CONSULTA CLIENTE POR CPF
	 * @param cpf
	 * @return
	 * @throws Exception
	 * @throws Throwable
	 */
	SelectCustomer getCustomerByCpf(String cpf)  throws Exception, Throwable;
	
	/**
	 * EXCLUSÃO DE CLIENTE POR CPF
	 * @param cpf
	 * @throws Exception
	 * @throws Throwable
	 */
	void deleteCustomer(String cpf) throws Exception, Throwable;

}