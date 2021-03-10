package br.com.brasil.prev.repository;

import java.util.List;

import br.com.brasil.prev.dto.Cliente;





public interface ClienteRepository {

	/**
	 * INCLUIR CLIENTE
	 * @param cliente
	 * @throws Exception
	 * @throws Throwable
	 */
	void addCliente(Cliente cliente)  throws Exception, Throwable;
	
	/**
	 * EDITAR CLIENTE
	 * @param cliente
	 * @throws Exception
	 * @throws Throwable
	 */
	void updateCliente(Cliente cliente)  throws Exception, Throwable;
	
	/**
	 * LISTAR TODOS CLIENTES
	 * @return
	 * @throws Exception
	 * @throws Throwable
	 */
	List<Cliente> getAllClientes()  throws Exception, Throwable;
	
	/**
	 * CONSULTAR CLIENTE POR ID
	 * @param id
	 * @return
	 * @throws Exception
	 * @throws Throwable
	 */
	Cliente getClienteById(int id)  throws Exception, Throwable;
	
	/**
	 * APAGAR CLIENTE POR ID
	 * @param id
	 * @throws Exception
	 * @throws Throwable
	 */
	void deleteCliente(int id)  throws Exception, Throwable;
}
