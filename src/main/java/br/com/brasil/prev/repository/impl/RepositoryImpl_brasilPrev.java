package br.com.brasil.prev.repository.impl;



import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import br.com.brasil.prev.dto.Customer;
import br.com.brasil.prev.dto.SaveAddress;
import br.com.brasil.prev.dto.SelectCustomer;
import br.com.brasil.prev.dto.UpdateAddress;
import br.com.brasil.prev.repository.Repository_brasilPrev;


@Transactional
@Repository
public class RepositoryImpl_brasilPrev implements Repository_brasilPrev {
	
	private static final Logger log = LoggerFactory.getLogger(RepositoryImpl_brasilPrev.class);
	
	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;

	@Override
	public void addCustomer(Customer customer) throws Exception, Throwable {
		StringBuilder sql = new StringBuilder();
		
		sql.append("  INSERT INTO ");
		sql.append("  tb_customer (");
		sql.append("  id");
		sql.append(" ,tb_customer_cpf");
		sql.append(" ,tb_customer_name) ");
		sql.append("  values (:id, :tbCustomerCpf, :tbCustomerName)");
		
		SqlParameterSource params = new MapSqlParameterSource()
				.addValue("id", customer.getId())
				.addValue("tbCustomerCpf", customer.getCpf())
				.addValue("tbCustomerName", customer.getName());
				
		try {
			jdbcTemplate.update(sql.toString(), params);
			log.info("RepositoryImpl_brasilPrev.addCliente--------> CLIENTE INCLUIDO COM SUCESSO!");
		} catch (Exception e) {
		    log.error("RepositoryImpl_brasilPrev.addCliente--------> ERRO NA INCLUSÃO DO CLIENTE: " + e.toString());
		}
	}

	@Override
	public void addAddress(SaveAddress saveAddress) throws Exception, Throwable {
		StringBuilder sql = new StringBuilder();
		
		sql.append("  INSERT INTO ");
		sql.append("  tb_address (");
		sql.append("  id");
		sql.append(" ,tb_address_city");
		sql.append(" ,tb_address_complemen");
		sql.append(" ,tb_address_district");
		sql.append(" ,tb_address_number");
		sql.append(" ,tb_address_public_place");
		sql.append(" ,tb_endereco_state");
		sql.append(" ,tb_endereco_type");
		sql.append(" ,tb_endereco_zip) ");
		sql.append("  values (:id, :tbAddressCity, :tbAddressComplement, :tbAddressCpf, "
				+ ":tbAddressDistrict, :tbAddressNumber, :tbAddressPublicPlace, :tbEnderecoState, "
				+ ":tbEnderecoType, :tbEnderecoZip )");
		
		SqlParameterSource params = new MapSqlParameterSource()
				.addValue("id", saveAddress.getId())
				.addValue("tbAddressCity", saveAddress.getCity())
				.addValue("tbAddressComplement", saveAddress.getComplement())
				.addValue("tbAddressCpf", saveAddress.getCpf())
				.addValue("tbAddressDistrict", saveAddress.getDistrict())
				.addValue("tbAddressNumber", saveAddress.getNumber())
				.addValue("tbAddressPublicPlace", saveAddress.getPublicPlace())
				.addValue("tbEnderecoState", saveAddress.getCity())
				.addValue("tbEnderecoType", saveAddress.getState())
				.addValue("tbEnderecoZip", saveAddress.getZipCode());
		try {
			jdbcTemplate.update(sql.toString(), params);
			log.info("RepositoryImpl_brasilPrev.saveAddress--------> ENDEREÇO INCLUIDO COM SUCESSO!");
		} catch (Exception e) {
		    log.error("RepositoryImpl_brasilPrev.saveAddress--------> ERRO NA INCLUSÃO DO ENDEREÇO: " + e.toString());
		}
	}

	@Override
	public void updateCustomer(Customer customer) throws Exception, Throwable {

		StringBuilder sql = new StringBuilder();
		
		sql.append(" UPDATE tb_customer ");
		sql.append(" SET  ");
		sql.append(" tb_customer_cpf = :cpf, ");
		sql.append(" tb_customer_name = :name, ");
		sql.append(" WHERE id = :id");
		
		SqlParameterSource params = new MapSqlParameterSource()
				.addValue("id", customer.getId())
				.addValue("cpf", customer.getCpf())
				.addValue("name", customer.getName());
				
		try {
			jdbcTemplate.update(sql.toString(), params);
			log.info("RepositoryImpl_brasilPrev.updateCustomer--------> CLIENTE ATUALIZADO COM SUCESSO!");
		} catch (Exception e) {
			log.error("RepositoryImpl_brasilPrev.updateCustomer----------------- ERRO NA ATUALIZAÇÃO DO CLIENTE: " + e.toString());
		}
	}

	@Override
	public void updateAddress(UpdateAddress updateAddress) throws Exception, Throwable {

		StringBuilder sql = new StringBuilder();
		
		sql.append(" UPDATE tb_address ");
		sql.append(" SET  ");
		sql.append(" tb_address_city = :cpf, ");
		sql.append(" tb_address_complement = :name, ");
		
		sql.append(" WHERE id = :id");
		
		SqlParameterSource params = new MapSqlParameterSource()
		.addValue("id", updateAddress.getId())
		.addValue("tbAddressCity", updateAddress.getCity())
		.addValue("tbAddressComplement", updateAddress.getComplement())
		.addValue("tbAddressCpf", updateAddress.getCpf())
		.addValue("tbAddressDistrict", updateAddress.getDistrict())
		.addValue("tbAddressNumber", updateAddress.getNumber())
		.addValue("tbAddressPublicPlace", updateAddress.getPublicPlace())
		.addValue("tbaddressState", updateAddress.getState())
		.addValue("addressType", updateAddress.getType())
		.addValue("tbaddressZip", updateAddress.getZipCode());
		try {
			jdbcTemplate.update(sql.toString(), params);
			log.info("RepositoryImpl_brasilPrev.updateAddress--------> ENDEREÇO ATUALIZADO COM SUCESSO!");
		} catch (Exception e) {
			log.error("RepositoryImpl_brasilPrev.updateAddress----------------- ERRO NA ATUALIZAÇÃO DO ENDEREÇO: " + e.toString());
		}
		
	}
	
	/**
	 * LISTAR TODOS CLIENTES
	 */
	@Override
	public List<SelectCustomer> getAllCustomer() throws Exception, Throwable {

		try {
			StringBuilder sql = new StringBuilder(sqlSelectPrincipal).append(" ORDER BY t2.id; ");
			log.info("RepositoryImpl_brasilPrev.getAllCustomer--------> LISTA DE USUARIOS EMITIDA COM SUCESSO!");
			return devolveListaObjetos(sql, null);
		} catch (Exception e) {
			log.error("RepositoryImpl_brasilPrev.getAllCustomer----------------- ERRO NA EMISSÃO DA LISTA DE CLIENTES: " + e.toString());
		}
		return null;
	}

	/**
	 * 
	 * @param id
	 * @return
	 * @throws Exception
	 * @throws Throwable
	 */
	@Override
	public SelectCustomer getCustomerById(int id) throws Exception, Throwable {
		
		try {
			StringBuilder sql = new StringBuilder(sqlSelectPrincipal);
			sql.append(" WHERE id = :id ");
			SqlParameterSource params = new MapSqlParameterSource().addValue("id", id);
			log.info("RepositoryImpl_brasilPrev.getCustomerById--------> CLIENTE LOCALIZADO COM SUCESSO!!!");
			return devolveObjeto(sql, params);
		} catch (Exception e) {
			log.error("RepositoryImpl_brasilPrev.getCustomerById----------------- ERRO AO TENTAR LOCALIZAR O CLIENTE: " + e.toString());
		}
		return null;
	}

	
	@Override
	public void deleteCustomer(String cpf) throws Exception, Throwable {

		StringBuilder sql1 = new StringBuilder();
		sql1.append(" DELETE FROM ");
		sql1.append(" tb_customer ");
		sql1.append(" WHERE cpf = :cpf");
		SqlParameterSource params = new MapSqlParameterSource().addValue("cpf", cpf);
		try {
			jdbcTemplate.update(sql1.toString(), params);
			log.info("RepositoryImpl_brasilPrev.deleteCustomer--------> USUARIO EXCLUIDO COM SUCESSO!!!");
		} catch (Exception e) {
			log.error("RepositoryImpl_brasilPrev.deleteCustomer----------------- ERRO NA EXCLUSÃO DO USUARIO! " + e.toString());
		}	
		
		
		StringBuilder sql2 = new StringBuilder();		
		sql2.append(" DELETE FROM ");
		sql2.append(" tb_address ");
		sql2.append(" WHERE cpf = :cpf");
		SqlParameterSource param = new MapSqlParameterSource().addValue("cpf", cpf);
		try {
			jdbcTemplate.update(sql2.toString(), param);
			log.info("RepositoryImpl_brasilPrev.deleteCustomer--------> ENDEREÇO(S) EXCLUIDO COM SUCESSO!!!");
		} catch (Exception e) {
			log.error("RepositoryImpl_brasilPrev.deleteCustomer----------------- ERRO NA EXCLUSÃO DO(S) ENDEREÇO(S)! " + e.toString());
		}		
		
	}
	
	
	
	
//--------------------------------------------------------------------------------------------------------------------	
	

	/**
	 * MONTA SELECT PARA CONSULTAR CLIENTE
	 */
	final static StringBuilder sqlSelectPrincipal = new StringBuilder()
			.append("  SELECT ")
			.append("  t1.id")
			.append(" ,t1.tb_customer_cpf")
			.append(" ,t1.tb_customer_name")
			.append(" ,t2.id")
			.append(" ,t2.tb_address_city")
			.append(" ,t2.tb_address_complement")
			.append(" ,t2.tb_address_district")
			.append(" ,t2.tb_address_number")
			.append(" ,t2.tb_address_public_place")
			.append(" ,t2.tb_address_state")
			.append(" ,t2.tb_address_type")
			.append(" ,t2.tb_address_zip")
			.append("  FROM tb_customer t1 ")
			.append("  LEFT JOIN tb_address t2 ")
			.append("  ON t1.tb_customer_cpf = t2.tb_address_cpf ");

	

	
	
	
	
	/**
	 * MONTA CONSULTA PARA LISTAR DE CLIENTE	 * 
	 * @param sql
	 * @param params
	 * @return
	 * @throws Exception
	 * @throws Throwable
	 */
	private List<SelectCustomer> devolveListaObjetos(StringBuilder sql, SqlParameterSource params) throws Exception, Throwable {		
		return jdbcTemplate.query(sql.toString(), params, (rs, i) -> {
			
			SelectCustomer customer = new SelectCustomer();
			
			customer.setId(rs.getLong("id"));
			customer.setCpf(rs.getString("tb_customer_cpf"));
			customer.setName(rs.getString("tb_customer_name"));
			customer.setAddressPublicPlace(rs.getString("tb_address_public_place"));
			customer.setAddressComplement(rs.getString("tb_address_complement"));
			customer.setAddressNumber(rs.getInt("tb_address_number"));
			customer.setAddressDistrict(rs.getString("tb_address_district"));
			customer.setAddressCity(rs.getString("tb_address_city"));
			customer.setAddressState(rs.getString("tb_address_state"));
			customer.setAddressZip(rs.getString("tb_address_zip"));
			customer.setAddressType(rs.getString("tb_address_type"));			
			return customer;
		});	
	}
	
	
	/**
	 * MONTA CONSULTA DE CLIENTE POR ID
	 * @param sql
	 * @param params
	 * @return
	 * @throws Exception
	 * @throws Throwable
	 */
	private SelectCustomer devolveObjeto(StringBuilder sql, SqlParameterSource params) throws Exception, Throwable {
			return jdbcTemplate.queryForObject(sql.toString(), params, (rs, i) -> {
				
				SelectCustomer customer = new SelectCustomer();
				
				customer.setId(rs.getLong("id"));
				customer.setCpf(rs.getString("tb_customer_cpf"));
				customer.setName(rs.getString("tb_customer_name"));
				customer.setAddressPublicPlace(rs.getString("tb_address_public_place"));
				customer.setAddressComplement(rs.getString("tb_address_complement"));
				customer.setAddressNumber(rs.getInt("tb_address_number"));
				customer.setAddressDistrict(rs.getString("tb_address_district"));
				customer.setAddressCity(rs.getString("tb_address_city"));
				customer.setAddressState(rs.getString("tb_address_state"));
				customer.setAddressZip(rs.getString("tb_address_zip"));
				customer.setAddressType(rs.getString("tb_address_type"));			
				return customer;
			});
		}



	
	
	
	

}
