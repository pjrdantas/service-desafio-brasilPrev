package br.com.brasil.prev.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.brasil.prev.dto.Customer;
import br.com.brasil.prev.dto.Response;
import br.com.brasil.prev.dto.SelectCustomer;
import br.com.brasil.prev.service.Service_brasilPrev;

@Controller
@CrossOrigin(origins  = "http://localhost:4200")
@RestController
@RequestMapping("/service_brasilPrev")
public class ControllerBrasilPrev {
	
	private static final Logger log = LoggerFactory.getLogger(ControllerBrasilPrev.class);
	
	@Autowired
	private Service_brasilPrev service_brasilPrev;
	
	/**
	 * INCLUIR REGISTRO
	 * @param customer
	 * @return
	 * @throws Exception
	 * @throws Throwable
	 */
	@RequestMapping(value="/customer",method = RequestMethod.POST, produces = "application/json")
	public @ResponseBody Response add(@RequestBody SelectCustomer customer)  throws Exception, Throwable {      

		log.info("Controller_brasilPrev.salvar--------> INCLUINDO REGISTRO!");
				
		try {			 
			this.service_brasilPrev.addACustomer(customer);
			return new Response(1,"Registro salvo com sucesso!"); 
		}catch(Exception e) {
			log.error("Controller_brasilPrev.salvar----------------- ERRO AO INCLUIR REGISTRO: " + e.toString());
			return new Response(0,e.getMessage());			
		}
	}
	
	/**
	 * ATUALIZA REGISTRO
	 * @param customer
	 * @return
	 * @throws Exception
	 * @throws Throwable
	 */
	@RequestMapping(value="/customer", method = RequestMethod.PUT, produces = "application/json")
	public @ResponseBody Response update(@RequestBody Customer customer)  throws Exception, Throwable {

		log.info("Controller_brasilPrev.update--------> ATUALIZAR USUARIO!");
		
		
		try {			 
			this.service_brasilPrev.updateCustomer(customer);	
			return new Response(1,"Cliente atualizado com sucesso!"); 
		}catch(Exception e) { 
			log.error("Controller_brasilPrev.update----------------- ERRO AO ATUALIZAR CLIENTE: " , e.toString());
			return new Response(0,e.getMessage());
		}
	}

	/**
	 * LISTA TODOS OS REGISTROS
	 * @return
	 * @throws Exception
	 * @throws Throwable
	 */
	@RequestMapping(value="/customer", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody List<SelectCustomer> select()  throws Exception, Throwable {
		
		log.info("Controller_brasilPrev.select--------> LISTAR DE USUARIOS!");
		try {			
			return this.service_brasilPrev.getAllCustomer();
		} catch (Exception e) {
			log.error("Controller_brasilPrev.select----------------- ERRO AO LISTAR USUARIO: " + e.toString());
		}
		return null;
	}

	/**
	 * CONSULTAR O CLIENTE POR CPF
	 * @param cpf
	 * @return
	 * @throws Exception
	 * @throws Throwable
	 */
	@RequestMapping(value="/customer/{cpf}", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody SelectCustomer selectById(@PathVariable("cpf") String cpf)  throws Exception, Throwable {
		
		log.info("Controller_brasilPrev.selectById--------> CONSULTAR CLIENTE!");
		try {
			
			return this.service_brasilPrev.getCustomerByCpf(cpf);
		} catch (Exception e) {
			log.error("Controller_brasilPrev.selectById----------------- ERRO AO BUSCAR CLIENTE POR ID: " + e.toString());
		}
		return null;
	}
	
	/**
	 * EXCLUIR CLIENTE POR CPF
	 * @param idUsuario
	 * @return
	 * @throws Exception
	 * @throws Throwable
	 */
	@RequestMapping(value="/customer/{cpf}", method = RequestMethod.DELETE, produces = "application/json")
	public @ResponseBody Response delete(@PathVariable("cpf") String cpf)  throws Exception, Throwable {
		
		log.info("UsuarioController.excluir--------> EXCLUIR USUARIO!");
		
		
		 
		try { 
			service_brasilPrev.deleteCustomer(cpf);
			return new Response(1, "Usuario excluido com sucesso!"); 
		}catch(Exception e) {
			log.error("UsuarioController.excluir----------------- ERRO AO EXCLUIR CLIENTE POR ID: " + e.toString());
			return new Response(0, e.getMessage());
		}
	}		

}
