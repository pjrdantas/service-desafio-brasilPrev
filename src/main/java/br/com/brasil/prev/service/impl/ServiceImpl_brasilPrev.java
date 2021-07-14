package br.com.brasil.prev.service.impl;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.brasil.prev.dto.AddressDto;
import br.com.brasil.prev.dto.CustomerDto;
import br.com.brasil.prev.dto.SelectCustomerDto;
import br.com.brasil.prev.dto.UpdateAddressDto;
import br.com.brasil.prev.repository.Repository_brasilPrev;
import br.com.brasil.prev.service.Service_brasilPrev;


@Service
public class ServiceImpl_brasilPrev implements Service_brasilPrev {
	
	private static final Logger log = LoggerFactory.getLogger(ServiceImpl_brasilPrev.class);

	@Autowired
	private Repository_brasilPrev repository_brasilPrev;
	
	private List<AddressDto> listReciverAddress;
	
	private UpdateAddressDto updateAddressDto = new UpdateAddressDto();


	/**
	 * INCLUIR CLIENTE
	 */
	@Override
	public void addACustomer(SelectCustomerDto selectCustomerDto) throws Exception, Throwable {
		
		repository_brasilPrev.addCustomer(selectCustomerDto);
		repository_brasilPrev.addAddress(selectCustomerDto);		
					
	}
	
	
	/**
	 * ATUALIZA CLIENTE
	 */
	@Override
	public void updateCustomer(CustomerDto customerDto) throws Exception, Throwable {
		log.info("ATUALIZANDO REGISTRO - CustomerDto");		
		
		/**
		 * ATUALIZA O CLIENTE
		 */

				
		listReciverAddress = customerDto.getAddress();
		
		for (AddressDto addressDto : listReciverAddress) {
			updateAddressDto.setUpdateAddressPublicPlaceDto(addressDto.getAddressPublicPlaceDto());
			updateAddressDto.setUpdateAddressComplementDto(addressDto.getAddressComplementDto());
			updateAddressDto.setUpdateAddressNumberDto(addressDto.getAddressNumberDto());
			updateAddressDto.setUpdateAddressDistrictDto(addressDto.getAddressDistrictDto());
			updateAddressDto.setUpdateAddressCityDto(addressDto.getAddressCityDto());
			updateAddressDto.setUpdateAddressZipCodeDto(addressDto.getAddressZipCodeDto());
			updateAddressDto.setUpdateAddressTypeDto(addressDto.getAddressZipCodeDto());
			updateAddressDto.setUpdateAddressCpfDto(addressDto.getAddressCpfDto());
			/**
			 * ATUALIZA O ENDEREÇO
			 */
			this.repository_brasilPrev.updateAddressDto(updateAddressDto);
		}			
	}


    /**
     * LISTA TODOS CLIENTES
     */
	@Override
	public List<SelectCustomerDto> getAllCustomer() throws Exception, Throwable {
		return repository_brasilPrev.getAllCustomer();
	}


	/**
	 * CONSULTA CLIENTE POR CPF
	 */
	@Override
	public SelectCustomerDto getCustomerByCpf(String customerCpfDto) throws Exception, Throwable {
		SelectCustomerDto obj = repository_brasilPrev.getCustomerByCpf(customerCpfDto);
		
		return obj;
	}


	/**
	 * EXCLUI CLIENTE POR CPF
	 */
	@Override
	public void deleteCustomer(String customerCpfDto) throws Exception, Throwable {
		repository_brasilPrev.deleteCustomer(customerCpfDto);
		
	}	
	
}
