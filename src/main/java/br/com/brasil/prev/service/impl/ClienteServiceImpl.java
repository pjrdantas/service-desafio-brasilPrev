package br.com.brasil.prev.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.brasil.prev.dto.Cliente;
import br.com.brasil.prev.repository.ClienteRepository;
import br.com.brasil.prev.service.ClienteService;




@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;
	
	@Override
	public void addCliente(Cliente cliente) throws Exception, Throwable {
		clienteRepository.addCliente(cliente);
		
	}

	@Override
	public void updateCliente(Cliente cliente) throws Exception, Throwable {
		clienteRepository.updateCliente(cliente);
		
	}

	@Override
	public List<Cliente> getAllClientes() throws Exception, Throwable {
		
		return clienteRepository.getAllClientes();
	}

	@Override
	public Cliente getClienteById(int id) throws Exception, Throwable {
		Cliente obj = clienteRepository.getClienteById(id);
		return obj;
	}

	@Override
	public void deleteCliente(int id) throws Exception, Throwable {
		clienteRepository.deleteCliente(id);
		
	}
	
	

	
}
