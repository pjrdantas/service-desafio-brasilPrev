package br.com.brasil.prev.service.impl;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.brasil.prev.dto.Address;
import br.com.brasil.prev.dto.Customer;
import br.com.brasil.prev.dto.SelectCustomer;
import br.com.brasil.prev.dto.UpdateAddress;
import br.com.brasil.prev.repository.Repository_brasilPrev;
import br.com.brasil.prev.service.Service_brasilPrev;


@Service
public class ServiceImpl_brasilPrev implements Service_brasilPrev {
	
	private static final Logger log = LoggerFactory.getLogger(ServiceImpl_brasilPrev.class);

	@Autowired
	private Repository_brasilPrev repository_brasilPrev;
	
	private List<Address> listReciverAddress;
	
	private UpdateAddress updateAddress = new UpdateAddress();

	private SelectCustomer obj;

	/**
	 * INCLUIR CLIENTE
	 */
	@Override
	public void addACustomer(SelectCustomer customer) throws Exception, Throwable {
		
		repository_brasilPrev.addCustomer(customer);
		repository_brasilPrev.addAddress(customer);		
					
	}
	
	
	/**
	 * ATUALIZA CLIENTE
	 */
	@Override
	public void updateCustomer(Customer customer) throws Exception, Throwable {
		log.info("ATUALIZANDO REGISTRO - Customer");		
		
		/**
		 * ATUALIZA O CLIENTE
		 */

				
		listReciverAddress = customer.getAddress();
		
		for (Address address : listReciverAddress) {
			updateAddress.setPublicPlace(address.getPublicPlace());
			updateAddress.setComplement(address.getComplement());
			updateAddress.setNumber(address.getNumber());
			updateAddress.setDistrict(address.getDistrict());
			updateAddress.setCity(address.getCity());
			updateAddress.setZipCode(address.getZipCode());
			updateAddress.setType(address.getZipCode());
			updateAddress.setCpf(address.getCpf());
			/**
			 * ATUALIZA O ENDEREÇO
			 */
			this.repository_brasilPrev.updateAddress(updateAddress);
		}	
		
	}


    /**
     * LISTA TODOS CLIENTES
     */
	@Override
	public List<SelectCustomer> getAllCustomer() throws Exception, Throwable {
		return repository_brasilPrev.getAllCustomer();
	}


	/**
	 * CONSULTA CLIENTE POR CPF
	 */
	@Override
	public SelectCustomer getCustomerByCpf(String cpf) throws Exception, Throwable {
		SelectCustomer obj = repository_brasilPrev.getCustomerByCpf(cpf);
		
		return obj;
	}


	/**
	 * EXCLUI CLIENTE POR CPF
	 */
	@Override
	public void deleteCustomer(String cpf) throws Exception, Throwable {
		repository_brasilPrev.deleteCustomer(cpf);
		
	}


	public SelectCustomer getObj() {
		return obj;
	}


	public void setObj(SelectCustomer obj) {
		this.obj = obj;
	}





	
	
	
}
