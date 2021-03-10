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

import br.com.brasil.prev.dto.Cliente;
import br.com.brasil.prev.dto.Response;
import br.com.brasil.prev.service.ClienteService;




@Controller
@CrossOrigin(origins  = "http://localhost:4200")
@RestController
@RequestMapping("/service")
public class ClienteController {
	
	private static final Logger log = LoggerFactory.getLogger(ClienteController.class);
	
	@Autowired
	private ClienteService clienteService;
	
	/**
	 * INCLUIR CLIENTE
	 * @param clienteDto
	 * @return
	 * @throws Exception
	 * @throws Throwable
	 */
	@RequestMapping(value="/cliente",method = RequestMethod.POST, produces = "application/json")
	public @ResponseBody Response add(@RequestBody Cliente cliente)  throws Exception, Throwable {      

		log.info("ClienteController.salvar--------> INCLUINDO CLIENTE!");
				
		try {			 
			this.clienteService.addCliente(cliente);
			return new Response(1,"Cliente salvo com sucesso!"); 
		}catch(Exception e) {
			log.error("ClienteController.salvar----------------- ERRO AO INCLUIR CLIENTE: " + e.toString());
			return new Response(0,e.getMessage());			
		}
	}
	
	
	/**
	 * ATUALIZAR CLIENTE
	 * @param clienteDto
	 * @return
	 * @throws Exception
	 * @throws Throwable
	 */	
	@RequestMapping(value="/cliente", method = RequestMethod.PUT, produces = "application/json")
	public @ResponseBody Response update(@RequestBody Cliente cliente)  throws Exception, Throwable {

		log.info("ClienteController.atualizar--------> ATUALIZAR CLIENTE!");
				
		try {			 
			this.clienteService.updateCliente(cliente);	
			return new Response(1,"Cliente atualizado com sucesso!"); 
		}catch(Exception e) { 
			log.error("ClienteController.atualizar----------------- ERRO AO ATUALIZAR CLIENTE: " , e.toString());
			return new Response(0,e.getMessage());
		}
	}
	
	
	/**
	 * LISTAR TOS OS CLIENTES
	 * @return
	 * @throws Exception
	 * @throws Throwable
	 */
	@RequestMapping(value="/cliente", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody List<Cliente> get()  throws Exception, Throwable {
		
		log.info("ClienteController.consultar--------> LISTAR DE CLIENTES!");
					
		return this.clienteService.getAllClientes();	
	}


	/**
	 * CONSULTAR CLIENTE POR ID
	 * @param idCliente
	 * @return
	 * @throws Exception
	 * @throws Throwable
	 */
	@RequestMapping(value="/cliente/{idCliente}", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody Cliente getAll(@PathVariable("idCliente") String idCliente)  throws Exception, Throwable {
		
		log.info("ClienteController.buscar--------> CONSULTAR CLIENTE!");
		try {
			int id = Integer.parseInt(idCliente);			
			return this.clienteService.getClienteById(id);
		} catch (Exception e) {
			log.error("ClienteController.buscar----------------- ERRO AO BUSCAR CLIENTE POR ID: " + e.toString());
		}
		return null;
	}
	

	/**
	 * EXCLUIR CLIENTE POR ID
	 * @param idCliente
	 * @return
	 * @throws Exception
	 * @throws Throwable
	 */
	@RequestMapping(value="/cliente/{idCliente}", method = RequestMethod.DELETE, produces = "application/json")
	public @ResponseBody Response delete(@PathVariable("idCliente") String idCliente)  throws Exception, Throwable {
		
		log.info("ClienteController.excluir--------> EXCLUIR CLIENTE!");
		
		int id = Integer.parseInt(idCliente);
		 
		try { 
			clienteService.deleteCliente(id);
			return new Response(1, "Cliente excluido com sucesso!"); 
		}catch(Exception e) {
			log.error("ClienteController.excluir----------------- ERRO AO EXCLUIR CLIENTE POR ID: " + e.toString());
			return new Response(0, e.getMessage());
		}
	}	

}
