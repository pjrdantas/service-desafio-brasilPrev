package br.com.brasil.prev.repository.impl;



import java.util.List;

import org.aspectj.weaver.patterns.ParserException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.brasil.prev.dto.CustomerDto;
import br.com.brasil.prev.dto.SelectCustomerDto;
import br.com.brasil.prev.dto.UpdateAddressDto;
import br.com.brasil.prev.repository.Repository_brasilPrev;


@Transactional
@Repository
public class RepositoryImpl_brasilPrev implements Repository_brasilPrev {
	
	private static final Logger log = LoggerFactory.getLogger(RepositoryImpl_brasilPrev.class);
	
	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;

	@Override
	public void addCustomer(SelectCustomerDto customer) throws Exception, Throwable {
		StringBuilder sql = new StringBuilder();
		
		sql.append("  INSERT INTO ");
		sql.append("  tb_customer (");
		sql.append("  id");
		sql.append(" ,tb_customer_cpf");
		sql.append(" ,tb_customer_name) ");
		sql.append("  values (:id, :tbCustomerCpf, :tbCustomerName)");
		
		MapSqlParameterSource params = new MapSqlParameterSource()
				.addValue("id", customer.getId())
				.addValue("tbCustomerCpf", customer.getSelectCustomerCpfDto())
				.addValue("tbCustomerName", customer.getSelectCustomerNameDto());
				
		try {
			jdbcTemplate.update(sql.toString(), params);
			log.info("RepositoryImpl_brasilPrev.addCliente--------> CLIENTE INCLUIDO COM SUCESSO!");
		} catch (Exception e) {
		    log.error("RepositoryImpl_brasilPrev.addCliente--------> ERRO NA INCLUSÃO DO CLIENTE: " + e.toString());
		}
	}

	@Override
	public void addAddress(SelectCustomerDto customerDto) throws Exception, Throwable {
		StringBuilder sql = new StringBuilder();
		
		sql.append("  INSERT INTO ");
		sql.append("  tb_address (");
		sql.append("  id");
		sql.append(" ,tb_address_cpf ");
		sql.append(" ,tb_address_public_place");
		sql.append(" ,tb_address_complement");
		sql.append(" ,tb_address_number");
		sql.append(" ,tb_address_district");
		sql.append(" ,tb_address_city");
		sql.append(" ,tb_address_state");
		sql.append(" ,tb_address_zip");
		sql.append(" ,tb_address_type) ");
		sql.append("  values (:id,");
		sql.append(" :tbAddressCpf,");
		sql.append(" :tbAddressPublicPlace,");
		sql.append(" :tbAddressComplement,");
		sql.append(" :tbAddressNumber,");
		sql.append(" :tbAddressDistrict,");
		sql.append(" :tbAddressCity,");
		sql.append(" :tbAddressState,");
		sql.append(" :tbAddressZip,");
		sql.append(" :tbAddressType )");
		
		MapSqlParameterSource params = new MapSqlParameterSource()
				.addValue("id", customerDto.getId())
				.addValue("tbAddressCpf", customerDto.getSelectCustomerCpfDto())
				.addValue("tbAddressPublicPlace", customerDto.getSelectCustomerPublicPlaceDto())
				.addValue("tbAddressComplement", customerDto.getSelectCustomerComplementDto())
				.addValue("tbAddressNumber", customerDto.getSelectCustomerNumberDto())
				.addValue("tbAddressDistrict", customerDto.getSelectCustomerDistrictDto())
				.addValue("tbAddressCity", customerDto.getSelectCustomerCityDto())				
				.addValue("tbAddressState", customerDto.getSelectCustomerStateDto())
				.addValue("tbAddressZip", customerDto.getSelectCustomerZipDto())
				.addValue("tbAddressType", customerDto.getSelectCustomerTypeDto());
		try {
			jdbcTemplate.update(sql.toString(), params);
			log.info("RepositoryImpl_brasilPrev.addAddress--------> ENDEREÇO INCLUIDO COM SUCESSO!");
		} catch (Exception e) {
		    log.error("RepositoryImpl_brasilPrev.addAddress--------> ERRO NA INCLUSÃO DO ENDEREÇO: " + e.toString());
		}
	}

	@Override
	public void updateCustomer(CustomerDto customerDto) throws Exception, Throwable {

		StringBuilder sql = new StringBuilder();
		
		sql.append(" UPDATE tb_customer ");
		sql.append(" SET  ");
		sql.append(" tb_customer_cpf = :cpf, ");
		sql.append(" tb_customer_name = :name, ");
		sql.append(" WHERE id = :id");
		
		SqlParameterSource params = new MapSqlParameterSource()
				.addValue("id", customerDto.getId())
				.addValue("cpf", customerDto.getCustomerCpfDto())
				.addValue("name", customerDto.getCustomerNameDto());
				
		try {
			jdbcTemplate.update(sql.toString(), params);
			log.info("RepositoryImpl_brasilPrev.updateCustomer--------> CLIENTE ATUALIZADO COM SUCESSO!");
		} catch (Exception e) {
			log.error("RepositoryImpl_brasilPrev.updateCustomer----------------- ERRO NA ATUALIZAÇÃO DO CLIENTE: " + e.toString());
		}
	}

	@Override
	public void updateAddressDto(UpdateAddressDto updateAddressDto) throws Exception, Throwable {

		StringBuilder sql = new StringBuilder();
		
		sql.append(" UPDATE tb_address ");
		sql.append(" SET  ");
		sql.append(" tb_address_city = :cpf, ");
		sql.append(" tb_address_complement = :name, ");
		
		sql.append(" WHERE id = :id");
		
		SqlParameterSource params = new MapSqlParameterSource()
		.addValue("id", updateAddressDto.getId())
		.addValue("tbAddressCity", updateAddressDto.getUpdateAddressCityDto())
		.addValue("tbAddressComplement", updateAddressDto.getUpdateAddressComplementDto())
		.addValue("tbAddressCpf", updateAddressDto.getUpdateAddressCpfDto())
		.addValue("tbAddressDistrict", updateAddressDto.getUpdateAddressDistrictDto())
		.addValue("tbAddressNumber", updateAddressDto.getUpdateAddressNumberDto())
		.addValue("tbAddressPublicPlace", updateAddressDto.getUpdateAddressPublicPlaceDto())
		.addValue("tbaddressState", updateAddressDto.getUpdateAddressStateDto())
		.addValue("addressType", updateAddressDto.getUpdateAddressTypeDto())
		.addValue("tbaddressZip", updateAddressDto.getUpdateAddressZipCodeDto());
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
	public List<SelectCustomerDto> getAllCustomer() throws Exception, Throwable {

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
	 * CONSULTA CLIENTE POR CPF
	 * @param customerCpfDto
	 * @return
	 * @throws Exception
	 * @throws Throwable
	 */
	@Override
	public SelectCustomerDto getCustomerByCpf(String customerCpfDto) throws Exception, Throwable {
		
		try {
			StringBuilder sql = new StringBuilder(sqlSelectPrincipal);
			sql.append(" WHERE tb_customer_cpf = :tbCustomerCpf ");
			SqlParameterSource params = new MapSqlParameterSource().addValue("tbCustomerCpf", customerCpfDto);
			log.info("RepositoryImpl_brasilPrev.getCustomerByCpf--------> CLIENTE LOCALIZADO COM SUCESSO!!!");
			return devolveObjeto(sql, params);
		} catch (ParserException e) {
			log.error("RepositoryImpl_brasilPrev.getCustomerByCpf----------------- ERRO AO TENTAR LOCALIZAR O CLIENTE: " + e.toString());
		}
		return null;
	}

	/**
	 * EXCLUI CLIENTE POR CPF
	 */
	@Override
	public void deleteCustomer(String customerCpfDto) throws Exception, Throwable {

		StringBuilder sql1 = new StringBuilder();
		sql1.append(" DELETE FROM ");
		sql1.append(" tb_customer ");
		sql1.append(" WHERE tb_customer_cpf = :tbCustomerCpf");
		SqlParameterSource params = new MapSqlParameterSource().addValue("tbCustomerCpf", customerCpfDto);
		try {
			jdbcTemplate.update(sql1.toString(), params);
			log.info("RepositoryImpl_brasilPrev.deleteCustomer--------> USUARIO EXCLUIDO COM SUCESSO!!!");
		} catch (Exception e) {
			log.error("RepositoryImpl_brasilPrev.deleteCustomer----------------- ERRO NA EXCLUSÃO DO USUARIO! " + e.toString());
		}	
		
		
		StringBuilder sql2 = new StringBuilder();		
		sql2.append(" DELETE FROM ");
		sql2.append(" tb_address ");
		sql2.append(" WHERE tb_address_cpf = :tbAddressCpf");
		SqlParameterSource param = new MapSqlParameterSource().addValue("tbAddressCpf", customerCpfDto);
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
	private List<SelectCustomerDto> devolveListaObjetos(StringBuilder sql, SqlParameterSource params) throws Exception, Throwable {		
		return jdbcTemplate.query(sql.toString(), params, (rs, i) -> {
			
			SelectCustomerDto customer = new SelectCustomerDto();
			
			customer.setId(rs.getLong("id"));
			customer.setSelectCustomerCpfDto(rs.getString("tb_customer_cpf"));
			customer.setSelectCustomerNameDto(rs.getString("tb_customer_name"));
			customer.setSelectCustomerPublicPlaceDto(rs.getString("tb_address_public_place"));
			customer.setSelectCustomerComplementDto(rs.getString("tb_address_complement"));
			customer.setSelectCustomerNumberDto(rs.getInt("tb_address_number"));
			customer.setSelectCustomerDistrictDto(rs.getString("tb_address_district"));
			customer.setSelectCustomerCityDto(rs.getString("tb_address_city"));
			customer.setSelectCustomerStateDto(rs.getString("tb_address_state"));
			customer.setSelectCustomerZipDto(rs.getString("tb_address_zip"));
			customer.setSelectCustomerTypeDto(rs.getString("tb_address_type"));			
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
	private SelectCustomerDto devolveObjeto(StringBuilder sql, SqlParameterSource params) throws Exception, Throwable {
			return jdbcTemplate.queryForObject(sql.toString(), params, (rs, i) -> {
				
				SelectCustomerDto selectCustomerDto = new SelectCustomerDto();
				
				selectCustomerDto.setId(rs.getLong("id"));
				selectCustomerDto.setSelectCustomerCpfDto(rs.getString("tb_customer_cpf"));
				selectCustomerDto.setSelectCustomerNameDto(rs.getString("tb_customer_name"));
				selectCustomerDto.setSelectCustomerPublicPlaceDto(rs.getString("tb_address_public_place"));
				selectCustomerDto.setSelectCustomerComplementDto(rs.getString("tb_address_complement"));
				selectCustomerDto.setSelectCustomerNumberDto(rs.getInt("tb_address_number"));
				selectCustomerDto.setSelectCustomerDistrictDto(rs.getString("tb_address_district"));
				selectCustomerDto.setSelectCustomerCityDto(rs.getString("tb_address_city"));
				selectCustomerDto.setSelectCustomerStateDto(rs.getString("tb_address_state"));
				selectCustomerDto.setSelectCustomerZipDto(rs.getString("tb_address_zip"));
				selectCustomerDto.setSelectCustomerTypeDto(rs.getString("tb_address_type"));			
				return selectCustomerDto;
			});
		}



	
	
	
	

}
