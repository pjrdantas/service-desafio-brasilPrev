package br.com.brasil.prev.service;

import java.util.List;

import br.com.brasil.prev.dto.Cliente;





public interface ClienteService {
	
	/**
	 * METODO PARA INCLUIR CLIENTE
	 * @param cliente
	 * @throws Exception
	 * @throws Throwable
	 */
	void addCliente(Cliente cliente)   throws Exception, Throwable;
	
	/**
	 * METODO PARA ATUALIZAR CLIENTES
	 * @param cliente
	 * @throws Exception
	 * @throws Throwable
	 */
	void updateCliente(Cliente cliente)  throws Exception, Throwable;
	
	/**
	 * METODO PARA LISTAR TOS CLIENTES
	 * @return
	 * @throws Exception
	 * @throws Throwable
	 */
	List<Cliente> getAllClientes()  throws Exception, Throwable;
	
	/**
	 * METODO PARA CONSULTAR CLIENTE POR ID
	 * @param id
	 * @return
	 * @throws Exception
	 * @throws Throwable
	 */
	Cliente getClienteById(int id)  throws Exception, Throwable;

	/**
	 * METODO PARA EXCLUIR CLIENTE POR ID
	 * @param id
	 * @throws Exception
	 * @throws Throwable
	 */
	void deleteCliente(int id)  throws Exception, Throwable;
}
