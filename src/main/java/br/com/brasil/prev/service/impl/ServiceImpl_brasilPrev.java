package br.com.brasil.prev.service.impl;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.brasil.prev.dto.Customer;
import br.com.brasil.prev.dto.Address;
import br.com.brasil.prev.dto.SaveAddress;
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
	private SaveAddress saveAddress = new SaveAddress();
	private UpdateAddress updateAddress = new UpdateAddress();

	
	@Override
	public void addACustomer(Customer customer) throws Exception, Throwable {
		log.info("RECEBENDO REGISTRO - Customer");		
		/**
		 * SALVA O REGISTRO DO CLIENTE
		 */
		repository_brasilPrev.addCustomer(customer);
				
		listReciverAddress = customer.getAddress();
		
		for (Address address : listReciverAddress) {
			saveAddress.setPublicPlace(address.getPublicPlace());
			saveAddress.setComplement(address.getComplement());
			saveAddress.setNumber(address.getNumber());
			saveAddress.setDistrict(address.getDistrict());
			saveAddress.setCity(address.getCity());
			saveAddress.setZipCode(address.getZipCode());
			saveAddress.setType(address.getZipCode());
			saveAddress.setCpf(customer.getCpf());
			/**
			 * SALVA O ENDEREÇO DO CLIENTE
			 */
			this.repository_brasilPrev.addAddress(saveAddress);
		}		
	}
	
	

	@Override
	public void updateCustomer(Customer customer) throws Exception, Throwable {
		log.info("ATUALIZANDO REGISTRO - Customer");		
		
		/**
		 * ATUALIZA O CLIENTE
		 */
		repository_brasilPrev.updateCustomer(customer);
				
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



	@Override
	public List<SelectCustomer> getAllCustomer() throws Exception, Throwable {
		return repository_brasilPrev.getAllCustomer();
	}



	@Override
	public SelectCustomer getCustomerById(int id) throws Exception, Throwable {
		SelectCustomer obj = repository_brasilPrev.getCustomerById(id);
		return obj;
	}



	@Override
	public void deleteCustomer(String cpf) throws Exception, Throwable {
		repository_brasilPrev.deleteCustomer(cpf);
		
	}





	
	
	
}
